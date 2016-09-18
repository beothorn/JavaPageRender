package com.github.beothorn.html.common;

import java.util.List;
import java.util.stream.Collectors;

import com.github.beothorn.html.Renderable;

public class Render {
	
	public static String renderTag(
		final String tag, 
		final List<Renderable> children
	){
		return 
			("<" + tag + ">")+
				children.stream()
					.map(Renderable::render)
					.collect(Collectors.joining())+
			("</"+ tag + ">");
	}
	
	public static String renderTag(
		final String tag,
		final List<Renderable> attributes,
		final List<Renderable> children
	){
		return 
			("<"+tag+ ((attributes.size() > 0) ? " " : "") )+
				attributes.stream()
					.map(Renderable::render)
					.collect(Collectors.joining(" "))+
			(">")+
				children.stream()
					.map(Renderable::render)
					.collect(Collectors.joining())+
			("</" + tag + ">");
	}

}
