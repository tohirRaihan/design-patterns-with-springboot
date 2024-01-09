package com.tohir.design_patterns.creational.factory_method.demo1;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service(Ractangle.BEAN_ID)
class Ractangle implements Shape {
    public static final String BEAN_ID = "Ractangle";

    @Override
    public void draw() {
        log.info("Inside Rectange::draw() method");
    }
    
}
