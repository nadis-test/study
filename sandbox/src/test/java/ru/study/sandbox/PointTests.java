package ru.study.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by nadis on 17/04/2017.
 */
@Test
public class PointTests {
    public void testPositive(){
        Point point1 = new Point(1,2);
        Point point2 = new Point(5,7);

        Assert.assertEquals(point1.distance(point2),6.4031242374328485
        );
    }

    public void testEqual(){
        Point point1 = new Point(1,1);
        Point point2 = new Point(1,1);

        Assert.assertEquals(point1.distance(point2),0.0);
    }

    public void testNegative(){
        Point point1 = new Point(-1.5,-2.43);
        Point point2 = new Point(-3.44,-5.23);

        Assert.assertEquals(point1.distance(point2),3.4064057303850346);
    }
}
