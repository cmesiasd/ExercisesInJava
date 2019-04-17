package com.cc3002.doubledispatch;

import com.cc3002.patterns.doubledispatch.distances.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class TestDistances {
    private IMedicion metros100;

    @Before
    public void setUp(){
        metros100 = new Meters(100);
    }
    @Test
    public void testNotNull() {
        assertNotNull(metros100);
    }

    @Test
    public void testMetrosValue() {
        assertEquals(100., metros100.getDist());
    }

    @Test
    public void testMetrosMetros() {
        IMedicion metros50 = new Meters(50);
        IMedicion metros150 = metros100.add(metros50);
        assertEquals(150., metros150.getDist());
    }

    @Test
    public void testMetrosPulgadas() {
        IMedicion pulgadas100 = new Inches(100);
        IMedicion metrosapp = metros100.add(pulgadas100);
        assertEquals(102.5, metrosapp.getDist(), 0.1);
    }

    @Test
    public void testPulgadasMetros() {
        IMedicion pulgadas10 = new Inches(10);
        IMedicion pulgadasApp = pulgadas10.add(metros100);
        assertEquals(3947, pulgadasApp.getDist(), 0.1);
    }
}

