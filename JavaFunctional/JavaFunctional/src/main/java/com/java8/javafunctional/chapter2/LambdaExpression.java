package com.java8.javafunctional.chapter2;

public class LambdaExpression {
    public static void main(String[] args) {
        // Before
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1");
            }
        };

        new Thread(r).start();

        // After
        Runnable r1 = () -> System.out.println("Thread 2");
        new Thread(r1).start();

        new Thread(()->System.out.println("Thread 3")).start();
    }
}
