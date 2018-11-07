package com.kodilla;

import java.util.HashMap;
import java.util.Map;

public class Kodilla3XI {
    private static Integer numberOfPairs(int[] array) {
        Map<Integer,Integer> numberMap = new HashMap<>();
        for(int i:array){
            if(numberMap.containsKey(i)){
                numberMap.put(i,numberMap.get(i)+1);
            }
            else{
                numberMap.put(i,1);
            }
        }
        int counter = 0;
        for(int n:numberMap.values()){
            counter = counter + n/2;
        }
        return counter;

    }
    public static void main(String args[]){
        int pair1 = numberOfPairs(new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20});
        int pair2 = numberOfPairs(new int[]{20, 20});
        int pair3 = numberOfPairs(new int[]{10, 20, 30, 40, 50});
        if(pair1 == 3 && pair2 == 1 && pair3 == 0) {
            System.out.println("Znaleziono poprawną liczbę par");
        } else {
            System.out.println("Znaleziono błędną liczbę par");
        }
    }
}
