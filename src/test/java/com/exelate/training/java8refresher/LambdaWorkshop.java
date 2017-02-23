package com.exelate.training.java8refresher;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class LambdaWorkshop {

    @Test
    public void collectToList() {

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

        // Hint: Comparator.comparingInt()

    }


    @Test
    public void collectToCommaSeparatedStringSortedByLength() {

        List<String> names = Arrays.asList("gilad", "amir", "maya", "ronen", "efrat", "alon");

        // Hint: Comparator.comparingInt()

    }


    @Test
    public void collectEvenInRangeGroupByGreaterThan5() {

        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Hint: Collect group by.
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




    static class Context {
        int younger = 0;
        int older = 0;
        List<String> allNames = new ArrayList<>();
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

        // Create a Context with partitioning of ages greater/smaller than 30.


        // TODO: Without reduce().
        // ... 3 streams ...


        // TODO: Use reduce().
        // ...

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
