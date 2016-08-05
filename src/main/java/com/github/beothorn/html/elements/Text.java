package com.github.beothorn.html.elements;

import java.util.ArrayList;
import java.util.List;

import com.github.beothorn.html.DOMElement;

public class Text implements DOMElement {

	private List<DOMElement> children = new ArrayList<DOMElement>();
	private String content = "";

	public Text(String content) {
		this.content = content;
	}
	
	public String render() {
		StringBuilder rendered = new StringBuilder();
		rendered.append(content);
		children.forEach(el -> rendered.append(el.render()));
		return rendered.toString();
	}

}
