package com.github.beothorn.html.elements;

import static java.util.Arrays.asList;

import java.util.List;

import com.github.beothorn.html.Renderable;
import com.github.beothorn.html.common.Attribute;
import com.github.beothorn.html.common.UntaggedContent;

/***
 * This class contains static constructors for the HTML 
 * elements described at the HTML element reference on
 * 
 * <br>
 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element">Reference on developer.mozilla.org</a>
 */
public class Page {
	
	/***
	 * The <strong>HTML <code>&lt;html&gt;</code> element</strong> (or <em>HTML root element</em>) 
	 * represents the root of an HTML document. All other elements must be descendants of this element.
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/html">Reference on developer.mozilla.org</a>
	 * 
	 * @param childrenElements All elements contained inside the html tag
	 * @return
	 */
	public static Renderable html(
		final DomElement... childrenElements
	) {
		return new DomElement("html", childrenElements);
	}

	/***
	 * <td>The <strong>HTML <code>&lt;b&gt;</code> Element</strong> represents a span of text stylistically 
	 * different from normal text, without conveying any special importance or relevance. It is typically 
	 * used for keywords in a summary, product names in a review, or other spans of text whose typical 
	 * presentation would be boldfaced. Another example of its use is to mark the lead sentence of each 
	 * paragraph of an article.</td>
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/b">Reference on developer.mozilla.org</a>
	 * 
	 * @param childrenElements
	 * @return
	 */
	public static DomElement b(
		final Renderable... childrenElements
	){
		return new DomElement("b", asList(childrenElements));
	}
	
	/***
	 * <td>The <strong>HTML <code>&lt;b&gt;</code> Element</strong> represents a span of text stylistically 
	 * different from normal text, without conveying any special importance or relevance. It is typically 
	 * used for keywords in a summary, product names in a review, or other spans of text whose typical 
	 * presentation would be boldfaced. Another example of its use is to mark the lead sentence of each 
	 * paragraph of an article.</td>
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/b">Reference on developer.mozilla.org</a>
	 * 
	 * @param childrenElements
	 * @return
	 */
	public static DomElement b(
		final String text
	){
		return new DomElement("b", asList(text(text)));
	}
	
	/***
	 * The <strong>HTML <em><code>&lt;button&gt;</code></em> Element</strong> represents a clickable button.
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/button">Reference on developer.mozilla.org</a>
	 * 
	 * @param childrenElements
	 * @return
	 */
	public static DomElement button(
		final DomElement... childrenElements
	){
		return new DomElement("button", childrenElements);
	}
	
	/***
	 * The HTML element<em>&nbsp;l</em><em>ine break&nbsp;</em><code>&lt;br&gt;</code>&nbsp;produces a 
	 * line break in text (carriage-return). It is useful for writing a poem or an address, where 
	 * the division of lines is significant.
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/br">Reference on developer.mozilla.org</a>
	 * 
	 * @return
	 */
	public static DomElement br() {
		return new Br();
	}
	
	/***
	 * The <strong>HTML <code>&lt;div&gt;</code> element</strong> (or <em>HTML Document Division 
	 * Element</em>) is the generic container for flow content, which does not inherently represent 
	 * anything. It can be used to group elements for styling purposes (using the <strong>class</strong> 
	 * or <strong>id</strong> attributes), or because they share attribute values, such as <strong>lang</strong>. 
	 * It should be used only when no other semantic element (
	 * such as <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/article" title="The HTML <article> element represents a 
	 * self-contained composition in a document, page, application, or site, which is intended to be 
	 * independently distributable or reusable (e.g., in syndication). This could be a forum post, a magazine or 
	 * newspaper article, a blog entry, an object,&nbsp;or any other independent item of content. Each <article> 
	 * should be identified, typically by including a heading (<h1>-<h6> element) as a child of the <article> element.">
	 * <code>&lt;article&gt;</code></a> or <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/nav" title="The HTML <nav> element 
	 * (HTML Navigation Element) represents a section of a page that links to other pages or to parts within the page: 
	 * a section with navigation links."><code>&lt;nav&gt;</code></a>) is appropriate.
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/div">Reference on developer.mozilla.org</a>
	 * 
	 * @param childrenElements
	 * @return
	 */
	public static DomElement div(
		final DomElement... childrenElements
	){
		return new DomElement("div", childrenElements);
	}
	
	/***
	 * The <strong>HTML <code>&lt;div&gt;</code> element</strong> (or <em>HTML Document Division 
	 * Element</em>) is the generic container for flow content, which does not inherently represent 
	 * anything. It can be used to group elements for styling purposes (using the <strong>class</strong> 
	 * or <strong>id</strong> attributes), or because they share attribute values, such as <strong>lang</strong>. 
	 * It should be used only when no other semantic element (
	 * such as <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/article" title="The HTML <article> element represents a 
	 * self-contained composition in a document, page, application, or site, which is intended to be 
	 * independently distributable or reusable (e.g., in syndication). This could be a forum post, a magazine or 
	 * newspaper article, a blog entry, an object,&nbsp;or any other independent item of content. Each <article> 
	 * should be identified, typically by including a heading (<h1>-<h6> element) as a child of the <article> element.">
	 * <code>&lt;article&gt;</code></a> or <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/nav" title="The HTML <nav> element 
	 * (HTML Navigation Element) represents a section of a page that links to other pages or to parts within the page: 
	 * a section with navigation links."><code>&lt;nav&gt;</code></a>) is appropriate.
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/div">Reference on developer.mozilla.org</a>
	 * 
	 * @param childrenElements
	 * @return
	 */
	public static DomElement div(
		final List<Attribute> props,
		final List<DomElement> childrenElements
	){
		return new DomElement("div", props, childrenElements);
	}
	
	/***
	 * <p>The <strong>HTML <code>&lt;img&gt;</code> element</strong> represents an image in the document.</p>
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/img">Reference on developer.mozilla.org</a>
	 *
	 */
	public static DomElement img(
		final DomElement... childrenElements
	){
		return new DomElement("img", childrenElements);
	}
	
	/***
	 * The HTML <img> element represents an image in the document.
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/img">Reference on developer.mozilla.org</a>
	 *
	 */
	public static DomElement img(
		final List<Attribute> props, 
		final List<DomElement> childrenElements
	){
		return new DomElement("img", props, childrenElements);
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
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Reference on developer.mozilla.org</a>
	 *
	 * @param header
	 * @param childrenElements
	 * @return
	 */
	public static DomElement header(
		final Header header,
		final DomElement... childrenElements
	){
		return new DomElement(header.toString().toLowerCase(), childrenElements);
	}
	
	/***
	 * <strong>Heading</strong> elements implement six levels of document headings, <code>&lt;h1&gt;</code> 
	 * is the most important and <code>&lt;h6&gt;</code> is the least. A heading element briefly describes 
	 * the topic of the section it introduces. Heading information may be used by user agents, for example, 
	 * to construct a table of contents for a document automatically.
	 *
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Reference on developer.mozilla.org</a>
	 *
	 * @param header
	 * @param title
	 * @return
	 */
	public static DomElement header(
		final Header header,
		final String title
	){
		return new DomElement(header.toString().toLowerCase(), asList(text(title)));
	}
	
	/***
	 * <strong>Heading</strong> elements implement six levels of document headings, <code>&lt;h1&gt;</code> 
	 * is the most important and <code>&lt;h6&gt;</code> is the least. A heading element briefly describes 
	 * the topic of the section it introduces. Heading information may be used by user agents, for example, 
	 * to construct a table of contents for a document automatically.
	 *
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Reference on developer.mozilla.org</a>
	 *
	 * @param header
	 * @param title
	 * @return
	 */
	public static DomElement h1(
		final String title
	){
		return new DomElement(Header.H1.toString().toLowerCase(), asList(text(title)).toArray(new Renderable[]{}));
	}
	
	/***
	 * <strong>Heading</strong> elements implement six levels of document headings, <code>&lt;h1&gt;</code> 
	 * is the most important and <code>&lt;h6&gt;</code> is the least. A heading element briefly describes 
	 * the topic of the section it introduces. Heading information may be used by user agents, for example, 
	 * to construct a table of contents for a document automatically.
	 *
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Reference on developer.mozilla.org</a>
	 *
	 * @param header
	 * @param title
	 * @return
	 */
	public static DomElement h2(
		final String title
	){
		return new DomElement(Header.H2.toString().toLowerCase(), asList(text(title)));
	}
	
	/***
	 * <strong>Heading</strong> elements implement six levels of document headings, <code>&lt;h1&gt;</code> 
	 * is the most important and <code>&lt;h6&gt;</code> is the least. A heading element briefly describes 
	 * the topic of the section it introduces. Heading information may be used by user agents, for example, 
	 * to construct a table of contents for a document automatically.
	 *
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Reference on developer.mozilla.org</a>
	 *
	 * @param header
	 * @param title
	 * @return
	 */
	public static DomElement h3(
		final String title
	){
		return new DomElement(Header.H3.toString().toLowerCase(), asList(text(title)));
	}
	
	/***
	 * <strong>Heading</strong> elements implement six levels of document headings, <code>&lt;h1&gt;</code> 
	 * is the most important and <code>&lt;h6&gt;</code> is the least. A heading element briefly describes 
	 * the topic of the section it introduces. Heading information may be used by user agents, for example, 
	 * to construct a table of contents for a document automatically.
	 *
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Reference on developer.mozilla.org</a>
	 *
	 * @param header
	 * @param title
	 * @return
	 */
	public static DomElement h4(
		final String title
	){
		return new DomElement(Header.H4.toString().toLowerCase(), asList(text(title)));
	}
	
	/***
	 * <strong>Heading</strong> elements implement six levels of document headings, <code>&lt;h1&gt;</code> 
	 * is the most important and <code>&lt;h6&gt;</code> is the least. A heading element briefly describes 
	 * the topic of the section it introduces. Heading information may be used by user agents, for example, 
	 * to construct a table of contents for a document automatically.
	 *
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Reference on developer.mozilla.org</a>
	 *
	 * @param header
	 * @param title
	 * @return
	 */
	public static DomElement h5(
		final String title
	){
		return new DomElement(Header.H5.toString().toLowerCase(), asList(text(title)));
	}
	
	/***
	 * <strong>Heading</strong> elements implement six levels of document headings, <code>&lt;h1&gt;</code> 
	 * is the most important and <code>&lt;h6&gt;</code> is the least. A heading element briefly describes 
	 * the topic of the section it introduces. Heading information may be used by user agents, for example, 
	 * to construct a table of contents for a document automatically.
	 *
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Reference on developer.mozilla.org</a>
	 *
	 * @param header
	 * @param title
	 * @return
	 */
	public static DomElement h6(
		final String title
	){
		return new DomElement(Header.H6.toString().toLowerCase(), asList(text(title)));
	}
	
	/***
	 * The <strong>HTML <code>&lt;p&gt;</code> element</strong> (or <em>HTML Paragraph Element</em>) 
	 * represents a paragraph of text.</span> Paragraphs are usually represented in visual media as blocks 
	 * of text that are separated from adjacent blocks by vertical blank space and/or first-line indentation. 
	 * Paragraphs are <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Block-level_elements">block-level elements</a>.
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/p">Reference on developer.mozilla.org</a>
	 * 
	 * @param childrenElements
	 * @return
	 */
	public static DomElement p(
		final DomElement... childrenElements
	){
		return new DomElement("p", childrenElements);
	}
	
	/***
	 * The <strong>HTML <code>&lt;p&gt;</code> element</strong> (or <em>HTML Paragraph Element</em>) 
	 * represents a paragraph of text.</span> Paragraphs are usually represented in visual media as blocks 
	 * of text that are separated from adjacent blocks by vertical blank space and/or first-line indentation. 
	 * Paragraphs are <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Block-level_elements">block-level elements</a>.
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/p">Reference on developer.mozilla.org</a>
	 * 
	 * @param childrenElements
	 * @return
	 */
	public static DomElement p(
		final List<Attribute> props,
		final List<DomElement> childrenElements
	){
		return new DomElement("p", props, childrenElements);
	}

	//--------------------------
	
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
		return new Text(content);
	}
	
	/***
	 * Shortcut to join multiple renderables on a single list.
	 * 
	 * @param childrenElements
	 * @return
	 */
	public static List<DomElement> content(
		final DomElement... childrenElements
	) {
		return asList(childrenElements);
	}
	
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

}
