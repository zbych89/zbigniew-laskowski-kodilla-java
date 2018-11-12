package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger logger = Logger.getInstance();
    @BeforeClass
    public static void addLog(){
        logger.log("Testlog");
    }
    @Test
    public void testGetLastLog(){
        String log = logger.getLastLog();
        Assert.assertEquals("Testlog",log);
    }
}
