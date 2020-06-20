package com.alexander.day3.creator;

import com.alexander.day3.entity.Bucket;
import com.alexander.day3.exсeption.UserException;
import com.alexander.day3.validator.BucketValidator;

public class BucketCreator {
    public Bucket createBucket(double maxVolume) throws UserException {
        BucketValidator validator = new BucketValidator();
        if (!validator.bucketValidation(maxVolume)) {
            throw new UserException("Incorrect Data");
        }
        return new Bucket(maxVolume);
    }
}
