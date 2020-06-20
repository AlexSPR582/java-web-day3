package com.alexander.day3.service;

import com.alexander.day3.entity.Ball;
import com.alexander.day3.entity.Bucket;
import com.alexander.day3.entity.CustomColor;
import com.alexander.day3.exсeption.UserException;

public class BucketService {
    public int ballsWeight(Bucket bucket) throws UserException {
        if (bucket == null) {
            throw new UserException();
        }
        int ballsWeight = 0;
        for (Ball ball: bucket.getBalls()) {
            ballsWeight += ball.getWeight();
        }
        return ballsWeight;
    }

    public int amountColorBalls(Bucket bucket, CustomColor color)
            throws UserException {
        if (bucket == null || color == null) {
            throw new UserException();
        }
        int colorBalls = 0;
        for (Ball ball: bucket.getBalls()) {
            if (ball.getBallColor() == color) {
                colorBalls++;
            }
        }
        return colorBalls;
    }
}
