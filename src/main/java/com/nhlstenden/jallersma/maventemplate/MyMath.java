package com.nhlstenden.jallersma.maventemplate;

import com.google.inject.Inject;

public class MyMath {
    private final User user;

    @Inject
    public MyMath(User user) {
        this.user = user;
    }

    public int power(int n) {
        user.log("power calculation");
        if (n < 0) {
            return 0;
        } else if (n > 30) {
            System.out.println("n > 30. Will result in value beyond max size on int");
            return Integer.MAX_VALUE;
        }
        return 1 << n;
    }
}
