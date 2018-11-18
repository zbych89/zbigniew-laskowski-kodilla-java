package com.kodilla;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Main {
    public static int getCountEmptyStringUsingJava8(List<String> strings){
        return (int) strings.stream()
                .filter(s -> s.length()==0)
                .count();
    }
    public static int getCountLength3UsingJava8(List<String> strings) {
        return (int) strings.stream()
                .filter(s -> s.length() == 3)
                .count();
    }
    public static List<String> deleteEmptyStringsUsingJava8(List<String> strings){
        return strings.stream()
                .filter(s -> s.length()!=0)
                .collect(Collectors.toList());
    }
    public static String getMergedStringUsingJava8(List<String> strings, String delimiter){
        return strings.stream()
                .filter(s -> s.length()!=0)
                .collect(Collectors.joining(delimiter));
    }
    public static List<Integer> getSquaresJava8(List<Integer> numbers){
        return numbers.stream()
                .map(n -> n*n)
                .distinct()
                .collect(Collectors.toList());
    }
    public static int getMaxJava8(List<Integer> numbers){
        OptionalInt result = numbers.stream()
                .mapToInt(n -> n)
                .max();
        return result.getAsInt();
    }
    public static int getMinJava8(List<Integer> numbers){
        OptionalInt result = numbers.stream()
                .mapToInt(n -> n)
                .min();
        return result.getAsInt();
    }
    public static int getSumJava8(List<Integer> numbers){
        return numbers.stream()
                .mapToInt(n -> n)
                .sum();
    }
    public static int getAverageJava8(List<Integer> numbers){
        OptionalDouble result = numbers.stream()
                .mapToInt(n -> n)
                .average();
        return (int) result.getAsDouble();
    }
}
