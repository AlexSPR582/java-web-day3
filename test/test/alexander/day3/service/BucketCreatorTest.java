package test.alexander.day3.service;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.fail;

import com.alexander.day3.creator.BucketCreator;
import com.alexander.day3.entity.Bucket;
import com.alexander.day3.exсeption.UserException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BucketCreatorTest {
    BucketCreator creator;

    @BeforeClass
    public void setUp() {
        creator = new BucketCreator();
    }

    @Test
    public void createBucketTestPositive() {
        try {
            Bucket bucket = creator.createBucket(50);
            Bucket expectedBucket = new Bucket(50);
            assertEquals(bucket, expectedBucket, "fail test");
        } catch (UserException e) {
            fail("Exception occurred");
        }
    }

    @Test
    public void createBucketTestNegative() {
        try {
            Bucket bucket = creator.createBucket(50);
            Bucket expectedBucket = new Bucket(60);
            assertNotEquals(bucket, expectedBucket, "fail test");
        } catch (UserException e) {
            fail("Exception occurred");
        }
    }

    @Test (expectedExceptions = UserException.class)
    public void createBucketTestException() throws UserException {
        creator.createBucket(-40);
    }
}
