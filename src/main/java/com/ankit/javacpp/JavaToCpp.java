package com.ankit.javacpp;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaToCpp {

    public String convertJavaToCpp(String input){
        Set<Integer> capitalLettersIndexes = IntStream.range(0, input.length())
                .filter(i -> Character.isUpperCase(input.charAt(i)))
                .boxed().collect(Collectors.toSet());
        StringBuilder builder = new StringBuilder(input);
        capitalLettersIndexes.forEach(index-> {
            builder.insert(index,"_");
        });
        return builder.toString().toLowerCase();
    }
}
