package com.nhlstenden.jallersma.maventemplate;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

public class TestMyTest {
    @Test
    public void actionLoggedSpyTest() {
        User userSpy = spy(new User("Test"));
        MyMath math = new MyMath(userSpy);
        math.power(3);
        verify(userSpy, times(1)).log("power calculation");
    }

    @Test
    public void powerHappyFlowMockTest() {
        User userMock = mock();
        MyMath math = new MyMath(userMock);
        Assert.assertEquals(9, math.power(3));
    }
}
