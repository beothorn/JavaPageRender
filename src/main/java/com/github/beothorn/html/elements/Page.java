package com.github.beothorn.html.elements;

import static java.util.Arrays.asList;

import java.util.List;

import org.apache.commons.lang3.StringEscapeUtils;

import com.github.beothorn.html.Renderable;
import com.github.beothorn.html.common.SimpleTag;
import com.github.beothorn.html.common.UntaggedContent;
import com.github.beothorn.html.elements.button.Button;
import com.github.beothorn.html.elements.img.Img;
import com.github.beothorn.html.elements.img.ImgAttrs;

/***
 * This class contains static constructors for the HTML 
 * elements described at the HTML element reference on
 * https://developer.mozilla.org/en-US/docs/Web/HTML/Element
 *
 */
public class Page {

	/***
	 * Used to wrap renderables at the same hierarchy level as a single renderable.
	 * 
	 * @param childrenElements
	 * @return
	 */
	public static Renderable wrap(
		final Renderable... childrenElements
	) {
		return new UntaggedContent(asList(childrenElements));
	}
	
	/***
	 * The <strong>HTML <code>&lt;html&gt;</code> element</strong> (or <em>HTML root element</em>) 
	 * represents the root of an HTML document. All other elements must be descendants of this element.
	 * 
	 * https://developer.mozilla.org/en-US/docs/Web/HTML/Element
	 * 
	 * @param childrenElements All elements contained inside the html tag
	 * @return
	 */
	public static Renderable html(
		final Renderable... childrenElements
	) {
		return new SimpleTag("html", asList(childrenElements));
	}

	/***
	 * The <strong>HTML <em><code>&lt;button&gt;</code></em> Element</strong> represents a clickable button.
	 * 
	 * https://developer.mozilla.org/en-US/docs/Web/HTML/Element/button
	 * 
	 * @param childrenElements
	 * @return
	 */
	public static Renderable button(
		final Renderable... childrenElements
	){
		return new Button(childrenElements);
	}
	
	/***
	 * <p>The <strong>HTML <code>&lt;img&gt;</code> element</strong> represents an image in the document.</p>
	 * 
	 * https://developer.mozilla.org/en-US/docs/Web/HTML/Element/img
	 *
	 */
	public static Renderable img(
		final Renderable... childrenElements
	){
		return new Img(childrenElements);
	}
	
	/***
	 * The HTML <img> element represents an image in the document.
	 * 
	 * https://developer.mozilla.org/en-US/docs/Web/HTML/Element/img
	 *
	 */
	public static Renderable img(
		final List<ImgAttrs> props, 
		final List<Renderable> childrenElements
	){
		return new Img(props, childrenElements);
	}
	
	public enum Header{
		H1, H2, H3, H4, H5, H6
	}
	
	/***
	 * <strong>Heading</strong> elements implement six levels of document headings, <code>&lt;h1&gt;</code> 
	 * is the most important and <code>&lt;h6&gt;</code> is the least. A heading element briefly describes 
	 * the topic of the section it introduces. Heading information may be used by user agents, for example, 
	 * to construct a table of contents for a document automatically.
	 *
	 * https://developer.mozilla.org/en-US/docs/Web/HTML/Element
	 *
	 * @param header
	 * @param childrenElements
	 * @return
	 */
	public static Renderable header(
		final Header header,
		final Renderable... childrenElements
	){
		return new SimpleTag(header.toString().toLowerCase(), asList(childrenElements));
	}
	
	/***
	 * <strong>Heading</strong> elements implement six levels of document headings, <code>&lt;h1&gt;</code> 
	 * is the most important and <code>&lt;h6&gt;</code> is the least. A heading element briefly describes 
	 * the topic of the section it introduces. Heading information may be used by user agents, for example, 
	 * to construct a table of contents for a document automatically.
	 *
	 * https://developer.mozilla.org/en-US/docs/Web/HTML/Element
	 *
	 * @param header
	 * @param title
	 * @return
	 */
	public static Renderable header(
		final Header header,
		final String title
	){
		return new SimpleTag(header.toString().toLowerCase(), asList(text(title)));
	}
	
	/***
	 * <td>The <strong>HTML <code>&lt;b&gt;</code> Element</strong> represents a span of text stylistically 
	 * different from normal text, without conveying any special importance or relevance. It is typically 
	 * used for keywords in a summary, product names in a review, or other spans of text whose typical 
	 * presentation would be boldfaced. Another example of its use is to mark the lead sentence of each 
	 * paragraph of an article.</td>
	 * 
	 * https://developer.mozilla.org/en-US/docs/Web/HTML/Element
	 * 
	 * @param childrenElements
	 * @return
	 */
	public static Renderable b(
		final Renderable... childrenElements
	){
		return new SimpleTag("b", asList(childrenElements));
	}
	
	/***
	 * <td>The <strong>HTML <code>&lt;b&gt;</code> Element</strong> represents a span of text stylistically 
	 * different from normal text, without conveying any special importance or relevance. It is typically 
	 * used for keywords in a summary, product names in a review, or other spans of text whose typical 
	 * presentation would be boldfaced. Another example of its use is to mark the lead sentence of each 
	 * paragraph of an article.</td>
	 * 
	 * https://developer.mozilla.org/en-US/docs/Web/HTML/Element
	 * 
	 * @param childrenElements
	 * @return
	 */
	public static Renderable b(
		final String text
	){
		return new SimpleTag("b", asList(text(text)));
	}
	
	/***
	 * Used to render a tagless piece of text.
	 * This text will be escaped
	 * 
	 * @param content
	 * @return
	 */
	public static Text text(
		final String content
	) {
		return new Text(StringEscapeUtils.escapeHtml4(content));
	}

	/***
	 * The HTML element<em>&nbsp;l</em><em>ine break&nbsp;</em><code>&lt;br&gt;</code>&nbsp;produces a 
	 * line break in text (carriage-return). It is useful for writing a poem or an address, where 
	 * the division of lines is significant.
	 * 
	 * https://developer.mozilla.org/en-US/docs/Web/HTML/Element/br
	 * 
	 * @return
	 */
	public static Renderable br() {
		return new Br();
	}

	/***
	 * Shortcut to join multiple renderables on a single list.
	 * 
	 * @param childrenElements
	 * @return
	 */
	public static List<Renderable> content(
		final Renderable... childrenElements
	) {
		return asList(childrenElements);
	}

}
