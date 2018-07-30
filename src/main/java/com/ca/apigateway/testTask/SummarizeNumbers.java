package com.ca.apigateway.testTask;

interface SummarizeNumbersInterface {
    Integer sum(Integer a, Integer b) throws Exception;
}

/**
 * The {@code SummarizeNumbers} class is a test Task that has a single function
 * that returns a sum of two integers. Both arguments must be within a certain range
 * defined by {@code SummarizeNumbers.MIN} and {@code SummarizeNumbers.MAX} constants
 *
 * @author Ivan Satsiuk
 * @version 1.0
 */
public class SummarizeNumbers implements SummarizeNumbersInterface {

    /**
     * Range Maximum
     */
    public static final Integer MAX = 1000;

    /**
     * Range Minimum
     */
    public static final Integer MIN = -1000;

    /**
     * Returns true if value is within the range
     *
     * @param value value to be validated
     * @return boolean true/false if in the range
     */
    private boolean inRange(Integer value) {
        return (value <= MAX && value >= MIN);
    }

    /**
     * Returns a sum of two integers
     *
     * @param a first argument
     * @param b second argument
     * @return result of a sum of two arguments
     * @throws IllegalArgumentException if either arguments is outside of a predefined range
     */

    public Integer sum(Integer a, Integer b) throws IllegalArgumentException {


        if (!inRange(a) || !inRange(b)) {
            throw new IllegalArgumentException("Please make sure both arguments are within the range "
                    + MAX.toString() + " ... " + MIN.toString());
        }
        Integer out = a + b;
        return out;
    }

}
