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
        assertEquals(NextDate.Date(2222, 10, 29), "Invalid Year Value");
        assertEquals(NextDate.Date(3232, 7, 10), "Invalid Year Value");
        assertEquals(NextDate.Date(1000, 5, 23), "Invalid Year Value");
    }
    public void invalidMonth(){
        assertEquals(NextDate.Date(2021, 13, 25), "Invalid Month Value");
        assertEquals(NextDate.Date(2000, -2, 2), "Invalid Month Value");
        assertEquals(NextDate.Date(1999, 29, 7), "Invalid Month Value");
        assertEquals(NextDate.Date(1854, 77, 19), "Invalid Month Value");
    }
    public void invalidDay(){
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Day Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Day Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Day Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Day Value");
    }
    public void validNextDate(){
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid Year Value");
    }
    public void validNextMonth(){
        assertEquals(NextDate.Date(2024, 5, 31), "Invalid Year Value");
        assertEquals(NextDate.Date(2002, 6, 30), "Invalid Year Value");
        assertEquals(NextDate.Date(2013, 10, 31), "Invalid Year Value");
        assertEquals(NextDate.Date(2050, 4, 30), "Invalid Year Value");

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
