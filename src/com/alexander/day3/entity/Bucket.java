package com.alexander.day3.entity;

import java.util.ArrayList;
import java.util.List;

public class Bucket {
    private final double maxVolume;
    private double currentVolume = 0;
    private List<Ball> balls;

    public Bucket(double maxVolume) {
        this.maxVolume = maxVolume;
        balls = new ArrayList<>();
    }

    public boolean addBall(Ball ball) {
        if (isPossibleAdd(ball)) {
            balls.add(ball);
            currentVolume += ball.getVolume();
            return true;
        }
        return false;
    }

    private boolean isPossibleAdd(Ball ball) {
        if (ball == null) {
            return false;
        }
        return ball.getVolume() + currentVolume <= maxVolume;
    }

    public double getCurrentVolume() {
        return currentVolume;
    }

    public double getMaxVolume() {
        return maxVolume;
    }

    public List<Ball> getBalls() {
        return new ArrayList<>(balls);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Bucket bucket = (Bucket) object;
        return bucket.maxVolume == maxVolume &&
                bucket.currentVolume == currentVolume &&
                bucket.balls.equals(balls);
    }

    @Override
    public int hashCode() {
        return (int) (31 * maxVolume * currentVolume * balls.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Bucket{");
        sb.append("maxVolume=").append(maxVolume);
        sb.append(", currentVolume=").append(currentVolume);
        sb.append(", balls=").append(balls);
        sb.append('}');
        return sb.toString();
    }
}
