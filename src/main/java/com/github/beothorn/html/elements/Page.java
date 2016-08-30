package com.github.beothorn.html.elements;

import static java.util.Arrays.asList;

import java.util.List;

import com.github.beothorn.html.Renderable;
import com.github.beothorn.html.common.SimpleTag;
import com.github.beothorn.html.common.UntaggedContent;
import com.github.beothorn.html.elements.img.Img;
import com.github.beothorn.html.elements.img.ImgProp;

public class Page {

	public static Renderable wrap(
		final Renderable... childrenElements
	) {
		return new UntaggedContent(asList(childrenElements));
	}
	
	public static Renderable html(
		final Renderable... childrenElements
	) {
		return new SimpleTag("html", asList(childrenElements));
	}

	public static Renderable img(
		final Renderable... childrenElements
	){
		return new Img(childrenElements);
	}
	
	public static Renderable img(
		final List<ImgProp> props, 
		final List<Renderable> childrenElements
	){
		return new Img(props, childrenElements);
	}
	
	public static Renderable h1(
		final Renderable... childrenElements
	){
		return new SimpleTag("h1", asList(childrenElements));
	}
	
	public static Renderable h1(
		final String title
	){
		return new SimpleTag("h1", asList(text(title)));
	}
	
	public static Renderable b(
		final Renderable... childrenElements
	){
		return new SimpleTag("b", asList(childrenElements));
	}
	
	public static Renderable b(
		final String text
	){
		return new SimpleTag("b", asList(text(text)));
	}
	
	public static Text text(
		final String content
	) {
		return new Text(content);
	}

	public static Renderable br() {
		return new Br();
	}

	public static List<Renderable> content(
		final Renderable... childrenElements
	) {
		return asList(childrenElements);
	}

}
