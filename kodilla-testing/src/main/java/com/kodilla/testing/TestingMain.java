package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Calculator test 6.2");
        Calculator calculator = new Calculator();
        int res1 = calculator.add(7, 12);
        int res2 = calculator.substract(4, 10);
        if (res1 == 19) {
            System.out.println("Addition OK");
        } else {
            System.out.println("Addition error!");
        }
        if(res2==-6){
            System.out.println("Substraction OK");
        }
        else{
            System.out.println("Substraction error!");
        }
    }
}