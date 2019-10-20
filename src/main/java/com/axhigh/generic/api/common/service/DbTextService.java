package com.axhigh.generic.api.common.service;

import com.axhigh.generic.api.common.Domain;
import com.axhigh.generic.api.common.dao.DbTextDao;
import com.axhigh.generic.api.common.entity.DbText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DbTextService {

    @Autowired
    private DbTextDao loveTextDao;

    @Transactional
    public List<DbText> list(Domain domain){
        return loveTextDao.list(domain);
    }

    /*
    @Transactional
    public Integer insertOK(){
        LoveText test = new LoveText();
        test.setText("text"+new Date().getTime());
        return loveTextDao.insert(test);
    }

    @Transactional
    public void insertAndFail(){
        LoveText test = new LoveText();
        test.setText("username"+new Date().getTime());
        loveTextDao.insert(test);

        throw new RuntimeException("Hello this is an error message");
    }
     */

}