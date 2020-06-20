package test.alexander.day3.service;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import com.alexander.day3.entity.Ball;
import com.alexander.day3.entity.Bucket;
import com.alexander.day3.entity.CustomColor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BucketTest {
    Bucket bucket;

    @BeforeClass
    public void setUp() {
        bucket = new Bucket(10);
    }

    @Test
    public void addBallTestPositive() {
        Ball ball = new Ball(5, 6, CustomColor.ORANGE);
        boolean condition = bucket.addBall(ball);
        assertTrue(condition, "fail test");
    }

    @Test
    public void addBallTestNegative() {
        Ball ball = new Ball(15, 6, CustomColor.RED);
        boolean condition = bucket.addBall(ball);
        assertFalse(condition, "fail test");
    }
}
