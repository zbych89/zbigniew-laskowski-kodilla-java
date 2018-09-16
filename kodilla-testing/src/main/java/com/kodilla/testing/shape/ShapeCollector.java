package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapeList = new ArrayList<Shape>();
    public void addFigure(Shape shape){
        this.shapeList.add(shape);
    }
    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (this.shapeList.contains(shape)){
            result = true;
            shapeList.remove(shape);
        }
        return result;
    }
    public Shape getFigure(int n) {
        if (n >= 0 && n < this.shapeList.size()) {
            return this.shapeList.get(n);
        }
        else {
            return null;
        }
    }
    public String showFigures(){
        String result = "";
        for (Shape shape : this.shapeList){
            result = result + shape.getShapeName() + shape.getField();
        }
        return result;
    }

    public ArrayList<Shape> getShapeList() {
        return shapeList;
    }
}
