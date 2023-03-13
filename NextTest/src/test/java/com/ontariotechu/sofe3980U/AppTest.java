package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertTrue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void invalidYear(){
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
    }
    public void invalidMonth(){
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
    }
    public void invalidDay(){
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
    }
    public void validNextDate(){
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
    }
    public void validNextMonth(){
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");

    }
    public void validNextYear(){
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");

    }
    public void LeapYear(){
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");

    }
    public void NonLeapYear(){
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");

    }
}
