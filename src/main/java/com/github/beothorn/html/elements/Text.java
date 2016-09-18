package com.github.beothorn.html.elements;

import java.util.ArrayList;

import org.apache.commons.lang3.StringEscapeUtils;

public class Text extends DomElement {

	private final String content;

	public Text(String content) {
		super("", new ArrayList<>());
		this.content = StringEscapeUtils.escapeHtml4(content);
	}
	
	@Override
	public String render() {
		return content;
	}

}
