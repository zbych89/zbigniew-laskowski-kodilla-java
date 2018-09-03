package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i : numbers){
            if(i%2 == 0){
                result.add(i);
            }
        }
        return result;
    }
}
