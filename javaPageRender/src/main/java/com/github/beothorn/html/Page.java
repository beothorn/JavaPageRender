package com.github.beothorn.html;

import com.github.beothorn.html.elements.H1;
import com.github.beothorn.html.elements.Html;
import com.github.beothorn.html.elements.Text;

public class Page {

	public static com.github.beothorn.html.elements.Html html(DOMElement... childrenElements) {
		return new Html(childrenElements);
	}

	public static H1 h1(DOMElement... childrenElements){
		return new H1(childrenElements);
	}
	
	public static Text text(String content) {
		return new Text(content);
	}

}
