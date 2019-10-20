package com.axhigh.generic.api.common.service;

import com.axhigh.generic.api.common.Domain;
import com.axhigh.generic.api.common.entity.DbText;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DbTextServiceTest {
    @Autowired
    DbTextService dbTextService;


    @Test
    public void test() {
        List<DbText> list = dbTextService.list(Domain.LOVE);
        assertThat(list.size()).isGreaterThan(0);
    }
}