package com.exelate.training.java8refresher;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambdas1Test {

    @Test
    public void thread() {

        Thread t = new Thread(() -> {
            System.out.println("hello");
            System.out.println("xxxx");
        });

        t.start();

        System.out.println("bye bye");

    }

    @FunctionalInterface
    interface Function1 {
        int apply(int x);
    }

    @Test
    public void interface1() {

        Function1 f = i -> i * 2;

        System.out.println(runFunction(f));
    }

    private int runFunction(Function1 f) {
        return f.apply(5);
    }

    //////////////

    @Test
    public void consume() {
        Consumer<Integer> c = n -> System.out.println(n);
        runConsumer(c.andThen(n -> System.out.println(n * 2)));
    }

    private void runConsumer(Consumer<Integer> consumer) {
        consumer.accept(5);
    }


    ////////////////

    @Test
    public void optional() {

        Optional<Integer> x = Optional.ofNullable(null);

        System.out.println(
                x.filter(this::isEven).map(value -> value * 2)
        );

        Integer value = x.orElseThrow(() -> new RuntimeException("xxxx"));

        System.out.println(value);

    }

    private boolean isEven(Integer value) {
        return value % 2 == 0;
    }


    /////////////////


    @Test
    public void howLambdas() {

        List<Runnable> lambdas = Arrays.asList(
                () -> System.out.println("1"),
                () -> System.out.println("2"),
                () -> System.out.println("3"),
                () -> System.out.println("4")
        );

        for (Runnable r: lambdas) {
            r.run();
        }

    }



    @Test
    public void additions1() {

        List<String> names = Arrays.asList("gilad", "alex", "maya", "ron");

        //names.sort(Comparator.comparing(String::length));

        //names.forEach(s -> System.out.println(s));

        Map<Integer, String> map = ImmutableMap.of(
                1, "xxx",
                2, "yyy",
                3, "zzz"
        );

        map.forEach((i, s) -> System.out.println(i * s.length()));



        System.out.println(names);

    }


    @Test
    public void maps() {

        Map<String, Set<Integer>> map = new HashMap<>();

        addToMap(map, "Alex", 4);
        addToMap(map, "Yossi", 5);
        addToMap(map, "Yossi", 7);

        System.out.println(map);

    }

    private void addToMap(Map<String, Set<Integer>> map, String key, int value) {

        //Set<Integer> set = map.get(key);
        //if (set == null) {
        //    set = new HashSet<>();
        //    map.put(key, set);
        //}
        //set.add(value);

        map.putIfAbsent(key, new HashSet<>()).add(value);
        //map.computeIfAbsent(key, k -> new HashSet<>()).add(value);

    }

}
