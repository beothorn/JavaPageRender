package com.github.beothorn.html.common;

public enum Direction{
	LEFT_TO_RIGHT("ltr"), RIGHT_TO_LEFT("rtl"), AUTO("auto");
	
	private final String name;       

    private Direction(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        return (otherName == null) ? false : name.equals(otherName);
    }

    public String toString() {
       return this.name;
    }
}