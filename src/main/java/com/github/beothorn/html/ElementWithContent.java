package com.github.beothorn.html;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.github.beothorn.Attribute;
import com.github.beothorn.Render;
import com.github.beothorn.Renderable;

public class ElementWithContent extends DomElement {

    private final List<Renderable> children = new ArrayList<>();

    ElementWithContent(
        final String tag,
        final Renderable... childrenElements
    ){
        super(tag);
        children.addAll(Arrays.asList(childrenElements));
    }

    ElementWithContent(
        final String tag,
        final List<? extends Renderable> childrenElements
    ){
        super(tag);
        children.addAll(childrenElements);
    }

    ElementWithContent(
        final String tag,
        final List<? extends Attribute> props,
        final List<? extends Renderable> childrenElements
    ){
        super(tag, props);
        children.addAll(childrenElements);
    }

    @Override
    public String render() {
        return Render.renderTag(tag, attributes, children);
    }

}
