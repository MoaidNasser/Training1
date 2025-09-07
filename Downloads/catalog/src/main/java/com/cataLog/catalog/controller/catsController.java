package com.cataLog.catalog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import com.cataLog.catalog.service.catsService;

@RestController
public class catsController {

    private final catsService catsservice;

    public catsController(catsService catsservice) {
        this.catsservice = catsservice;
    }


}
