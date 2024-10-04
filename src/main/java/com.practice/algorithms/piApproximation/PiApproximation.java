package com.practice.algorithms.piApproximation;

public class PiApproximation {

    public static void MonteCarloMethod() {
/**
 * Approximates the value of π (pi) using the Monte Carlo method.
 *
 * The Monte Carlo method is a statistical technique that uses random sampling
 * to obtain numerical results. In this case, it estimates the value of π by
 * simulating random points within a square that bounds a quarter circle.
 * The ratio of points that land inside the quarter circle to the total
 * number of points generated is used to approximate π. This approach relies
 * on the principle that the area of the quarter circle is proportional to
 * the area of the square.
 *
 * The formula for estimating π based on this method is:
 * π ≈ 4 * (number of points inside the quarter circle) / (total number of points)
 *
 * @param totalPoints the total number of random points to simulate; a higher
 *                    number increases the accuracy of the approximation
 * @return the estimated value of π based on the simulation
 * @throws IllegalArgumentException if totalPoints is less than or equal to zero
 */


//Todo

    }

    public static void LeibnizFormla() {
/**
 * Approximates the value of π (pi) using the Leibniz formula.
 *
 * The Leibniz formula for π states that π can be approximated by the infinite
 * series: π/4 = 1 - 1/3 + 1/5 - 1/7 + 1/9 - ... This method calculates the
 * value of π by summing a finite number of terms of this series.
 *
 * @param terms the number of terms to include in the approximation
 * @return the estimated value of π based on the specified number of terms
 * @throws IllegalArgumentException if terms is less than or equal to zero
 */

//Todo
    }

}