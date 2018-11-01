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
                if(!(departure.equals(arrival))) {
                    finalList.add(new Flight(departure, through));
                    finalList.add(new Flight(through, arrival));
                }
            }
        }
        System.out.println("Available flighs through " + through);
        finalList.stream()
                .forEach(System.out::println);
    }
}
