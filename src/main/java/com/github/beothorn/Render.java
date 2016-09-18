package com.github.beothorn;

import java.util.List;
import java.util.stream.Collectors;

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
			renderEmptyTag(tag, attributes)+
				children.stream()
					.map(Renderable::render)
					.collect(Collectors.joining())+
			("</" + tag + ">");
	}
	
	public static String renderEmptyTag(
		final String tag,
		final List<Renderable> attributes
	){
		return 
			("<"+tag+ ((attributes.size() > 0) ? " " : "") )+
				attributes.stream()
					.map(Renderable::render)
					.collect(Collectors.joining(" "))+
			(">");
	}

}
