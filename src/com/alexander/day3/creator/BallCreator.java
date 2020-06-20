package com.alexander.day3.creator;

import com.alexander.day3.entity.Ball;
import com.alexander.day3.entity.CustomColor;
import com.alexander.day3.exсeption.UserException;
import com.alexander.day3.validator.BallValidator;

public class BallCreator {
    public Ball createBall(double volume, int weight, CustomColor ballColor)
            throws UserException {
        BallValidator validator = new BallValidator();
        if (!validator.ballValidation(volume, weight, ballColor)) {
            throw new UserException("Incorrect data");
        }
        return new Ball(volume, weight, ballColor);
    }
}
