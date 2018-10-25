package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]){
        SecondChallenge secondChallenge = new SecondChallenge();
        try{
            String result = secondChallenge.probablyIWillThrowException(-3.2,4);
            System.out.println(result);
        }
        catch(Exception e){
            System.out.println("Something's wrong, try another parameters.");
        }
        finally{
            System.out.println("Thank you for using our application!");
        }
    }
}
