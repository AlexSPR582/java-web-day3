package test.alexander.day3.service;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.fail;

import com.alexander.day3.entity.Ball;
import com.alexander.day3.entity.Bucket;
import com.alexander.day3.entity.CustomColor;
import com.alexander.day3.exсeption.UserException;
import com.alexander.day3.service.BucketService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BucketServiceTest {
    Bucket bucket;
    BucketService service;

    @BeforeClass
    public void setUp() {
        service = new BucketService();
        bucket = new Bucket(15);

        Ball ball1 = new Ball(4, 6, CustomColor.BLUE);
        Ball ball2 = new Ball(7, 8, CustomColor.GREEN);
        Ball ball3 = new Ball(3, 4, CustomColor.BLUE);

        bucket.addBall(ball1);
        bucket.addBall(ball2);
        bucket.addBall(ball3);
    }

    @Test
    public void ballsWeightTestPositive() {
        try {
            int actual = service.ballsWeight(bucket);
            int expected = 18;
            assertEquals(actual, expected, "fail test");
        } catch (UserException e) {
            fail("exception occurred");
        }
    }

    @Test
    public void ballsWeightTestNegative() {
        try {
            int actual = service.ballsWeight(bucket);
            int expected = 15;
            assertNotEquals(actual, expected, "fail test");
        } catch (UserException e) {
            fail("exception occurred");
        }
    }

    @Test (expectedExceptions = UserException.class)
    public void ballsWeightTestException() throws UserException {
        service.ballsWeight(null);
    }

    @Test
    public void amountColorBallsTestPositive() {
        try {
            int actual = service.amountColorBalls(bucket, CustomColor.BLUE);
            int expected = 2;
            assertEquals(actual, expected, "fail test");
        } catch (UserException e) {
            fail("exception occurred");
        }
    }

    @Test
    public void amountColorBallsTestNegative() {
        try {
            int actual = service.amountColorBalls(bucket, CustomColor.BLUE);
            int expected = 3;
            assertNotEquals(actual, expected, "fail test");
        } catch (UserException e) {
            fail("exception occurred");
        }
    }

    @Test (expectedExceptions = UserException.class)
    public void amountColorBallsTestException() throws UserException {
        service.amountColorBalls(null, CustomColor.YELLOW);
    }
}
