package com.github.beothorn.html.elements;

import java.util.ArrayList;

public class Br extends DomElement {

	public Br() {
		super("", new ArrayList<>());
	}
	@Override
	public String render() {
		return "<br>";
	}

}
