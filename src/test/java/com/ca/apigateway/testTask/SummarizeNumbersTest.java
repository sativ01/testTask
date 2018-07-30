package com.ca.apigateway.testTask;

import org.junit.Test;

import static org.junit.Assert.*;

public class SummarizeNumbersTest {

    @Test
    public void sumPositive() {
        Integer a = 10;
        Integer b = 20;
        SummarizeNumbers sn = new SummarizeNumbers();
        assertEquals(sn.sum(a, b), (Integer) (30));
    }

    @Test
    public void sumNegative() {
        Integer a = -10;
        Integer b = -20;
        SummarizeNumbers sn = new SummarizeNumbers();
        assertEquals(sn.sum(a, b), (Integer) (-30));
    }

    @Test
    public void sumMaxPlusOne() {
        Integer a = SummarizeNumbers.MAX;
        Integer b = 1;
        SummarizeNumbers sn = new SummarizeNumbers();
        assertEquals(sn.sum(a, b), (Integer) (SummarizeNumbers.MAX + 1));
    }

    @Test
    public void sumMinMinusOne() {
        Integer a = SummarizeNumbers.MIN;
        Integer b = -1;
        SummarizeNumbers sn = new SummarizeNumbers();
        assertEquals(sn.sum(a, b), (Integer) (SummarizeNumbers.MIN - 1));
    }

    @Test
    public void sumMaxPlusMax() {
        Integer a = SummarizeNumbers.MAX;
        Integer b = SummarizeNumbers.MAX;
        SummarizeNumbers sn = new SummarizeNumbers();
        assertEquals(sn.sum(a, b), (Integer) (SummarizeNumbers.MAX + SummarizeNumbers.MAX));
    }

    @Test
    public void sumMinPlusMin() {
        Integer a = SummarizeNumbers.MIN;
        Integer b = SummarizeNumbers.MIN;
        SummarizeNumbers sn = new SummarizeNumbers();
        assertEquals(sn.sum(a, b), (Integer) (SummarizeNumbers.MIN + SummarizeNumbers.MIN));
    }

    @Test(expected = IllegalArgumentException.class)
    public void sumFirstOutOfRange() {
        Integer a = SummarizeNumbers.MAX + 1;
        Integer b = 1;
        SummarizeNumbers sn = new SummarizeNumbers();
        sn.sum(a, b);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sumSecondOutOfRange() {
        Integer a = 1;
        Integer b = SummarizeNumbers.MAX + 1;
        SummarizeNumbers sn = new SummarizeNumbers();
        sn.sum(a, b);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sumAllOutOfRange() {
        Integer a = SummarizeNumbers.MAX + 1;
        Integer b = SummarizeNumbers.MAX + 1;
        SummarizeNumbers sn = new SummarizeNumbers();
        sn.sum(a, b);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sumAllOutOfRange2() {
        Integer a = SummarizeNumbers.MIN - 1;
        Integer b = SummarizeNumbers.MIN - 1;
        SummarizeNumbers sn = new SummarizeNumbers();
        sn.sum(a, b);
    }
}