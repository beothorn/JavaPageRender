package com.github.beothorn.html.elements;

import static java.util.Arrays.asList;

import com.github.beothorn.Attribute;
import com.github.beothorn.Renderable;
import com.github.beothorn.html.DomElement;
import com.github.beothorn.html.JaticHTMLElementFactory;
import com.github.beothorn.html.elements.types.Header;
import com.github.beothorn.html.elements.types.Target;

public class JaticContentSectioning {

    /***
     * The <strong>HTML <code>&lt;base&gt;</code> element</strong> specifies the
     * base URL to use for all relative URLs contained within a document. There
     * can be only one <code>&lt;base&gt;</code> element in a document.&nbsp;
     *
     * @param href
     *            value
     * @return value
     */
    public static DomElement base(final String href) {
        return JaticHTMLElementFactory.get().emptyElement("base", asList(new Attribute("href", href)));
    }

    /***
     * The <strong>HTML <code>&lt;base&gt;</code> element</strong> specifies the
     * base URL to use for all relative URLs contained within a document. There
     * can be only one <code>&lt;base&gt;</code> element in a document.&nbsp;
     *
     * @param href
     *            value
     * @param target
     *            A name or keyword indicating the default location to display
     *            the result when hyperlinks or forms cause navigation, for
     *            elements that do not have an explicit target reference. It is
     *            a name of, or keyword for, a <em>browsing context</em> (for
     *            example: tab, window, or inline frame). The following keywords
     *            have special meanings:
     *            <ul>
     *            <li><code>_self</code>: Load the result into the same browsing
     *            context&nbsp;as the current one. This value is the default if
     *            the attribute is not specified.</li>
     *            <li><code>_blank</code>: Load the result into a new unnamed
     *            browsing context.</li>
     *            <li><code>_parent</code>: Load the result into the parent
     *            browsing context of the current one. If there is no parent,
     *            this option behaves the same way as <code>_self</code>.</li>
     *            <li><code>_top</code>: Load the result into the top-level
     *            browsing context (that is, the browsing context that is an
     *            ancestor of the current one, and has no parent). If there is
     *            no parent, this option behaves the same way as
     *            <code>_self</code>.</li>
     *            </ul>
     *
     * @return value
     */
    public static DomElement base(final String href, final Target target) {
        return JaticHTMLElementFactory.get().emptyElement("base", asList(new Attribute("href", href), new Attribute("target", target.toString())));
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
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Reference
     * on developer.mozilla.org</a>
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
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Reference
     * on developer.mozilla.org</a>
     *
     * @param title
     *            value
     * @return value
     */
    public static DomElement h6(final String title) {
        return JaticHTMLElementFactory.get().elementWithContent(Header.H6.toString().toLowerCase(), asList(JaticBasicElements.text(title)));
    }

}
