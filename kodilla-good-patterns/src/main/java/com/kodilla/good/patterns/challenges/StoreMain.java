package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class StoreMain {
    public static void main(String args[]){
        MovieStore store = new MovieStore();
        String moviesList = store.getMovies().entrySet().stream()
                .map(entry -> entry.getValue())
                .flatMap(list -> list.stream())
                .collect(Collectors.joining("!","",""));
        System.out.println(moviesList);
    }
}
