package com.github.beothorn.html;

import java.util.List;

import com.github.beothorn.Attribute;
import com.github.beothorn.html.elements.DomElement;

public class JPRImageAndMultimedia {

	/***
	 * <p>The <strong>HTML &lt;img&gt; element</strong> represents an image in the document.</p>
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/img">Reference on developer.mozilla.org</a>
	 *
	 * @param childrenElements value
	 */
	public static DomElement img(
		final DomElement... childrenElements
	){
		return new DomElement("img", childrenElements);
	}
	
	/***
	 * The HTML &lt;img&gt; element represents an image in the document.
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/img">Reference on developer.mozilla.org</a>
	 *
	 * @param props value
	 * @param childrenElements value
	 * 
	 * @return value
	 */
	public static DomElement img(
		final List<Attribute> props, 
		final List<DomElement> childrenElements
	){
		return new DomElement("img", props, childrenElements);
	}
}
