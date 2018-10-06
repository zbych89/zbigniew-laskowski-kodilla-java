package com.kodilla.testing.forum.statistics;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    Statistics statisticsMock = mock(Statistics.class);
    @Test
    public void testZeroPostCount(){
        when(statisticsMock.postsCount()).thenReturn(0);
        StatCounter statCounter = new StatCounter();
        statCounter.calculateAdvStatistics(statisticsMock);
        double result1 = statCounter.postsPerUser;
        double result2 = statCounter.commentsPerPost;
        Assert.assertEquals(0.0,result1,0.001);
        Assert.assertEquals(0.0,result2,0.001);
    }
    @Test
    public void testThousandPostCount(){
        when(statisticsMock.postsCount()).thenReturn(1000);
        StatCounter statCounter = new StatCounter();
        statCounter.calculateAdvStatistics(statisticsMock);
        int result = statCounter.postsCount;
        Assert.assertEquals(1000,result);
    }
    @Test
    public void testZeroCommentCount(){
        when(statisticsMock.commentsCount()).thenReturn(0);
        StatCounter statCounter = new StatCounter();
        statCounter.calculateAdvStatistics(statisticsMock);
        int result1 = statCounter.commentsCount;
        double result2 = statCounter.commentsPerPost;
        double result3 = statCounter.commentsPerUser;
        Assert.assertEquals(0,result1);
        Assert.assertEquals(0.0,result2,0.001);
        Assert.assertEquals(0.0,result3,0.001);
    }
    @Test
    public void testMorePostsThanComments(){
        when(statisticsMock.postsCount()).thenReturn(15);
        when(statisticsMock.commentsCount()).thenReturn(10);
        StatCounter statCounter = new StatCounter();
        statCounter.calculateAdvStatistics(statisticsMock);
        double result = statCounter.commentsPerPost;
        Assert.assertTrue(result < 1.0);
    }
    @Test
    public void testLessPostsThanComments(){
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(15);
        StatCounter statCounter = new StatCounter();
        statCounter.calculateAdvStatistics(statisticsMock);
        double result = statCounter.commentsPerPost;
        Assert.assertTrue(result > 1.0);
    }
    @Test
    public void testZeroUserCount(){
        StatCounter statCounter = new StatCounter();
        statCounter.calculateAdvStatistics(statisticsMock);
        int result1 = statCounter.usersCount;
        double result2 = statCounter.commentsPerUser;
        double result3 = statCounter.postsPerUser;
        Assert.assertEquals(0,result1);
        Assert.assertEquals(0.0,result2,0.001);
        Assert.assertEquals(0.0,result3,0.001);
    }
    @Test
    public void testHundredUserCount(){
        List<String> userList = new ArrayList<String>();
        for(int i=0;i<100;i++){
            userList.add("A random guy");
        }
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(15);
        StatCounter statCounter = new StatCounter();
        statCounter.calculateAdvStatistics(statisticsMock);
        int result1 = statCounter.usersCount;
        int result2 = statCounter.postsCount;
        int result3 = statCounter.commentsCount;
        double result4 = statCounter.postsPerUser;
        double result5 = statCounter.commentsPerUser;
        double result6 = statCounter.commentsPerPost;
        Assert.assertEquals(100,result1);
        Assert.assertEquals(10,result2);
        Assert.assertEquals(15,result3);
        Assert.assertEquals(0.1,result4,0.001);
        Assert.assertEquals(0.15,result5,0.001);
        Assert.assertEquals(1.5,result6,0.001);
    }
}
