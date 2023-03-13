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
        assertEquals(NextDate.Date(3021, 12, 24), "Invalid year entered!");
        assertEquals(NextDate.Date(2222, 10, 29), "Invalid year entered!");
        assertEquals(NextDate.Date(1800, 7, 10), "Invalid year entered!");
        assertEquals(NextDate.Date(1000, 5, 23), "Invalid year entered!");
    }
    @Test
    public void invalidMonth(){
        assertEquals(NextDate.Date(2021, 13, 25), "Invalid month entered!");
        assertEquals(NextDate.Date(2000, -2, 2), "Invalid month entered!");
        assertEquals(NextDate.Date(1999, 29, 7), "Invalid month entered!");
        assertEquals(NextDate.Date(1854, 77, 19), "Invalid month entered!");
    }
    @Test
    public void invalidDay(){
        assertEquals(NextDate.Date(1967, 3, -12), "Invalid day entered!");
        assertEquals(NextDate.Date(1965, 10, -8), "Invalid day entered!");
        assertEquals(NextDate.Date(2005, 8, 67), "Invalid day entered!");
        assertEquals(NextDate.Date(2003, 11, 44), "Invalid day entered!");
    }
    @Test
    public void validNextDate(){
        assertEquals(NextDate.Date(2002, 10, 28), "2002/10/29");
        assertEquals(NextDate.Date(1989, 12, 6), "1989/12/7");
        assertEquals(NextDate.Date(1990, 2, 2), "1990/2/3");
        assertEquals(NextDate.Date(2001, 3, 6), "2001/3/7");
    }
    @Test
    public void validNextMonth(){
        assertEquals(NextDate.Date(2024, 5, 31), "2024/6/1");
        assertEquals(NextDate.Date(2002, 6, 30), "2002/7/1");
        assertEquals(NextDate.Date(2013, 10, 31), "2013/11/1");
        assertEquals(NextDate.Date(2050, 4, 30), "2050/5/1");

    }
    @Test
    public void validNextYear(){
        assertEquals(NextDate.Date(2020, 12, 31), "2021/1/1");
        assertEquals(NextDate.Date(2017, 12, 31), "2018/1/1");
        assertEquals(NextDate.Date(1976, 12, 31), "1977/1/1");
        assertEquals(NextDate.Date(2212, 12, 31), "Beyond Range");

    }
    @Test
    public void LeapYear(){
        assertEquals(NextDate.Date(1908, 2, 28), "1908/2/29");
        assertEquals(NextDate.Date(1996, 2, 28), "1996/2/29");
        assertEquals(NextDate.Date(2024, 2, 28), "2024/2/29");
        assertEquals(NextDate.Date(2056, 2, 31), "Invalid Leap Year Entry");

    }
    @Test
    public void NonLeapYear(){
        assertEquals(NextDate.Date(2005, 2, 28), "2005/3/1");
        assertEquals(NextDate.Date(1899, 2, 28), "1899/3/1");
        assertEquals(NextDate.Date(2037, 2, 28), "2037/3/1");
        assertEquals(NextDate.Date(1973, 2, 29), "Invalid Non-Leap Year Entry");

    }
}
