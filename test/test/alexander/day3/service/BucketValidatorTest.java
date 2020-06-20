package test.alexander.day3.service;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import com.alexander.day3.validator.BucketValidator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BucketValidatorTest {
    BucketValidator validator;

    @BeforeClass
    public void setUp() {
        validator = new BucketValidator();
    }

    @Test
    public void bucketValidationTestPositive() {
        boolean condition = validator.bucketValidation(40);
        assertTrue(condition, "fail test");
    }

    @Test
    public void bucketValidationTestNegative() {
        boolean condition = validator.bucketValidation(-40);
        assertFalse(condition, "fail test");
    }
}
