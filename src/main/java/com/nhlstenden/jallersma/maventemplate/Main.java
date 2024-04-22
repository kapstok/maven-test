package com.nhlstenden.jallersma.maventemplate;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
        MyMath myMath = new MyMath(new User("Jan"));
        System.out.format("2^4 is %d", myMath.power(4));
    }
}
