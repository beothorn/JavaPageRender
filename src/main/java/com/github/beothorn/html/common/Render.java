package com.github.beothorn.html.common;

import java.util.List;
import java.util.stream.Collectors;

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
		final List<Renderable> attributes,
		final List<Renderable> children
	){
		StringBuilder rendered = new StringBuilder();
		rendered.append("<"+tag+ ((attributes.size() > 0) ? " " : "") );
		
		rendered.append(attributes.stream()
			.map(Renderable::render)
			.collect(Collectors.joining(" "))
		);
		rendered.append(">");
		
		children.stream()
			.map(Renderable::render)
			.forEach(rendered::append);
		rendered.append("</" + tag + ">");
		return rendered.toString();
	}

}
