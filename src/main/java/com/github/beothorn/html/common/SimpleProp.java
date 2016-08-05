package com.github.beothorn.html.common;

import com.github.beothorn.html.Renderable;

public class SimpleProp implements Renderable {

	private String name;
	private String value;

	public SimpleProp(
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
