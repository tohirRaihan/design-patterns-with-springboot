package com.tohir.design_patterns.creational.factory_method.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
class FactoryMethodApplication implements CommandLineRunner {

    @Autowired
	ShapeFactory shapeFactory;

	public static void main(String[] args) {
		SpringApplication.run(FactoryMethodApplication.class, args);
	}

	@Override
	public void run(String... args) {
		log.warn("----------------");
		shapeFactory.getShape(Circle.BEAN_ID).draw();
        shapeFactory.getShape(Ractangle.BEAN_ID).draw();
        shapeFactory.getShape(Square.BEAN_ID).draw();
		log.warn("----------------");
	}

}
