package com.alexander.day3.entity;

public enum CustomColor {
    BLACK(1),
    BLUE(2),
    RED(3),
    GREEN(4),
    YELLOW(5),
    ORANGE(6),
    WHITE(7);

    private int colorNumber;

    CustomColor(int colorNumber) {}

    public int getColorNumber() {
        return colorNumber;
    }
}
