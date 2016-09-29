package com.github.beothorn;

public class Attribute implements Renderable {

    private final String name;
    private final String value;

    public Attribute(final String name, final String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String render() {
        return name + "=\"" + value + "\"";
    }

}
