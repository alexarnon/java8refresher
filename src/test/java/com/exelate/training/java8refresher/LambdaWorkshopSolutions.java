package com.exelate.training.java8refresher;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class LambdaWorkshopSolutions {

    @Test
    public void collectToSet() {

        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(
                input.stream()
                        .collect(Collectors.toSet())
        );
    }


    @Test
    public void collectToSortedList() {

        List<Integer> input = Arrays.asList(5, 2, 3, 1, 4);

        System.out.println(
                input.stream()
                        .sorted()
                        .collect(Collectors.toList())
        );
    }


    @Test
    public void countNamesOfLength5() {

        List<String> names = Arrays.asList("gilad", "amir", "maya", "ronen", "efrat", "alon");

        System.out.println(
                names.stream()
                        .filter(s -> s.length() == 5)
                        .count()
        );
    }


    @Test
    public void collectToSortedListByLength() {

        List<String> names = Arrays.asList("gilad", "amir", "maya", "ronen", "efrat", "alon");

        // Hint: Comparator.comparingInt()
        System.out.println(
                names.stream()
                        .sorted(Comparator.comparingInt(String::length))  // (s1, s2) -> s1.length() - s2.length()
                        .collect(toList())
        );
    }


    @Test
    public void collectToCommaSeparatedStringSortedByLength() {

        List<String> names = Arrays.asList("gilad", "amir", "maya", "ronen", "efrat", "alon");

        System.out.println(
                names.stream()
                        .sorted(Comparator.comparingInt(String::length))
                        .reduce(
                                "",
                                (acc, name) -> acc.isEmpty() ? name : acc + "," + name
                )
        );

        System.out.println(
                names.stream()
                        .sorted(Comparator.comparingInt(String::length))
                        .collect(Collectors.joining(","))
        );
    }


    @Test
    public void collectEvenInRangeGroupByGreaterThan5() {

        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Hint: Collect group by.

        System.out.println(
                input.stream()
                        .filter(i -> i % 2 == 0)
                        .collect(Collectors.groupingBy(i -> i > 5 ? "greater_than" : "smaller_than"))
        );
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
