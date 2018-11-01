package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public final class FlightList {

    public static List<Flight> getFlights() {
        final List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Gdansk","Krakow"));
        flights.add(new Flight("Gdansk","Radom"));
        flights.add(new Flight("Gdansk","Warsaw"));
        flights.add(new Flight("Warsaw","Krakow"));
        flights.add(new Flight("Warsaw","Katowice"));
        flights.add(new Flight("Warsaw","Wroclaw"));
        flights.add(new Flight("Katowice","Wroclaw"));
        flights.add(new Flight("Katowice","Warsaw"));
        flights.add(new Flight("Krakow","Radom"));
        flights.add(new Flight("Krakow","Warsaw"));
        flights.add(new Flight("Krakow","Gdansk"));
        return new ArrayList<Flight>(flights);
    }
}
