package com.axhigh.generic.api.romantic.controller;

import com.axhigh.generic.api.common.Domain;
import com.axhigh.generic.api.common.entity.DbText;
import com.axhigh.generic.api.common.service.DbTextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller(value="/romantic")
public class RomanticController {

    @Autowired
    DbTextService dbTextService;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResponseEntity list() {

        List<DbText> list = dbTextService.list(Domain.LOVE);
        ResponseEntity responseEntity = new ResponseEntity(list, HttpStatus.OK);
        return responseEntity;

    }

}
