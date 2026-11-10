/**
 *  Java program to create a list from a stream.
 */

package com.mycollections;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating a stream of numbers.
        Stream<Integer> streamOfNumbers = Stream.of(2, 3, 7, 5, 4, 11, 0, 9, 3, 2);

        // Create a list with numbers.
        List<Integer> numbers = streamOfNumbers.collect(Collectors.toList());

        // Printing two collections to console.
        System.out.println("List: " + numbers);

    }
}