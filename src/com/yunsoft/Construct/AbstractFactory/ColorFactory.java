package com.yunsoft.Construct.AbstractFactory;

public class ColorFactory implements AbstractFactory<Color>{

    @Override
    public Color create(String type) {
        if("Brown".equalsIgnoreCase(type)){
            return new Brown();
        }else if("White".equalsIgnoreCase(type)){
            return new White();
        }
        return null;
    }
}
