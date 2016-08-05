package com.github.beothorn.html.common;

import java.util.List;

import com.github.beothorn.html.Renderable;

public class SimpleTag implements Renderable {

	private String tag;
	private List<Renderable> children;

	public SimpleTag(final String tag, List<Renderable> children) {
		this.tag = tag;
		this.children = children;
	}
	
	@Override
	public String render() {
		return Render.renderTag(tag, children);
	}

}
