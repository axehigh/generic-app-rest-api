package com.axhigh.generic.api.common.dao;


import com.axhigh.generic.api.common.Domain;
import com.axhigh.generic.api.common.entity.DbText;
import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.Handle;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;

@Repository
public class DbTextDao {

    @Qualifier("dataSource")
    @Autowired
    private DataSource dataSource;

    public List<DbText> list(Domain domain){
        Connection conn =  DataSourceUtils.getConnection(dataSource);
        Handle handle = DBI.open(conn);
        DbTextSQLs sql = handle.attach(DbTextSQLs.class);
        return sql.list(domain.toString());
    }
/*
    public Integer insert(LoveText item){
        Connection conn =  DataSourceUtils.getConnection(dataSource);
        Handle handle = DBI.open(conn);
        LoveTextSQLs userSQLs = handle.attach(LoveTextSQLs.class);
        return userSQLs.insert(item);
    }
*/
    @RegisterMapper(DbText.DbTextMapper.class)
    interface DbTextSQLs {
        @SqlQuery("select * from app_text where domain = :domain")
        List<DbText> list(@Bind ("domain") String domain);

        /*
        @SqlUpdate("insert into  (username)" +
                " values(:username) ")
        @GetGeneratedKeys
        Integer insert(@BindBean LoveText test);

         */
    }



}
