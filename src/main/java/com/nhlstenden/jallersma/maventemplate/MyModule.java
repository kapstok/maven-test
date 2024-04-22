package com.nhlstenden.jallersma.maventemplate;

import com.google.inject.AbstractModule;

public class MyModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(User.class).toInstance(new User("Jan"));
        bind(MyMath.class);
    }
}
