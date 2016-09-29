package com.github.beothorn.html.common;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.github.beothorn.Renderable;
import com.github.beothorn.html.DomElement;

public class UntaggedContent extends DomElement {

    private final List<Renderable> children;

    public UntaggedContent(final List<Renderable> children) {
        super("", new ArrayList<>());
        this.children = children;
    }

    @Override
    public String render() {
        return children.stream().map(Renderable::render).collect(Collectors.joining());
    }
}
