package com.github.beothorn.html.common;

import java.util.List;

import com.github.beothorn.html.Renderable;
import com.github.beothorn.html.elements.DomElement;

public class SimpleTag extends DomElement {

	private String tag;

	public SimpleTag(final String tag, List<Renderable> children) {
		this.tag = tag;
		this.children = children;
	}

	@Override
	protected String tag() {
		return tag;
	}

}
