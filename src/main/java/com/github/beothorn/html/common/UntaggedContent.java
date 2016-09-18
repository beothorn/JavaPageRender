package com.github.beothorn.html.common;

import java.util.List;
import java.util.stream.Collectors;

import com.github.beothorn.html.Renderable;

public class UntaggedContent implements Renderable {
	
	private List<Renderable> children;

	public UntaggedContent(List<Renderable> children) {
		this.children = children;
	}
	
	@Override
	public String render() {
		return children.stream()
			.map(Renderable::render)
			.collect(Collectors.joining());
	}
}
