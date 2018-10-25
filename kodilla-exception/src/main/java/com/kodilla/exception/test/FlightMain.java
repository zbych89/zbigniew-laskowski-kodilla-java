package com.kodilla.exception.test;

public class FlightMain {
    public static void main(String args[]){
        Flight flight = new Flight("Tokyo","Paris");
        try {
            boolean canYouGoThere = Flight.findFlight(flight);
            System.out.println(canYouGoThere);
        }
        catch (RouteNotFoundException e){
            System.out.println("Selected airport is not supported");
        }
        finally {
            System.out.println("Have a nice flight!");
        }
    }
}
