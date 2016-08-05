package com.github.beothorn.html.elements;

import com.github.beothorn.html.Renderable;

public class Text implements Renderable {

	private final String content;

	public Text(String content) {
		this.content = content;
	}
	
	public String render() {
		return content;
	}

}
