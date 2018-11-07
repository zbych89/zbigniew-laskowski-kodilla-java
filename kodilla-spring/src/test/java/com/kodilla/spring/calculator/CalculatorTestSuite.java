package com.kodilla.spring.calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double res1 = calculator.add(7,2);
        double res2 = calculator.sub(7,2);
        double res3 = calculator.mul(7,2);
        double res4 = calculator.div(7,2);
        //Then
        Assert.assertEquals(9.0,res1,0);
        Assert.assertEquals(5.0,res2,0);
        Assert.assertEquals(14.0,res3,0);
        Assert.assertEquals(3.5,res4,0);
    }
}
