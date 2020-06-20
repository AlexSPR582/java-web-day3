package com.alexander.day3.entity;

public class Ball {
    private double volume;
    private int weight;
    private CustomColor ballColor;

    public Ball(double volume, int weight, CustomColor ballColor)  {
        this.volume = volume;
        this.weight = weight;
        this.ballColor = ballColor;
    }

    public double getVolume() {
        return volume;
    }

    public int getWeight() {
        return weight;
    }

    public CustomColor getBallColor() {
        return ballColor;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBallColor(CustomColor ballColor) {
        this.ballColor = ballColor;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Ball ball = (Ball) object;
        return ball.volume == volume &&
                ball.ballColor == ballColor &&
                ball.weight == weight;
    }

    @Override
    public int hashCode() {
        return (int) (31 * volume * ballColor.getColorNumber() * weight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Ball{");
        sb.append("volume=").append(volume);
        sb.append(", weight=").append(weight);
        sb.append(", ballColor=").append(ballColor);
        sb.append('}');
        return sb.toString();
    }
}
