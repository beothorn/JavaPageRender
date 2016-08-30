package com.github.beothorn.html.common;

import java.util.List;

import com.github.beothorn.html.Renderable;

public class UntaggedContent implements Renderable {
	
	private List<Renderable> children;

	public UntaggedContent(List<Renderable> children) {
		this.children = children;
	}
	
	@Override
	public String render() {
		StringBuilder rendered = new StringBuilder();
		children.stream()
			.map(Renderable::render)
			.forEach(rendered::append);
		return rendered.toString();
	}
}
