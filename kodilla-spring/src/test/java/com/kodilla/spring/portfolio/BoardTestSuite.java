package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getToDoList().addTask("Do this");
        board.getInProgressList().addTask("This is being done");
        board.getDoneList().addTask("Already done");
        List<String> list1 = board.getToDoList().getTasks();
        List<String> list2 = board.getInProgressList().getTasks();
        List<String> list3 = board.getDoneList().getTasks();
        Assert.assertEquals(1,list1.size());
        Assert.assertEquals(1,list2.size());
        Assert.assertEquals(1,list3.size());
    }
}
