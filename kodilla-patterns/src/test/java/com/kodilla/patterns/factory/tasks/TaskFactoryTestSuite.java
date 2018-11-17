package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask(){
        TaskFactory factory = new TaskFactory();
        Task shopping = factory.createTask(TaskFactory.SHOPPING);
        Assert.assertEquals("Shopping",shopping.getTaskName());
        Assert.assertFalse(shopping.isTaskExecuted());
    }
    @Test
    public void testPaintingTask(){
        TaskFactory factory = new TaskFactory();
        Task painting = factory.createTask(TaskFactory.PAINTING);
        Assert.assertEquals("New look",painting.getTaskName());
        Assert.assertFalse(painting.isTaskExecuted());
    }
    @Test
    public void testDrivingTask(){
        TaskFactory factory = new TaskFactory();
        Task driving = factory.createTask(TaskFactory.DRIVING);
        driving.executeTask();
        Assert.assertEquals("Take me home",driving.getTaskName());
        Assert.assertTrue(driving.isTaskExecuted());
    }
}
