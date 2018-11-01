package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightSearcher {
    public static void findFrom(String departure){
        FlightList.getFlights().stream()
                .filter(f -> f.getDeparture()==departure)
                .forEach(System.out::println);
    }
    public static void findTo(String arrival){
        FlightList.getFlights().stream()
                .filter(f -> f.getArrival()==arrival)
                .forEach(System.out::println);
    }
    public static void findThrough(String through){
        List<String> listOne = FlightList.getFlights().stream()
                .filter(f -> f.getArrival()==through)
                .map(f -> f.getDeparture())
                .collect(Collectors.toList());
        List<String> listTwo = FlightList.getFlights().stream()
                .filter(f -> f.getDeparture()==through)
                .map(f -> f.getArrival())
                .collect(Collectors.toList());
        List<DoubleFlight> finalList = new ArrayList<>();
        for(String departure : listOne){
            for(String arrival : listTwo){
                finalList.add(new DoubleFlight(departure,through,arrival));
            }
        }
        finalList.stream()
                .filter(d -> d.getFrom() != d.getTo())
                .forEach(System.out::println);
    }
}
