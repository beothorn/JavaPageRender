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
	 * The <strong>HTML &lt;b&gt; Element</strong> represents a span of text stylistically 
	 * different from normal text, without conveying any special importance or relevance. It is typically 
	 * used for keywords in a summary, product names in a review, or other spans of text whose typical 
	 * presentation would be boldfaced. Another example of its use is to mark the lead sentence of each 
	 * paragraph of an article.
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/b">Reference on developer.mozilla.org</a>
	 * 
	 * @param childrenElements value
	 * @return value
	 */
	public static DomElement b(
		final Renderable... childrenElements
	){
		return new DomElement("b", asList(childrenElements));
	}
	
	/***
	 * The <strong>HTML &lt;b&gt; Element</strong> represents a span of text stylistically 
	 * different from normal text, without conveying any special importance or relevance. It is typically 
	 * used for keywords in a summary, product names in a review, or other spans of text whose typical 
	 * presentation would be boldfaced. Another example of its use is to mark the lead sentence of each 
	 * paragraph of an article.
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/b">Reference on developer.mozilla.org</a>
	 * 
	 * @param text value
	 * @return value
	 */
	public static DomElement b(
		final String text
	){
		return new DomElement("b", asList(text(text)));
	}
	
	/***
	 * The <strong>HTML <em>&lt;button&gt;</em> Element</strong> represents a clickable button.
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/button">Reference on developer.mozilla.org</a>
	 * 
	 * @param childrenElements value
	 * @return value
	 */
	public static DomElement button(
		final DomElement... childrenElements
	){
		return new DomElement("button", childrenElements);
	}
	
	/***
	 * The HTML element<em>&nbsp;l</em><em>ine break&nbsp;</em>&lt;br&gt;&nbsp;produces a 
	 * line break in text (carriage-return). It is useful for writing a poem or an address, where 
	 * the division of lines is significant.
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/br">Reference on developer.mozilla.org</a>
	 * 
	 * @return value
	 */
	public static DomElement br() {
		return new Br();
	}
	
	/***
	 * The <strong>HTML &lt;div&gt; element</strong> (or <em>HTML Document Division 
	 * Element</em>) is the generic container for flow content, which does not inherently represent 
	 * anything. It can be used to group elements for styling purposes (using the <strong>class</strong> 
	 * or <strong>id</strong> attributes), or because they share attribute values, such as <strong>lang</strong>. 
	 * It should be used only when no other semantic element (
	 * such as <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/article"> 
	 * 
	 * The HTML &lt;article&gt; element represents a 
	 * self-contained composition in a document, page, application, or site, which is intended to be 
	 * independently distributable or reusable (e.g., in syndication). This could be a forum post, a magazine or 
	 * newspaper article, a blog entry, an object,&nbsp;or any other independent item of content. Each &lt;article&gt; 
	 * should be identified, typically by including a heading (&lt;h1&gt;-&lt;h6&gt; element) as a child of the &lt;article&gt; element.
	 * 
	 * &lt;article&gt;</a> or <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/nav">
	 * &lt;nav&gt;</a>) is appropriate.
	 * 
	 * The HTML &lt;nav&gt; element 
	 * (HTML Navigation Element) represents a section of a page that links to other pages or to parts within the page: 
	 * a section with navigation links.
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/div">Reference on developer.mozilla.org</a>
	 * 
	 * @param childrenElements value
	 * @return value
	 */
	public static DomElement div(
		final DomElement... childrenElements
	){
		return new DomElement("div", childrenElements);
	}
	
	/***
	 * The <strong>HTML &lt;div&gt; element</strong> (or <em>HTML Document Division 
	 * Element</em>) is the generic container for flow content, which does not inherently represent 
	 * anything. It can be used to group elements for styling purposes (using the <strong>class</strong> 
	 * or <strong>id</strong> attributes), or because they share attribute values, such as <strong>lang</strong>. 
	 * It should be used only when no other semantic element (
	 * such as <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/article">
	 * 
	 * The HTML &lt;article&gt; element represents a 
	 * self-contained composition in a document, page, application, or site, which is intended to be 
	 * independently distributable or reusable (e.g., in syndication). This could be a forum post, a magazine or 
	 * newspaper article, a blog entry, an object,&nbsp;or any other independent item of content. Each &lt;article&gt; 
	 * should be identified, typically by including a heading (&lt;h1&gt;-&lt;h6&gt; element) as a child of the &lt;article&gt; element.
	 * 
	 * &lt;article&gt;</a> or <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/nav">&lt;nav&gt;</a>) is appropriate.
	 * 
	 * The HTML &lt;nav&gt; element 
	 * (HTML Navigation Element) represents a section of a page that links to other pages or to parts within the page: 
	 * a section with navigation links.
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/div">Reference on developer.mozilla.org</a>
	 * 
	 * @param props value
	 * @param childrenElements value
	 * @return value
	 */
	public static DomElement div(
		final List<Attribute> props,
		final List<DomElement> childrenElements
	){
		return new DomElement("div", props, childrenElements);
	}
	
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
	 * <strong>Heading</strong> elements implement six levels of document headings, &lt;h1&gt; 
	 * is the most important and &lt;h6&gt; is the least. A heading element briefly describes 
	 * the topic of the section it introduces. Heading information may be used by user agents, for example, 
	 * to construct a table of contents for a document automatically.
	 *
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Reference on developer.mozilla.org</a>
	 *
	 * @param header value
	 * @param childrenElements value
	 * @return value
	 */
	public static DomElement header(
		final Header header,
		final DomElement... childrenElements
	){
		return new DomElement(header.toString().toLowerCase(), childrenElements);
	}
	
	/***
	 * <strong>Heading</strong> elements implement six levels of document headings, &lt;h1&gt; 
	 * is the most important and &lt;h6&gt; is the least. A heading element briefly describes 
	 * the topic of the section it introduces. Heading information may be used by user agents, for example, 
	 * to construct a table of contents for a document automatically.
	 *
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Reference on developer.mozilla.org</a>
	 *
	 * @param header value
	 * @param title value
	 * @return value
	 */
	public static DomElement header(
		final Header header,
		final String title
	){
		return new DomElement(header.toString().toLowerCase(), asList(text(title)));
	}
	
	/***
	 * <strong>Heading</strong> elements implement six levels of document headings, &lt;h1&gt; 
	 * is the most important and &lt;h6&gt; is the least. A heading element briefly describes 
	 * the topic of the section it introduces. Heading information may be used by user agents, for example, 
	 * to construct a table of contents for a document automatically.
	 *
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Reference on developer.mozilla.org</a>
	 *
	 * @param title value
	 * @return value
	 */
	public static DomElement h1(
		final String title
	){
		return new DomElement(Header.H1.toString().toLowerCase(), asList(text(title)).toArray(new Renderable[]{}));
	}
	
	/***
	 * <strong>Heading</strong> elements implement six levels of document headings, &lt;h1&gt; 
	 * is the most important and &lt;h6&gt; is the least. A heading element briefly describes 
	 * the topic of the section it introduces. Heading information may be used by user agents, for example, 
	 * to construct a table of contents for a document automatically.
	 *
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Reference on developer.mozilla.org</a>
	 *
	 * @param title value
	 * @return value
	 */
	public static DomElement h2(
		final String title
	){
		return new DomElement(Header.H2.toString().toLowerCase(), asList(text(title)));
	}
	
	/***
	 * <strong>Heading</strong> elements implement six levels of document headings, &lt;h1&gt; 
	 * is the most important and &lt;h6&gt; is the least. A heading element briefly describes 
	 * the topic of the section it introduces. Heading information may be used by user agents, for example, 
	 * to construct a table of contents for a document automatically.
	 *
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Reference on developer.mozilla.org</a>
	 *
	 * @param title value
	 * @return value
	 */
	public static DomElement h3(
		final String title
	){
		return new DomElement(Header.H3.toString().toLowerCase(), asList(text(title)));
	}
	
	/***
	 * <strong>Heading</strong> elements implement six levels of document headings, &lt;h1&gt; 
	 * is the most important and &lt;h6&gt; is the least. A heading element briefly describes 
	 * the topic of the section it introduces. Heading information may be used by user agents, for example, 
	 * to construct a table of contents for a document automatically.
	 *
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Reference on developer.mozilla.org</a>
	 *
	 * @param title value
	 * @return value
	 */
	public static DomElement h4(
		final String title
	){
		return new DomElement(Header.H4.toString().toLowerCase(), asList(text(title)));
	}
	
	/***
	 * <strong>Heading</strong> elements implement six levels of document headings, &lt;h1&gt; 
	 * is the most important and &lt;h6&gt; is the least. A heading element briefly describes 
	 * the topic of the section it introduces. Heading information may be used by user agents, for example, 
	 * to construct a table of contents for a document automatically.
	 *
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Reference on developer.mozilla.org</a>
	 *
	 * @param title value
	 * @return value
	 */
	public static DomElement h5(
		final String title
	){
		return new DomElement(Header.H5.toString().toLowerCase(), asList(text(title)));
	}
	
	/***
	 * <strong>Heading</strong> elements implement six levels of document headings, &lt;h1&gt; 
	 * is the most important and &lt;h6&gt; is the least. A heading element briefly describes 
	 * the topic of the section it introduces. Heading information may be used by user agents, for example, 
	 * to construct a table of contents for a document automatically.
	 *
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Reference on developer.mozilla.org</a>
	 *
	 * @param title value
	 * @return value
	 */
	public static DomElement h6(
		final String title
	){
		return new DomElement(Header.H6.toString().toLowerCase(), asList(text(title)));
	}
	
	/***
	 * The <strong>HTML &lt;p&gt; element</strong> (or <em>HTML Paragraph Element</em>) 
	 * represents a paragraph of text. Paragraphs are usually represented in visual media as blocks 
	 * of text that are separated from adjacent blocks by vertical blank space and/or first-line indentation. 
	 * Paragraphs are <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Block-level_elements">block-level elements</a>.
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/p">Reference on developer.mozilla.org</a>
	 * 
	 * @param childrenElements value
	 * @return value
	 */
	public static DomElement p(
		final DomElement... childrenElements
	){
		return new DomElement("p", childrenElements);
	}
	
	/***
	 * The <strong>HTML &lt;p&gt; element</strong> (or <em>HTML Paragraph Element</em>) 
	 * represents a paragraph of text.</span> Paragraphs are usually represented in visual media as blocks 
	 * of text that are separated from adjacent blocks by vertical blank space and/or first-line indentation. 
	 * Paragraphs are <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Block-level_elements">block-level elements</a>.
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/p">Reference on developer.mozilla.org</a>
	 *
	 * @param props value
	 * @param childrenElements value
	 * @return value
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

}
