package com.github.beothorn.html.common;

public enum Direction {
    LEFT_TO_RIGHT("ltr"), RIGHT_TO_LEFT("rtl"), AUTO("auto");

    private final String name;

    private Direction(final String s) {
        name = s;
    }

    public boolean equalsName(final String otherName) {
        return otherName == null ? false : name.equals(otherName);
    }

    @Override
    public String toString() {
        return this.name;
    }
}