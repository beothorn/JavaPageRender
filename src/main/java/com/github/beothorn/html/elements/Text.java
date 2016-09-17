package com.github.beothorn.html.elements;

import org.apache.commons.lang3.StringEscapeUtils;

import com.github.beothorn.html.Renderable;

public class Text implements Renderable {

	private final String content;

	public Text(String content) {
		this.content = StringEscapeUtils.escapeHtml4(content);
	}
	
	public String render() {
		return content;
	}

}
