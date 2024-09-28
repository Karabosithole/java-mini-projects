package com.practice.algorithms.sortingAlgorithms;

/**
 * The {@code BucketSort} class provides an implementation of the bucket sort algorithm.
 * Bucket sort is a distribution sorting algorithm that divides the input elements into several
 * buckets and then sorts these buckets individually, either using a different sorting algorithm
 * or recursively applying the bucket sort algorithm.
 *
 * <p>
 * This algorithm is particularly effective when the input is uniformly distributed over a range.
 * Its average-case time complexity is O(n + k), where n is the number of elements and k is the number
 * of buckets. However, its worst-case time complexity can be O(n^2) if the input is not uniformly
 * distributed.
 * </p>
 *
 * <p>
 * Example usage:
 * <pre>
 *     int[] array = {4, 2, 3, 1, 0, 9, 5, 6, 8, 7};
 *     BucketSort.sort(array);
 *     System.out.println(Arrays.toString(array)); // Output will be a sorted array
 * </pre>
 * </p>
 *
 * @see <a href="https://en.wikipedia.org/wiki/Bucket_sort">Bucket sort on Wikipedia</a>
 */

public class BucketSort {
}
