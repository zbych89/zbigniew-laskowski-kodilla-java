package com.kodilla;

import java.util.*;

public class DuplicateSearch {
    public int duplicateSearch(List<Integer> list){
        List<Integer> someList = new ArrayList<Integer>();
        for (int number : list){
            if(someList.contains(number)){
                return number;
            }
            else{
                someList.add(number);
            }
        }
        return 0;
    }
    public int secondSearch(List<Integer> list) {
        int sum = 0;
        int expectedSum = (1 +(list.size()-1)) * (list.size()-1) / 2;
        for (int number : list) {
            sum += number;
        }
        return sum-expectedSum;
    }
    public static void main(String[] args){
        DuplicateSearch searcher = new DuplicateSearch();
        List<Integer> list = Arrays.asList(3,5,2,4,7,6,5,1);
        long startTime = 0;
        long endTime = 0;
        int result = 0;
        startTime = System.nanoTime();
        result = searcher.duplicateSearch(list);
        endTime = System.nanoTime();
        System.out.println(result);
        System.out.println("Time = " + (endTime - startTime));
        startTime = System.nanoTime();
        result = searcher.secondSearch(list);
        endTime = System.nanoTime();
        System.out.println(result);
        System.out.println("Time = " + (endTime - startTime));
    }
}

