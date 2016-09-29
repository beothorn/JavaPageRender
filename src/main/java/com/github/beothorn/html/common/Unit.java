package com.github.beothorn.html.common;

import com.github.beothorn.Renderable;
import com.github.beothorn.html.elements.types.Px;

public interface Unit extends Renderable {
    public static Px px(final int value) {
        return new Px(value);
    }

}
