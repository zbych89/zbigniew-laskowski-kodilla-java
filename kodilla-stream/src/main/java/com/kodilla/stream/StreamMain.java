package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier beautifier = new PoemBeautifier();
        beautifier.beautify("Hello, World!",text -> text + "It's me, Mario");
        beautifier.beautify("Some text",text -> "ABC " + text);
        beautifier.beautify("Put some text here:",text -> text.toUpperCase());
        beautifier.beautify("It doesn't matter what you put here",text -> "Default text");
    }
}