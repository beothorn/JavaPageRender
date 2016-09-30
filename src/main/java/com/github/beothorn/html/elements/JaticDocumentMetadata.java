package com.github.beothorn.html.elements;

import static java.util.Arrays.asList;

import com.github.beothorn.Attribute;
import com.github.beothorn.html.DomElement;
import com.github.beothorn.html.JaticHTMLElementFactory;
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
}
