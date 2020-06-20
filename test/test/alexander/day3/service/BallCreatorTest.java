package test.alexander.day3.service;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.fail;

import com.alexander.day3.creator.BallCreator;
import com.alexander.day3.entity.Ball;
import com.alexander.day3.entity.CustomColor;
import com.alexander.day3.exсeption.UserException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BallCreatorTest {
    BallCreator creator;

    @BeforeClass
    public void setUp() {
        creator = new BallCreator();
    }

    @Test
    public void createBallTestPositive() {
        try {
            Ball ball = creator.createBall(5, 6, CustomColor.WHITE);
            Ball expectedBall = new Ball(5, 6, CustomColor.WHITE);
            assertEquals(ball, expectedBall, "fail test");
        } catch (UserException e) {
            fail("Exception occurred");
        }
    }

    @Test
    public void createBallTestNegative() {
        try {
            Ball ball = creator.createBall(5, 6, CustomColor.BLACK);
            Ball expectedBall = new Ball(5, 7, CustomColor.GREEN);
            assertNotEquals(ball, expectedBall, "fail test");
        } catch (UserException e) {
            fail("Exception occurred");
        }
    }

    @Test (expectedExceptions = UserException.class)
    public void createBallTestException() throws UserException {
        creator.createBall(-4, 5, CustomColor.GREEN);
    }
}
