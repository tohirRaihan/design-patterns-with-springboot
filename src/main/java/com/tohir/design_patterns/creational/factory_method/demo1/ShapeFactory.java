package com.tohir.design_patterns.creational.factory_method.demo1;

import java.util.Map;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
class ShapeFactory {
    private final Map<String, Shape> shapeMap;

    public Shape getShape(String shapeType) {
        return shapeMap.get(shapeType);
    }
    
}
