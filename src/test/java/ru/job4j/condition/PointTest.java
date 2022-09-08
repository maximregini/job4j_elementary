package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to15then5() {
        double expected = 5;
        int x1 = 1;
        int y1 = 0;
        int x2 = 1;
        int y2 = 5;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when30to00then3() {
        double expected = 3;
        int x1 = 3;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to30to50then30() {
        double expected = 30;
        int x1 = 10;
        int y1 = 20;
        int x2 = 30;
        int y2 = 40;
        int z1 = 50;
        int z2 = 60;
        Point a = new Point(x1, y1, z1);
        Point b = new Point(x2, y2, z2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}

