package com.github.beothorn.html.elements.button;

import static java.util.Arrays.asList;

import java.util.Arrays;
import java.util.List;

import com.github.beothorn.html.Renderable;
import com.github.beothorn.html.elements.DomElement;

public class Button extends DomElement{
	
	public static List<ButtonAttrs> attrs(
		final ButtonAttrs... props
	){
		return asList(props);
	}

	public Button(
		final Renderable[] childrenElements
	){
		children.addAll(Arrays.asList(childrenElements));
	}
	
	public Button(
		final List<ButtonAttrs> props ,
		final List<Renderable> childrenElements
	){
		children.addAll(childrenElements);
		this.props.addAll(props);
	}
	
	@Override
	protected String tag() {
		return "button";
	}
}
