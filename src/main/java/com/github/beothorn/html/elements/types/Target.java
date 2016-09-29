package com.github.beothorn.html.elements.types;

public enum Target {
    SELF("_self"), BLANK("_blank"), PARENT("_parent"), TOP("_top");

    private final String name;

    private Target(final String s) {
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
