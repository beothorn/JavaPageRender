package com.github.beothorn.html.elements.types;

public enum Link {
    ALTERNATE("alternate"),
    AUTHOR("author"),
    BOOKMARK("bookmark"),
    EXTERNAL("external"),
    HELP("help"),
    ICON("icon"),
    LICENSE("license"),
    MANIFEST("manifest"),
    NEXT("next"),
    NOFOLLOW("nofollow"),
    NOOPENER("noopener"),
    NOREFERRER("noreferrer"),
    PINGBACK("pingback"),
    PREFETCH("prefetch"),
    PRELOAD("preload"),
    PREV("prev"),
    SEARCH("search"),
    STYLESHEET("stylesheet"),
    TAG("tag");

    private final String name;

    private Link(final String s) {
        name = s;
    }

    public boolean equalsName(final String otherName) {
        return otherName == null ? false : name.equals(otherName);
    }

    @Override
    public String toString() {
        return name;
    }
}
