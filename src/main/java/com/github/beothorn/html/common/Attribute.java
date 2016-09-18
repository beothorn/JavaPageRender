package com.github.beothorn.html.common;

import com.github.beothorn.html.Renderable;

public class Attribute implements Renderable {

	private String name;
	private String value;

	public Attribute(
		final String name,
		final String value
	) {
		this.name = name;
		this.value = value;
	}
	
	@Override
	public String render() {
		return name+"=\"" + value + "\"";
	}

}
