package com.yunsoft.Construct;

public class ShapeFactory {
    // use getShpe method to get object of type shape
    public Shape getShape(String shapeType){
        if(null == shapeType){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
