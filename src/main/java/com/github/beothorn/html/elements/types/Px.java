package com.github.beothorn.html.elements.types;

import com.github.beothorn.html.common.Unit;

public class Px implements Unit {

    private final int value;

    public Px(final int value) {
        this.value = value;
    }

    @Override
    public String render() {
        return value + "px";
    }

}
