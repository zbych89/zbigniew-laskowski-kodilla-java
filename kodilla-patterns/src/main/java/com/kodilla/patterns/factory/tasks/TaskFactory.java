package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public final static String SHOPPING = "Shopping";
    public final static String PAINTING = "Painting";
    public final static String DRIVING = "Driving";

    public Task createTask(String taskType) {
        switch (taskType) {
            case SHOPPING:
                return new ShoppingTask("Shopping", "Book", 5);
            case PAINTING:
                return new PaintingTask("New look", "Green", "Wall");
            case DRIVING:
                return new DrivingTask("Take me home", "My flat", "Car");
            default:
                return null;
        }
    }
}
