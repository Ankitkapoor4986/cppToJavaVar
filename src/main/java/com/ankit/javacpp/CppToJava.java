package com.ankit.javacpp;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CppToJava {

    public String convertCppToJava(String input){

        Set<Integer> indexToCapitalize = IntStream.range(0, input.length())
                .filter(i -> input.charAt(i) == '_')
                .map(i -> i + 1)
                .boxed()
                .collect(Collectors.toSet());


        char[] inputChars = input.toLowerCase().toCharArray();
        indexToCapitalize.forEach(index->{
            char inputChar = inputChars[index];
            char upperCaseInputChar = Character.toUpperCase(inputChar);
            inputChars[index] = upperCaseInputChar;
        });


        return String.valueOf(inputChars).replaceAll("_","");
    }
}
