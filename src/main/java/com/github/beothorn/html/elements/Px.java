package com.github.beothorn.html.elements;

import com.github.beothorn.html.Unit;

public class Px implements Unit{
	
	private int value;
	
	public Px(final int value) {
		this.value = value;
	}

	@Override
	public String render() {
		return value+"px";
	}

}
