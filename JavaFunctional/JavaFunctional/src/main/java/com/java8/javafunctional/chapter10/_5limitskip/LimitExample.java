package com.java8.javafunctional.chapter10._5limitskip;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LimitExample {
    public static void main(String[] args) {
/*
        IntStream.rangeClosed(1,100)
                .filter(num -> num <6)
                .limit(2)
                        .forEach(System.out::println);

        int sum =0;
        for(int i=1;i<=10;i++){
            sum = sum+i;
        }
        System.out.println("Sum " + sum);


        int result = IntStream.rangeClosed(1, 10)
                        .reduce(1, (total,num) -> total*num);
        System.out.println("Result " + result);*/


        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(i -> i % 2 == 0)
                .limit(2)
                .forEach(i -> System.out.print(i + " "));
    }
}
