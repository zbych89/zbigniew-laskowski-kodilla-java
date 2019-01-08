package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkTestSuite {
    @Test
    public void testObservers(){
        //Given
        Homework worksBySteve = new HomeworksBySteve();
        Homework worksbyJohn = new HomeworksByJohn();
        Homework worksByMark = new HomeworksByMark();
        Mentor mike = new Mentor("Mike");
        Mentor helen = new Mentor("Helen");
        worksBySteve.registerObserver(mike);
        worksbyJohn.registerObserver(helen);
        worksByMark.registerObserver(mike);
        worksByMark.registerObserver(helen);
        //Then
        worksbyJohn.addWork("While loop");
        worksByMark.addWork("For loop");
        worksByMark.addWork("While loop");
        worksBySteve.addWork("Stream exercise");
        worksBySteve.addWork("Spring");
        //Then
        Assert.assertEquals(4,mike.getUpdateCount());
        Assert.assertEquals(3,helen.getUpdateCount());
    }
}
