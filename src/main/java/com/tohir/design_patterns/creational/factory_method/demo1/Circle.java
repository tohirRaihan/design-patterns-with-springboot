package com.tohir.design_patterns.creational.factory_method.demo1;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service(Circle.BEAN_ID)
class Circle implements Shape {
    public static final String BEAN_ID = "Circle";

    @Override
    public void draw() {
        log.info("Inside Circle::draw() method");
    }
    
}
