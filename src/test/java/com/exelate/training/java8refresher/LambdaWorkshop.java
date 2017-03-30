package com.exelate.training.java8refresher;

import com.google.common.collect.ImmutableMap;
import org.apache.commons.lang3.NotImplementedException;
import org.junit.Test;

import java.util.*;

public class LambdaWorkshop {

    /* ======================= Streams with Collections ====================== */


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


    /* ======================= Extra Lambdas 1 ====================== */


    /**
     * A container of a list of CLEAN names.
     * This means: No extra spaces, proper capitalization, no repetition.
     */
    class ContainerOfNames {

        private final List<String> names;

        public ContainerOfNames(Collection<String> names) {
            throw new NotImplementedException("constructor");
        }

        /**
         * For-each. E.g. container.forEach(name -> println(name))
         */
        public void forEachName(Object doSomething) {
            throw new NotImplementedException("for each");
        }

        /**
         * Return a list of names, filtered by <code>filter</code>.
         */
        public void toFilteredList(Object filter) {
            throw new NotImplementedException("to list");
        }

        /**
         * Return a {@link Set} containing all the names, but with
         * same iteration order as the original list.
         */
        public void toSortedSet() {
            throw new NotImplementedException("to sorted set");
        }
    }


    /* ======================= Extra Lambdas 2 ====================== */


    // For each of the exercises below, please build *convincing* unit tests.

    // (Extra points for making this more generic).


    class Node<T> {

        final T value;
        final Node<T> left;
        final Node<T> right;

        public Node(T value, Node<T> left, Node<T> right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

    }


    /**
     * Walk the tree, using recursion, execute the function on each node.
     */
    void walk1(Node<String> tree, Object function) {
        throw new NotImplementedException("walk recursively");
    }


    /**
     * Walk the tree, using recursion, execute the function on each node.
     * If we exceed the max depth, die horribly.
     */
    void walk1Limited(Node<String> tree, Object function) {
        throw new NotImplementedException("walk recursively with a limit");
    }


    /**
     * Walk the tree, without recursion, execute the function on each node.
     */
    void walk2(Node<String> tree, Object function) {
        throw new NotImplementedException("walk recursively");
    }


    /**
     * Count the nodes in the tree.
     */
    void size(Node<?> tree) {
        throw new NotImplementedException("walk recursively");
    }


    /**
     * Return a sorted list of the tree's values.
     */
    void sortedValues(Node<String> tree) {
        throw new NotImplementedException("sorted list of values");
    }


    /**
     * Extra points: return a sorted, balanced tree.
     */
    Node<String> sorted(Node<String> tree) {
        throw new NotImplementedException("sorted tree");
    }


    /* ======================= Extra Lambdas 3 ====================== */

    /*
     * Task: Define a class that will implement 3 flow control constructs.
     * Please design a reasonably friendly API :)
     * Use standard (i.e. java.util.*) interfaces!
     *
     * 1. An IF/IF-ELSE statement.
     *    Example of use:  Logic.if(<condition>, <run-if-true>)
     *    Example of use:  Logic.ifElse(<condition>, <run-if-true>, <run-if-false>)
     *
     * 2. A WHILE loop.
     *    Example of use (simple):  Logic.while(<condition>, <body>)
     *    More useful (?):          Logic.while(<context>, <condition-on-context>, <body-using-context>)
     *
     * 3. A CASE construct.
     *    Example:      Logic.case(<value>, Case(<condition>, <run-if-condition>), Case(..), ...)
     *    Maybe better: Logic.case(<value>, Case(<condition>, <run-if-condition-with-value>), ...)
     *
     * Please provide sample usage tests for all of the above, nice ones!
     */

    public static class Logic {

        // ...

    }
}

