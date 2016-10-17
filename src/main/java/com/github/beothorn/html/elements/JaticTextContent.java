package com.github.beothorn.html.elements;

import java.util.List;

import com.github.beothorn.Attribute;
import com.github.beothorn.html.DomElement;
import com.github.beothorn.html.JaticHTMLElementFactory;

public class JaticTextContent {

    /***
     * The&nbsp;<strong>HTML <code>&lt;dd&gt;</code> element</strong>&nbsp;
     * (<em>HTML Description Element</em>) indicates the description of a term in
     * a description list (<a href="/en-US/docs/Web/HTML/Element/dl">
     * <code>&lt;dl&gt;</code></a>) element. This element can occur only as a child element of
     * a description list and it must follow a <a href="/en-US/docs/Web/HTML/Element/dt"><code>&lt;dt&gt;
     * </code></a> element.
     *
     * <br>
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/dd">Reference
     * on developer.mozilla.org</a>
     *
     * @param childrenElements value
     * @return value
     */
    public static DomElement dd(final DomElement... childrenElements) {
        return JaticHTMLElementFactory.get().elementWithContent("dd", childrenElements);
    }

    /***
     * The <strong>HTML &lt;div&gt; element</strong> (or <em>HTML Document
     * Division Element</em>) is the generic container for flow content, which
     * does not inherently represent anything. It can be used to group elements
     * for styling purposes (using the <strong>class</strong> or
     * <strong>id</strong> attributes), or because they share attribute values,
     * such as <strong>lang</strong>. It should be used only when no other
     * semantic element ( such as <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/article">
     *
     * The HTML &lt;article&gt; element represents a self-contained composition
     * in a document, page, application, or site, which is intended to be
     * independently distributable or reusable (e.g., in syndication). This
     * could be a forum post, a magazine or newspaper article, a blog entry, an
     * object,&nbsp;or any other independent item of content. Each
     * &lt;article&gt; should be identified, typically by including a heading
     * (&lt;h1&gt;-&lt;h6&gt; element) as a child of the &lt;article&gt;
     * element.
     *
     * &lt;article&gt;</a> or
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/nav">
     * &lt;nav&gt;</a>) is appropriate.
     *
     * The HTML &lt;nav&gt; element (HTML Navigation Element) represents a
     * section of a page that links to other pages or to parts within the page:
     * a section with navigation links.
     *
     * <br>
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/div">Reference
     * on developer.mozilla.org</a>
     *
     * @param childrenElements
     *            value
     * @return value
     */
    public static DomElement div(final DomElement... childrenElements) {
        return JaticHTMLElementFactory.get().elementWithContent("div", childrenElements);
    }

    /***
     * The <strong>HTML &lt;div&gt; element</strong> (or <em>HTML Document
     * Division Element</em>) is the generic container for flow content, which
     * does not inherently represent anything. It can be used to group elements
     * for styling purposes (using the <strong>class</strong> or
     * <strong>id</strong> attributes), or because they share attribute values,
     * such as <strong>lang</strong>. It should be used only when no other
     * semantic element ( such as <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/article">
     *
     * The HTML &lt;article&gt; element represents a self-contained composition
     * in a document, page, application, or site, which is intended to be
     * independently distributable or reusable (e.g., in syndication). This
     * could be a forum post, a magazine or newspaper article, a blog entry, an
     * object,&nbsp;or any other independent item of content. Each
     * &lt;article&gt; should be identified, typically by including a heading
     * (&lt;h1&gt;-&lt;h6&gt; element) as a child of the &lt;article&gt;
     * element.
     *
     * &lt;article&gt;</a> or <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/nav">&lt;nav&gt;</a>)
     * is appropriate.
     *
     * The HTML &lt;nav&gt; element (HTML Navigation Element) represents a
     * section of a page that links to other pages or to parts within the page:
     * a section with navigation links.
     *
     * <br>
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/div">Reference
     * on developer.mozilla.org</a>
     *
     * @param props
     *            value
     * @param childrenElements
     *            value
     * @return value
     */
    public static DomElement div(final List<Attribute> props, final List<DomElement> childrenElements) {
        return JaticHTMLElementFactory.get().elementWithContent("div", props, childrenElements);
    }

    /***
     * The <strong>HTML <code>&lt;dl&gt;</code> element</strong> (or
     * <em>HTML</em> <em>Description List Element</em>) encloses a list of
     * pairs of terms and descriptions. Common uses for this element are to
     * implement a glossary or to display metadata (a list of key-value pairs).
     *
     * <br>
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/dl">Reference
     * on developer.mozilla.org</a>
     *
     * @param childrenElements value
     * @return value
     */
    public static DomElement dl(final DomElement... childrenElements) {
        return JaticHTMLElementFactory.get().elementWithContent("dl", childrenElements);
    }

    /***
     * The <strong>HTML <code>&lt;dt&gt;</code> element</strong>
     * (or <em>HTML Definition Term Element</em>) identifies a term in a
     * definition list. This element can occur only as a child element of a
     * <a href="/en-US/docs/Web/HTML/Element/dl"><code>&lt;dl&gt;</code></a>. It is usually
     * followed by a <a href="/en-US/docs/Web/HTML/Element/dd"><code>&lt;dd&gt;</code></a> element;
     * however, multiple <code>&lt;dt&gt;</code> elements in a row indicate several terms that are
     * all defined by the immediate next <a href="/en-US/docs/Web/HTML/Element/dd">
     * <code>&lt;dd&gt;</code></a> element.
     *
     * <br>
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/dt">Reference
     * on developer.mozilla.org</a>
     *
     * @param childrenElements value
     * @return value
     */
    public static DomElement dt(final DomElement... childrenElements) {
        return JaticHTMLElementFactory.get().elementWithContent("dt", childrenElements);
    }

    /***
     * The <strong>HTML <code>&lt;figcaption&gt;</code> element</strong> represents a
     * caption or a legend associated with a figure or an illustration described by the
     * rest of the data of the <a href="/en-US/docs/Web/HTML/Element/figure">
     * <code>&lt;figure&gt;</code></a> element which is its immediate ancestor which means
     * <code>&lt;figcaption&gt;</code> can be the first or last element inside a
     * <a href="/en-US/docs/Web/HTML/Element/figure" ><code>&lt;figure&gt;</code></a> block.&nbsp;Also,
     *  the <em>HTML Figcaption Element&nbsp;</em>is optional; if not provided, then the
     *  parent figure element will have no caption.
     *
     * <br>
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/figcaption">Reference
     * on developer.mozilla.org</a>
     *
     * @param childrenElements value
     * @return value
     */
    public static DomElement figCaption(final DomElement... childrenElements) {
        return JaticHTMLElementFactory.get().elementWithContent("figcaption", childrenElements);
    }

    /***
     * The <strong>HTML <code>&lt;figure&gt;</code> element</strong> represents self-contained content,
     * frequently with a caption&nbsp;(<a href="/en-US/docs/Web/HTML/Element/figcaption">
     * <code>&lt;figcaption&gt;</code></a>)<em><code>,</code></em> and is&nbsp;typically referenced
     * as a single unit. While it is related to the main flow, its position is independent of the main
     * flow. Usually this is an image, an illustration, a diagram, a code snippet, or a schema that is
     * referenced in the main text, but that can be moved to another page or to an appendix without
     * affecting the main flow.
     *
     * <br>
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/figure">Reference
     * on developer.mozilla.org</a>
     *
     * @param childrenElements value
     * @return value
     */
    public static DomElement figure(final DomElement... childrenElements) {
        return JaticHTMLElementFactory.get().elementWithContent("figure", childrenElements);
    }

    /***
     * The <strong>HTML <code>&lt;hr&gt;</code> element</strong> represents a thematic break
     * between paragraph-level elements (for example, a change of scene in a story, or a shift
     * of topic with a section). In previous versions of HTML, it represented a horizontal rule.
     * It may still be displayed as a horizontal rule in visual browsers, but is now defined in
     * semantic terms, rather than presentational terms.
     *
     * <br>
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/hr">Reference
     * on developer.mozilla.org</a>
     *
     * @return value
     */
    public static DomElement hr() {
        return JaticHTMLElementFactory.get().emptyElement("hr");
    }

    /***
     * The <strong>HTML <code>&lt;li&gt;</code> element</strong> (or <em>HTML List Item
     * Element</em>) is used to represent an item in a list. It must be contained in a parent
     * element: an ordered list (<a href="/en-US/docs/Web/HTML/Element/ol">
     * <code>&lt;ol&gt;</code></a>), an unordered list (<a href="/en-US/docs/Web/HTML/Element/ul">
     * <code>&lt;ul&gt;</code></a>), or a menu (<a href="/en-US/docs/Web/HTML/Element/menu">
     *  <code>&lt;menu&gt;</code></a>). In menus and unordered lists, list items are usually displayed
     *   using bullet points. In ordered lists, they are usually displayed with an ascending counter
     *   on the left, such as a number or letter.
     *
     * <br>
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/li">Reference
     * on developer.mozilla.org</a>
     *
     * @param childrenElements value
     * @return value
     */
    public static DomElement li(final DomElement... childrenElements) {
        return JaticHTMLElementFactory.get().elementWithContent("li", childrenElements);
    }

    /***
     * The <strong>HTML <code>&lt;main&gt;</code> element</strong> represents the main content of&nbsp;
     * the <a href="/en-US/docs/Web/HTML/Element/body"><code>&lt;body&gt;</code></a> of
     * a document or application. The main content area consists of content that is directly
     * related to, or expands upon the central topic of a document or the central functionality
     *  of an application. This content should be unique to the document, excluding any content
     *  that is repeated across a set of documents such as sidebars, navigation links, copyright
     *  information, site logos, and search forms (unless&nbsp;the document's main function is as
     *  a search form).
     *
     * <br>
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/main">Reference
     * on developer.mozilla.org</a>
     *
     * @param childrenElements value
     * @return value
     */
    public static DomElement main(final DomElement... childrenElements) {
        return JaticHTMLElementFactory.get().elementWithContent("main", childrenElements);
    }

    /***
     * The <strong>HTML <code>&lt;ol&gt;</code> Element</strong> (or <em>HTML Ordered List
     * Element</em>) represents an ordered list of items. Typically, ordered-list items are
     * displayed with a preceding numbering, which can be of any form, like numerals, letters
     * or Romans numerals or even simple bullets. This numbered style is not defined in the HTML
     * description of the page, but in its associated CSS, using the
     * <a href="/en-US/docs/Web/CSS/list-style-type"><code>list-style-type</code></a> property.
     *
     * <br>
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/ol">Reference
     * on developer.mozilla.org</a>
     *
     * @param childrenElements value
     * @return value
     */
    public static DomElement ol(final DomElement... childrenElements) {
        return JaticHTMLElementFactory.get().elementWithContent("ol", childrenElements);
    }

    /***
     * The <strong>HTML &lt;p&gt; element</strong> (or <em>HTML Paragraph
     * Element</em>) represents a paragraph of text. Paragraphs are usually
     * represented in visual media as blocks of text that are separated from
     * adjacent blocks by vertical blank space and/or first-line indentation.
     * Paragraphs are <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Block-level_elements">block-level
     * elements</a>.
     *
     * <br>
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/p">Reference
     * on developer.mozilla.org</a>
     *
     * @param childrenElements  value
     * @return value
     */
    public static DomElement p(final DomElement... childrenElements) {
        return JaticHTMLElementFactory.get().elementWithContent("p", childrenElements);
    }

    /***
     * The <strong>HTML &lt;p&gt; element</strong> (or <em>HTML Paragraph
     * Element</em>) represents a paragraph of text. Paragraphs are usually
     * represented in visual media as blocks of text that are separated from
     * adjacent blocks by vertical blank space and/or first-line indentation.
     * Paragraphs are <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Block-level_elements">block-level
     * elements</a>.
     *
     * <br>
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/p">Reference
     * on developer.mozilla.org</a>
     *
     * @param props
     *            value
     * @param childrenElements
     *            value
     * @return value
     */
    public static DomElement p(final List<Attribute> props, final List<DomElement> childrenElements) {
        return JaticHTMLElementFactory.get().elementWithContent("p", props, childrenElements);
    }

    /***
     * The <strong>HTML <code>&lt;pre&gt;</code> element</strong> (or <em>HTML Preformatted Text</em>)
     * represents preformatted text. Text within this element is typically displayed in a non-proportional
     * ("<a href="/en-US/docs/XUL/Style/monospace">monospace</a>") font exactly as it is laid out in the
     * file. Whitespace inside this element is displayed as typed.
     *
     * <br>
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/pre">Reference
     * on developer.mozilla.org</a>
     *
     * @param childrenElements values
     * @return value
     */
    public static DomElement pre(final DomElement... childrenElements) {
        return JaticHTMLElementFactory.get().elementWithContent("pre", childrenElements);
    }

    /***
     * The<strong> HTML <code>&lt;ul&gt;</code> element</strong> (or <em>HTML U</em><em>nordered
     * List Element</em><code>)</code> represents an unordered list of items, namely a
     * collection of items that do not have a numerical ordering, and their order in the
     * list is meaningless. Typically, unordered-list items are displayed with a bullet,
     * which can be of several forms, like a dot, a circle or a squared. The bullet style is
     * not defined in the HTML description of the page, but in its associated CSS, using the
     *  <a href="/en-US/docs/Web/CSS/list-style-type"><code>list-style-type</code></a> property.
     *
     * <br>
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/ul">Reference
     * on developer.mozilla.org</a>
     *
     * @param childrenElements value
     * @return value
     */
    public static DomElement ul(final DomElement... childrenElements) {
        return JaticHTMLElementFactory.get().elementWithContent("ul", childrenElements);
    }

}
