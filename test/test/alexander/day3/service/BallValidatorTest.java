package test.alexander.day3.service;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import com.alexander.day3.entity.CustomColor;
import com.alexander.day3.validator.BallValidator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BallValidatorTest {
    BallValidator validator;

    @BeforeClass
    public void setUp() {
        validator = new BallValidator();
    }

    @Test
    public void ballValidationTestPositive() {
        boolean condition = validator.ballValidation(4, 5, CustomColor.BLUE);
        assertTrue(condition, "fail test");
    }

    @Test
    public void ballValidationTestNegative() {
        boolean condition = validator.ballValidation(-4, 5, CustomColor.BLUE);
        assertFalse(condition, "fail test");
    }
}
