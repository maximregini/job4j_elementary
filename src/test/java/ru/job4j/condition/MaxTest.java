package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax26ToMin13Then13() {
        int left = 26;
        int right = 13;
        int result = Max.max(left, right);
        int expected = 26;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1ToMin2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenBoth76Then76() {
        int left = 76;
        int right = 76;
        int result = Max.max(left, right);
        int expected = 76;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax69To55ToMin34Then69() {
        int left = 69;
        int right = 55;
        int median = 34;
        int result = Max.max(left, right, median);
        int expected = 69;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax161To98To70Then57() {
        int left = 161;
        int right = 98;
        int median = 79;
        int dead = 57;
        int result = Max.max(left, right, median, dead);
        int expected = 161;
        Assert.assertEquals(result, expected);
    }
}