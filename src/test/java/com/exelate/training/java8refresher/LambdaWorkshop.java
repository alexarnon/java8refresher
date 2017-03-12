package com.exelate.training.java8refresher;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class LambdaWorkshop {

    @Test
    public void collectToSet() {

        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    }


    @Test
    public void collectToSortedList() {

        List<Integer> input = Arrays.asList(5, 2, 3, 1, 4);

    }


    @Test
    public void countNamesOfLength5() {

        List<String> names = Arrays.asList("gilad", "amir", "maya", "ronen", "efrat", "alon");

    }


    @Test
    public void collectToSortedListByLength() {

        List<String> names = Arrays.asList("gilad", "amir", "maya", "ronen", "efrat", "alon");

        // 1. Hint: with a Comparator...


        // 2. Hint: Comparator.comparingInt()

    }


    @Test
    public void collectToCommaSeparatedStringSortedByLength() {

        List<String> names = Arrays.asList("gilad", "amir", "maya", "ronen", "efrat", "alon");

    }


    @Test
    public void collectEvenInRangeGroupByGreaterThan5() {

        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Hint: Collect group by ... something.

    }


    @Test
    public void sortByAge() {

        List<Person> people = Arrays.asList(
                new Person("ran", 25),
                new Person("omer", 40),
                new Person("rina", 33),
                new Person("ran", 11),
                new Person("elad", 7),
                new Person("elad", 35));

    }


    @Test
    public void collectAges() {

        List<Person> people = Arrays.asList(
                new Person("ran", 25),
                new Person("omer", 40),
                new Person("rina", 33),
                new Person("ran", 11),
                new Person("elad", 7),
                new Person("elad", 35));

        // TODO: Map of name -> ages.
    }


    @Test
    public void hashCodeViaReduce() {

        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // TODO: Calculate a hash code ((A + 2) * (B + 2) * ... * (Z + 2)) using reduce().

    }


    static class Context {
        Set<Integer> younger = new HashSet<>();
        Set<Integer> older = new HashSet<>();
    }

    @Test
    public void buildContext() {

        List<Person> people = Arrays.asList(
                new Person("ran", 25),
                new Person("omer", 40),
                new Person("rina", 33),
                new Person("ran", 11),
                new Person("elad", 7),
                new Person("elad", 35));

        // Create a pair of Contexts with partitioning of ages greater/smaller than 30.


        // TODO: Without reduce() or forEach().
        // ... 2 streams ...

    }


    @Test
    public void groupSizes() {

        Map<String, List<Person>> groups = ImmutableMap.of(
                "children", Arrays.asList(
                        new Person("ran", 11),
                        new Person("elad", 7)),

                "parents", Arrays.asList(
                        new Person("ran", 25),
                        new Person("elad", 35),
                        new Person("rina", 33)),

                "drivers", Arrays.asList(
                        new Person("ran", 25),
                        new Person("omer", 40),
                        new Person("rina", 33),
                        new Person("elad", 35)));

        // TODO: Map of group_name -> list of names.

    }


    @Test
    public void listOfDistinctNamesSortedByLength() {

        Map<String, List<Person>> groups = ImmutableMap.of(
                "children", Arrays.asList(
                        new Person("ran", 11),
                        new Person("elad", 7)),

                "parents", Arrays.asList(
                        new Person("ran", 25),
                        new Person("elad", 35),
                        new Person("rina", 33)),

                "drivers", Arrays.asList(
                        new Person("ran", 25),
                        new Person("omer", 40),
                        new Person("rina", 33),
                        new Person("elad", 35)));

        // Hint: FlatMap.
    }

}

