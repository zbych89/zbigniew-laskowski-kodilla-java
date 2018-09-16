package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    @BeforeClass
    public static void beforeTests(){
        System.out.println("Beginning the tests");
    }
    @AfterClass
    public static void afterTests(){
        System.out.println("Tests finished");
    }
    @Before
    public void beforeEach(){
        testCounter++;
        System.out.println("Running test " + testCounter);
    }
    @Test
    public void testAddFigure(){
        ShapeCollector theShapes = new ShapeCollector();
        theShapes.addFigure(new Circle(3));
        ArrayList<Shape> theList = theShapes.getShapeList();
        Assert.assertEquals(1,theList.size());
    }
    @Test
    public void testRemoveFigure(){
        ShapeCollector theShapes = new ShapeCollector();
        theShapes.addFigure(new Square(7));
        boolean result = theShapes.removeFigure(new Square(7));
        ArrayList<Shape> theList = theShapes.getShapeList();
        Assert.assertTrue(result);
        Assert.assertEquals(0,theList.size());
    }
    @Test
    public void testGetShape(){
        ShapeCollector theShapes = new ShapeCollector();
        theShapes.addFigure(new Triangle(4,7));
        Shape shape = theShapes.getFigure(0);
        Assert.assertEquals("Triangle",shape.getShapeName());
    }
    @Test
    public void testShowFigures(){
        ShapeCollector theShapes = new ShapeCollector();
        theShapes.addFigure(new Square(4));
        String shownFigure = theShapes.showFigures();
        Assert.assertEquals("Square" + 16.0,theShapes.showFigures());
    }
}
