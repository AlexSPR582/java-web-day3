package com.alexander.day3.validator;

import com.alexander.day3.entity.CustomColor;

public class BallValidator {
    public boolean ballValidation(double volume, int weight, CustomColor color) {
        return volume > 0 && weight > 0 && color != null;
    }
}
