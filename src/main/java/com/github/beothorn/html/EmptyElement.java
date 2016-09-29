package com.github.beothorn.html;

import java.util.List;

import com.github.beothorn.Attribute;
import com.github.beothorn.Render;

public class EmptyElement extends DomElement {

    EmptyElement(final String tag) {
        super(tag);
    }

    EmptyElement(final String tag, final List<? extends Attribute> props) {
        super(tag, props);
    }

    @Override
    public String render() {
        return Render.renderEmptyTag(tag, attributes);
    }

}
