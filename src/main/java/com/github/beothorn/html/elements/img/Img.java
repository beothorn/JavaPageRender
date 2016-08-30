package com.github.beothorn.html.elements.img;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.github.beothorn.html.Renderable;
import com.github.beothorn.html.common.Render;

public class Img implements Renderable {

	private List<Renderable> children = new ArrayList<Renderable>();
	private List<Renderable> props = new ArrayList<>();
	
	public static List<ImgProp> props(
		final ImgProp... props
	){
		return asList(props);
	}
	
	public static ImgProp height(
		final int height
	){
		return new ImgProp("height", Integer.toString(height));
	}
	
	public static ImgProp width(
		final int width
	) {
		return new ImgProp("width", Integer.toString(width));
	}

	public static ImgProp src(
		final String src
	) {
		return new ImgProp("src", src);
	}
	
	public static ImgProp data(
		final String name, 
		final String value
	) {
		return new ImgProp("data-"+name, value);
	}

	public Img(
		final Renderable[] childrenElements
	){
		children.addAll(Arrays.asList(childrenElements));
	}
	
	public Img(
		final List<ImgProp> props ,
		final List<Renderable> childrenElements
	){
		children.addAll(childrenElements);
		this.props.addAll(props);
	}
	
	@Override
	public String render() {
		return Render.renderTag("img", props, children);
	}

}
