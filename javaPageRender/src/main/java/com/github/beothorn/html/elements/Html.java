package com.github.beothorn.html.elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.github.beothorn.html.DOMElement;

public class Html implements DOMElement {

	private List<DOMElement> children = new ArrayList<DOMElement>();
	
	public Html(DOMElement... childrenElements) {
		children.addAll(Arrays.asList(childrenElements));
	}
	
	public String render() {
		StringBuilder rendered = new StringBuilder();
		rendered.append("<html>\n");
		children.forEach(el -> rendered.append(el.render()));
		rendered.append("\n<html>");
		return rendered.toString();
	}

}
