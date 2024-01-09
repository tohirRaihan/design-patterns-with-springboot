package com.tohir.design_patterns.creational.factory_method.demo1;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service(Square.BEAN_ID)
class Square implements Shape {
    public static final String BEAN_ID = "Square";

    @Override
    public void draw() {
        log.info("Inside Square::draw() method");
    }
    
}
