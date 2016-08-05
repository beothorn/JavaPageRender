package com.github.beothorn.html.common;

import java.util.List;

import com.github.beothorn.html.Renderable;

public class Render {
	
	public static String renderTag(
		final String tag, 
		final List<Renderable> children
	){
		StringBuilder rendered = new StringBuilder();
		rendered.append("<" + tag + ">");
		children.stream()
			.map(Renderable::render)
			.forEach(rendered::append);
		rendered.append("</"+ tag + ">");
		return rendered.toString();
	}
	
	public static String renderTag(
		final String tag,
		final List<Renderable> props,
		final List<Renderable> children
	){
		StringBuilder rendered = new StringBuilder();
		rendered.append("<"+tag+" ");
		props.stream()
			.map(Renderable::render)
			.map(s -> s +" ")
			.forEach(rendered::append);
		rendered.append(" >");
		children.stream()
			.map(Renderable::render)
			.forEach(rendered::append);
		rendered.append("</" + tag + ">");
		return rendered.toString();
	}

}
