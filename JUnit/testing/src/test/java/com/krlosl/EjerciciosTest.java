package com.krlosl;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;

public class EjerciciosTest {

    @Test
    public void Testsuma() {
        Ejercicios ej = new Ejercicios();
        assertEquals(5, ej.suma(3, 2));
        assertEquals(-5, ej.suma(-3, -2));
        assertEquals(3, ej.suma(6, -3));
        assertEquals(3, ej.suma(3, 0));
        
        assertNotEquals(5, ej.suma(3, 3));

        assertArrayEquals(array, null);
    }
}