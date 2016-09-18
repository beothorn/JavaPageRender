package com.github.beothorn;

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
