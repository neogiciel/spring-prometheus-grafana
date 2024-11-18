package com.neogiciel.spring_prometheus_grafana.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.slf4j.Logger;

@RestController()
@RequestMapping(value = "/api")
public class ApiController {
    
    Logger logger = LoggerFactory.getLogger(ApiController.class);

    @GetMapping
    @RequestMapping("/") 
    public String home() {
        return "index";
    }

    @GetMapping
    @RequestMapping("/v1")
    public String v1(){
        logger.info("application v1");
        return "application v1";
    }

    @GetMapping
    @RequestMapping("/v2")
    public String v2(){
        logger.info("application v2");
        return "application v2";
    }

    @GetMapping
    @RequestMapping("/param")
    public String param(@RequestParam String test){
        logger.info("Parametre entree : test= "+test);
        return "test = "+test;
    }

}


