package com.test;

public class Main {

    static native int sum(int a, int b);

    public static void main(String[] args) {

        System.out.println(sum(1, 2));

    }

}
