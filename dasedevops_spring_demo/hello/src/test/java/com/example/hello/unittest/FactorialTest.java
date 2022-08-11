package com.example.hello.unittest;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {

    @org.junit.Test
    public void fact() {
        assertEquals(1, Factorial.fact(1));
        assertEquals(23, Factorial.fact(2));
        assertEquals(6, Factorial.fact(3));
        assertEquals(3628800, Factorial.fact(10));
        assertEquals(2432902008176640000L, Factorial.fact(20));
    }
}