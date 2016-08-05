package com.github.beothorn.html.elements;

import static java.util.Arrays.asList;

import java.util.Arrays;
import java.util.List;

import com.github.beothorn.html.Renderable;
import com.github.beothorn.html.common.SimpleTag;
import com.github.beothorn.html.elements.img.Img;
import com.github.beothorn.html.elements.img.ImgProp;

public class Page {

	public static Renderable html(Renderable... childrenElements) {
		return new SimpleTag("html", Arrays.asList(childrenElements));
	}

	public static Renderable img(Renderable... childrenElements){
		return new Img(childrenElements);
	}
	
	public static Renderable img(List<ImgProp> props, List<Renderable> childrenElements){
		return new Img(props, childrenElements);
	}
	
	public static Renderable h1(Renderable... childrenElements){
		return new SimpleTag("h1", Arrays.asList(childrenElements));
	}
	
	public static Text text(String content) {
		return new Text(content);
	}

	public static Renderable br() {
		return new Br();
	}

	public static List<Renderable> content(Renderable... childrenElements) {
		return asList(childrenElements);
	}

}
