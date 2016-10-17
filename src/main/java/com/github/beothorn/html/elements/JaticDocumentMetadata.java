package com.github.beothorn.html.elements;

import static java.util.Arrays.asList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.github.beothorn.Attribute;
import com.github.beothorn.html.DomElement;
import com.github.beothorn.html.JaticHTMLElementFactory;
import com.github.beothorn.html.elements.types.Link;
import com.github.beothorn.html.elements.types.Target;

/***
 * Metadata contains information about the page. This includes information about styles,
 * scripts and data to help software (search engines, browsers, etc.) use and render the page.
 * Metadata for styles and scripts may be defined in the page or link to another file that has
 * the information.
 *
 * <br>
 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element">Reference on developer.mozilla.org</a>
 *
 */
public class JaticDocumentMetadata {


    /***
     * The <strong>HTML <code>&lt;base&gt;</code> element</strong> specifies the
     * base URL to use for all relative URLs contained within a document. There
     * can be only one <code>&lt;base&gt;</code> element in a document.&nbsp;
     *
     * <br>
     * <a href= "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/base">Reference on developer.mozilla.org</a>
     *
     * @param href value
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
     * <br>
     * <a href= "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/base">Reference on developer.mozilla.org</a>
     *
     * @param href value
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
     * The <strong>HTML <code>&lt;head&gt;</code> element</strong> provides general information
     * (metadata) about the document, including its title and links to its&nbsp;scripts and
     * style sheets.
     *
     * <br>
     * <a href= "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/head">Reference on developer.mozilla.org</a>
     *
     * @param childrenElements value
     * @return value
     */
    public static DomElement head(final DomElement... childrenElements) {
        return JaticHTMLElementFactory.get().elementWithContent("head", childrenElements);
    }

    /***
     * The <strong>HTML <code>&lt;link&gt;</code> element</strong> specifies relationships between
     * the current document and an external resource. Possible uses for this element include defining
     * a relational framework for navigation. This Element is most used to link to style sheets.
     *
     * <br>
     * <a href= "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/link">Reference on developer.mozilla.org</a>
     *
     * @param href his attribute specifies the <a href="/en-US/docs/Glossary/URL">URL</a> of
     * the linked resource. A URL might be absolute or relative.
     *
     * @param rels This attribute names a relationship of the linked document to
     * the current document. The attribute must be a space-separated list of the
     * <a href="/en-US/docs/Web/HTML/Link_types">link types values</a>. The most common use
     * of this attribute is to specify a link to an external style sheet: the <strong>rel</strong>
     * attribute is set to <code>stylesheet</code>, and the <strong>href</strong> attribute is set
     * to the URL of an external style sheet to format the page. WebTV also supports the use of the
     * value <code>next</code> for <strong>rel</strong> to preload the next page in a document series.
     *
     *
     * @return value
     */
    public static DomElement link(final String href, final Link... rels) {
        final String rel = Arrays.asList(rels).stream().map(Link::toString).collect(Collectors.joining(" "));
        return JaticHTMLElementFactory.get().emptyElement("link", Arrays.asList(new Attribute("href", href), new Attribute("rel", rel)));
    }

    public static DomElement externalCss(final String cssFile) {
        return link(cssFile, Link.STYLESHEET);
    }

    /***
     * TODO: type attributes and other static constructors
     *
     * @param href value
     * @param attrs value
     * @return value
     */
    public static DomElement meta(final String href, final Attribute... attrs) {
        return JaticHTMLElementFactory.get().emptyElement("link", Arrays.asList(attrs));
    }

    /***
     * TODO: CSS type here
     *
     * @param childrenElements value
     * @param props value
     * @return value
     */
    public static DomElement style(
        final List<? extends Attribute> props,
        final List<? extends DomElement> childrenElements
    ) {
        return JaticHTMLElementFactory.get().elementWithContent("style", props, childrenElements);
    }

    /***
     * The <strong>HTML <code>&lt;title&gt;</code> element</strong> defines the
     * title of the document, shown in a browser's title bar or on the page's tab.
     * It can only contain text, and any contained tags are ignored.
     *
     * <br>
     * <a href= "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/title">Reference on developer.mozilla.org</a>
     *
     * @param title value
     * @return value
     */
    public static DomElement title(final String title) {
        return JaticHTMLElementFactory.get().elementWithContent(
            "title",
            JaticBasicElements.text(title)
        );
    }

}
