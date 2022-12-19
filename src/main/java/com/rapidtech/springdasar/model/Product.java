package com.rapidtech.springdasar.model;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;

@Slf4j
public class Product {
    @PostConstruct
    public void created(){
        log.debug("Product is created");
    }
    public void destroyed() {
        log.debug("Product is destroyed");
    }
}
