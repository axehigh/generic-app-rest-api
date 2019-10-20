package com.axhigh.generic.api.common.entity;

import lombok.Data;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

@Data
public class DbText {
    long id;
    String text;

    public DbText(ResultSet r) throws SQLException {
        this.setId( r.getLong("id"));
        this.setText(r.getString("text"));

    }


    public static class DbTextMapper implements ResultSetMapper<DbText> {
        @Override
        public DbText map(int i, ResultSet r, StatementContext statementContext) throws SQLException {
            return new DbText(r);
        }
    }

}
