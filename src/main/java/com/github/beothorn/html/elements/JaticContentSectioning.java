package com.github.beothorn.html.elements;

import static java.util.Arrays.asList;

import com.github.beothorn.Renderable;
import com.github.beothorn.html.DomElement;
import com.github.beothorn.html.JaticHTMLElementFactory;
import com.github.beothorn.html.elements.types.Header;

public class JaticContentSectioning {

    /***
     * The <strong>HTML&nbsp;<code>&lt;address&gt;</code> element</strong> supplies contact information for
     * its nearest <a href="/en-US/docs/Web/HTML/Element/article"><code>&lt;article&gt;</code></a> or <a href="/en-US/docs/Web/HTML/Element/body">
     * <code>&lt;body&gt;</code></a> ancestor; in the latter case, it applies to
     * the whole document.
     *
     * <br>
     * <a href= "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/address">Reference on developer.mozilla.org</a>
     *
     * @param childrenElements value
     * @return value
     */
    public static DomElement address(final DomElement... childrenElements) {
        return JaticHTMLElementFactory.get().elementWithContent("address", childrenElements);
    }

    /***
     * The <strong>HTML <code>&lt;article&gt;</code> element</strong> represents a self-contained
     * composition in a document, page, application, or site, which is intended to be independently
     * distributable or reusable (e.g., in syndication). This could be a forum post, a magazine or
     * newspaper article, a blog entry, an object,&nbsp;or any other independent item of content.
     * Each <code>&lt;article&gt;</code> should be identified, typically by including
     * a heading (<a href="/en-US/docs/Web/HTML/Element/Heading_Elements"><code>&lt;h1&gt;</code>
     * -<code>&lt;h6&gt;</code></a> element) as a child of the <code>&lt;article&gt;</code> element.
     *
     * <br>
     * <a href= "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/article">Reference on developer.mozilla.org</a>
     *
     * @param childrenElements value
     * @return value
     */
    public static DomElement article(final DomElement... childrenElements) {
        return JaticHTMLElementFactory.get().elementWithContent("article", childrenElements);
    }

    /***
     * The <em>HTML <code>&lt;aside&gt;</code> element</em> represents a section of the page with content
     * connected tangentially to the rest, which could be considered separate from that content. These
     * sections are often represented as sidebars or inserts. They often contain the definitions on the
     * sidebars, such as definitions from the glossary; there may also be other types of information, such as
     * related advertisements; the biography of the author; web applications; profile information or related
     * links on the blog.
     *
     * <br>
     * <a href= "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/aside">Reference on developer.mozilla.org</a>
     *
     * @param childrenElements value
     * @return value
     */
    public static DomElement aside(final DomElement... childrenElements) {
        return JaticHTMLElementFactory.get().elementWithContent("aside", childrenElements);
    }
    /***
     * The<strong> HTML <code>&lt;footer&gt;</code> element</strong> represents a footer for its
     * nearest <a href="/en-US/docs/Web/Guide/HTML/Sections_and_Outlines_of_an_HTML5_document#Defining_Sections_in_HTML5">sectioning content</a> or <a href="/en-US/docs/Web/Guide/HTML/Sections_and_Outlines_of_an_HTML5_document#Sectioning_root">sectioning
     * root</a> element. A footer typically contains information about the author of the section,
     * copyright data or links to related documents.
     *
     * <br>
     * <a href= "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/footer">Reference on developer.mozilla.org</a>
     *
     * @param childrenElements value
     * @return value
     */
    public static DomElement footer(final DomElement... childrenElements) {
        return JaticHTMLElementFactory.get().elementWithContent("aside", childrenElements);
    }

    /***
     * <strong>Heading</strong> elements implement six levels of document
     * headings, &lt;h1&gt; is the most important and &lt;h6&gt; is the least. A
     * heading element briefly describes the topic of the section it introduces.
     * Heading information may be used by user agents, for example, to construct
     * a table of contents for a document automatically.
     *
     * <br>
     * <a href= "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Reference on developer.mozilla.org</a>
     *
     * @param header
     *            value
     * @param childrenElements
     *            value
     * @return value
     */
    public static DomElement header(final Header header, final DomElement... childrenElements) {
        return JaticHTMLElementFactory.get().elementWithContent(header.toString().toLowerCase(), childrenElements);
    }

    /***
     * <strong>Heading</strong> elements implement six levels of document
     * headings, &lt;h1&gt; is the most important and &lt;h6&gt; is the least. A
     * heading element briefly describes the topic of the section it introduces.
     * Heading information may be used by user agents, for example, to construct
     * a table of contents for a document automatically.
     *
     * <br>
     * <a href= "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Reference on developer.mozilla.org</a>
     *
     * @param header
     *            value
     * @param title
     *            value
     * @return value
     */
    public static DomElement header(final Header header, final String title) {
        return JaticHTMLElementFactory.get().elementWithContent(header.toString().toLowerCase(), asList(JaticBasicElements.text(title)));
    }

    /***
     * <strong>Heading</strong> elements implement six levels of document
     * headings, &lt;h1&gt; is the most important and &lt;h6&gt; is the least. A
     * heading element briefly describes the topic of the section it introduces.
     * Heading information may be used by user agents, for example, to construct
     * a table of contents for a document automatically.
     *
     * <br>
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Reference
     * on developer.mozilla.org</a>
     *
     * @param title
     *            value
     * @return value
     */
    public static DomElement h1(final String title) {
        return JaticHTMLElementFactory.get().elementWithContent(
            Header.H1.toString().toLowerCase(),
            new Renderable[] { JaticBasicElements.text(title) }
        );
    }

    /***
     * <strong>Heading</strong> elements implement six levels of document
     * headings, &lt;h1&gt; is the most important and &lt;h6&gt; is the least. A
     * heading element briefly describes the topic of the section it introduces.
     * Heading information may be used by user agents, for example, to construct
     * a table of contents for a document automatically.
     *
     * <br>
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Reference
     * on developer.mozilla.org</a>
     *
     * @param title
     *            value
     * @return value
     */
    public static DomElement h2(final String title) {
        return JaticHTMLElementFactory.get().elementWithContent(Header.H2.toString().toLowerCase(), asList(JaticBasicElements.text(title)));
    }

    /***
     * <strong>Heading</strong> elements implement six levels of document
     * headings, &lt;h1&gt; is the most important and &lt;h6&gt; is the least. A
     * heading element briefly describes the topic of the section it introduces.
     * Heading information may be used by user agents, for example, to construct
     * a table of contents for a document automatically.
     *
     * <br>
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Reference
     * on developer.mozilla.org</a>
     *
     * @param title
     *            value
     * @return value
     */
    public static DomElement h3(final String title) {
        return JaticHTMLElementFactory.get().elementWithContent(Header.H3.toString().toLowerCase(), asList(JaticBasicElements.text(title)));
    }

    /***
     * <strong>Heading</strong> elements implement six levels of document
     * headings, &lt;h1&gt; is the most important and &lt;h6&gt; is the least. A
     * heading element briefly describes the topic of the section it introduces.
     * Heading information may be used by user agents, for example, to construct
     * a table of contents for a document automatically.
     *
     * <br>
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Reference
     * on developer.mozilla.org</a>
     *
     * @param title
     *            value
     * @return value
     */
    public static DomElement h4(final String title) {
        return JaticHTMLElementFactory.get().elementWithContent(Header.H4.toString().toLowerCase(), asList(JaticBasicElements.text(title)));
    }

    /***
     * <strong>Heading</strong> elements implement six levels of document
     * headings, &lt;h1&gt; is the most important and &lt;h6&gt; is the least. A
     * heading element briefly describes the topic of the section it introduces.
     * Heading information may be used by user agents, for example, to construct
     * a table of contents for a document automatically.
     *
     * <br>
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Reference
     * on developer.mozilla.org</a>
     *
     * @param title
     *            value
     * @return value
     */
    public static DomElement h5(final String title) {
        return JaticHTMLElementFactory.get().elementWithContent(Header.H5.toString().toLowerCase(), asList(JaticBasicElements.text(title)));
    }

    /***
     * <strong>Heading</strong> elements implement six levels of document
     * headings, &lt;h1&gt; is the most important and &lt;h6&gt; is the least. A
     * heading element briefly describes the topic of the section it introduces.
     * Heading information may be used by user agents, for example, to construct
     * a table of contents for a document automatically.
     *
     * <br>
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Reference on developer.mozilla.org</a>
     *
     * @param title
     *            value
     * @return value
     */
    public static DomElement h6(final String title) {
        return JaticHTMLElementFactory.get().elementWithContent(Header.H6.toString().toLowerCase(), asList(JaticBasicElements.text(title)));
    }

    /***
     * The <strong>HTML <code>&lt;nav&gt;</code> element</strong> (<em>HTML Navigation Element</em>) represents
     * a section of a page that links to other pages or to parts within the page: a section with
     * navigation links.
     *
     * <br>
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/nav">Reference on developer.mozilla.org</a>
     *
     * @param childrenElements value
     * @return value
     */
    public static DomElement nav(final DomElement... childrenElements) {
        return JaticHTMLElementFactory.get().elementWithContent("nav", childrenElements);
    }

}
