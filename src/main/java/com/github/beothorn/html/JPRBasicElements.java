package com.github.beothorn.html;

import static java.util.Arrays.asList;

import java.util.List;

import com.github.beothorn.Renderable;
import com.github.beothorn.html.common.UntaggedContent;
import com.github.beothorn.html.elements.DomElement;
import com.github.beothorn.html.elements.Text;

/***
 * This class contains static constructors for the HTML 
 * elements described at the HTML element reference on
 * 
 * <br>
 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element">Reference on developer.mozilla.org</a>
 */
public class JPRBasicElements {
	
	/***
	 * The <strong>HTML &lt;html&gt; element</strong> (or <em>HTML root element</em>) 
	 * represents the root of an HTML document. All other elements must be descendants of this element.
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/html">Reference on developer.mozilla.org</a>
	 * 
	 * @param childrenElements All elements contained inside the html tag value
	 * @return value
	 */
	public static Renderable html(
		final DomElement... childrenElements
	) {
		return new DomElement("html", childrenElements);
	}
	
	/***
	 * The <strong>HTML &lt;body&gt; Element</strong> represents the content of an HTML&nbsp;document. 
	 * There can be only one &lt;body&gt; element in a document.
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/body">Reference on developer.mozilla.org</a>
	 * 
	 * @param childrenElements value
	 * @return value
	 */
	public static DomElement body(
		final DomElement... childrenElements
	) {
		return new DomElement("body", childrenElements);
	}

	/***
	 * Used to render a tagless piece of text.
	 * This text will be escaped
	 * 
	 * @param content value
	 * @return value
	 */
	public static Text text(
		final String content
	) {
		return new Text(content);
	}
	
	/***
	 * Shortcut to join multiple renderables on a single list.
	 * 
	 * @param childrenElements value
	 * @return value
	 */
	public static List<DomElement> content(
		final DomElement... childrenElements
	) {
		return asList(childrenElements);
	}
	
	/***
	 * Used to wrap renderables at the same hierarchy level as a single renderable.
	 * 
	 * @param childrenElements value
	 * @return value
	 */
	public static Renderable wrap(
		final Renderable... childrenElements
	) {
		return new UntaggedContent(asList(childrenElements));
	}
	
	/***
	 * Used to wrap renderables at the same hierarchy level as a single domElement.
	 * 
	 * @param childrenElements value
	 * @return value
	 */
	public static DomElement wrapDom(
		final Renderable... childrenElements
	) {
		return new UntaggedContent(asList(childrenElements));
	}
}
