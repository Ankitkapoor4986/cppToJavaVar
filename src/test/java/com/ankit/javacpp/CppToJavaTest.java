package com.ankit.javacpp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CppToJavaTest {

    CppToJava cppToJava = new CppToJava();

    @Test
    public void shouldConvertCppToJava(){
        String cppStr="test_variable";
        Assertions.assertEquals("testVariable",cppToJava.convertCppToJava(cppStr));

    }

    @Test
    public void shouldConvertCppToJavaAnotherTest(){
        String cppStr="test_variable_variable";
        Assertions.assertEquals("testVariableVariable",cppToJava.convertCppToJava(cppStr));

    }



}
