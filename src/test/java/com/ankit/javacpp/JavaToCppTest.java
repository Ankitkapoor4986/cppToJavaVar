package com.ankit.javacpp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaToCppTest {

    JavaToCpp javaToCpp = new JavaToCpp();

    @Test
    public void shouldConvertJavaToCpp(){
        Assertions.assertEquals("test_variable", javaToCpp.convertJavaToCpp("testVariable"));


    }
}