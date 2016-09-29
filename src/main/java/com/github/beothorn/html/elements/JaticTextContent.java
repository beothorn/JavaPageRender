package com.github.beothorn.html.elements;

import java.util.List;

import com.github.beothorn.Attribute;
import com.github.beothorn.html.DomElement;
import com.github.beothorn.html.JaticHTMLElementFactory;

public class JaticTextContent {

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
     * @param childrenElements
     *            value
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

}
