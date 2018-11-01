package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightSearcher {
    public static void findFrom(String departure){
        FlightList.getFlights().stream()
                .filter(f -> f.getDeparture().equals(departure))
                .forEach(System.out::println);
    }
    public static void findTo(String arrival){
        FlightList.getFlights().stream()
                .filter(f -> f.getArrival().equals(arrival))
                .forEach(System.out::println);
    }
    public static void findThrough(String through){
        List<String> listOne = FlightList.getFlights().stream()
                .filter(f -> f.getArrival().equals(through))
                .map(f -> f.getDeparture())
                .collect(Collectors.toList());
        List<String> listTwo = FlightList.getFlights().stream()
                .filter(f -> f.getDeparture().equals(through))
                .map(f -> f.getArrival())
                .collect(Collectors.toList());
        List<Flight> finalList = new ArrayList<>();
        for(String departure : listOne){
            for(String arrival : listTwo){
                finalList.add(new Flight(departure,arrival));
            }
        }
        System.out.println("Available flighs through " + through);
        finalList.stream()
                .filter(f -> !(f.getDeparture().equals(f.getArrival())))
                .forEach(System.out::println);
    }
}
