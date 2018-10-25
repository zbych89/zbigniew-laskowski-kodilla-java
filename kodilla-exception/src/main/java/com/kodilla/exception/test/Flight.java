package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class Flight {
    private String departureAirport;
    private String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
    public static boolean findFlight(Flight flight) throws RouteNotFoundException{
        Map<String,Boolean> flightMap = new HashMap<String,Boolean>();
        flightMap.put("Katowice",true);
        flightMap.put("London",true);
        flightMap.put("Beijing",false);
        flightMap.put("Berlin",true);
        flightMap.put("North Pole",false);
        if(flightMap.containsKey(flight.getArrivalAirport())) {
            return flightMap.get(flight.getArrivalAirport());
        }
        else{
            throw new RouteNotFoundException();
        }
    }
}
