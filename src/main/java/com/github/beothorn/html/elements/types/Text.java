package com.github.beothorn.html.elements.types;

import java.util.ArrayList;

import org.apache.commons.lang3.StringEscapeUtils;

import com.github.beothorn.html.DomElement;

public class Text extends DomElement {

    private final String content;

    public Text(final String content) {
        super("", new ArrayList<>());
        this.content = StringEscapeUtils.escapeHtml4(content);
    }

    @Override
    public String render() {
        return content;
    }

}
