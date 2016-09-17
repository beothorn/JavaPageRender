package com.github.beothorn.html.elements.img;

import static java.util.Arrays.asList;

import java.util.Arrays;
import java.util.List;

import com.github.beothorn.html.Renderable;
import com.github.beothorn.html.elements.DomElement;

public class Img extends DomElement {
	
	public static List<ImgAttrs> attrs(
		final ImgAttrs... props
	){
		return asList(props);
	}

	public Img(
		final Renderable[] childrenElements
	){
		children.addAll(Arrays.asList(childrenElements));
	}
	
	public Img(
		final List<ImgAttrs> props ,
		final List<Renderable> childrenElements
	){
		children.addAll(childrenElements);
		this.props.addAll(props);
	}
	
	@Override
	protected String tag() {
		return "img";
	}

}
