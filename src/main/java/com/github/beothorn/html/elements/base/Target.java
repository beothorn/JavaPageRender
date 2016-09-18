package com.github.beothorn.html.elements.base;

public enum Target {
	SELF("_self"),
	BLANK("_blank"),
	PARENT("_parent"),
	TOP("_top");
	
	private final String name;       

    private Target(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        return (otherName == null) ? false : name.equals(otherName);
    }

    public String toString() {
       return this.name;
    }
}
