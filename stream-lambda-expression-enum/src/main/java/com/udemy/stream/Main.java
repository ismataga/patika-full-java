package com.udemy.stream;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(12);
        list.add(3);
        list.add(89);
        list.add(25);
        list.add(44);
        list.add(100);
        list.add(7);
        list.add(63);


//        list.stream().forEach(i-> System.out.println(i));

//        list.forEach(i-> System.out.println(i));

//        list.forEach(System.out::println);

//        list.stream().filter(num->num>60)
//                .forEach(System.out::println);

//        list.stream().distinct().forEach(i-> System.out.println(i));

//        list.stream().sorted().forEach(i-> System.out.println(i));



//        list.stream().limit(5).forEach(i -> System.out.println(i));

//        list.stream().skip(2l).limit(5).forEach(i -> System.out.println(i));

//        list.stream().map(i->i*2).forEach(i -> System.out.println(i));

        list.stream().map(i->Math.sqrt(i)).forEach(i -> System.out.println(i));


    }

}
