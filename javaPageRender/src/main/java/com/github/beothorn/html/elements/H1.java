package com.github.beothorn.html.elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.github.beothorn.html.DOMElement;

public class H1 implements DOMElement {

	private List<DOMElement> children = new ArrayList<DOMElement>();
	
	public H1(DOMElement... childrenElements) {
		children.addAll(Arrays.asList(childrenElements));
	}
	
	public String render() {
		StringBuilder rendered = new StringBuilder();
		rendered.append("<h1>");
		children.forEach(el -> rendered.append(el.render()));
		rendered.append("<h1>");
		return rendered.toString();
	}

}
