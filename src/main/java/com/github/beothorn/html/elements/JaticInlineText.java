package com.github.beothorn.html.elements;

import static java.util.Arrays.asList;

import com.github.beothorn.Renderable;
import com.github.beothorn.html.DomElement;
import com.github.beothorn.html.JaticHTMLElementFactory;

public class JaticInlineText {

    /***
     * The <strong>HTML &lt;b&gt; Element</strong> represents a span of text
     * stylistically different from normal text, without conveying any special
     * importance or relevance. It is typically used for keywords in a summary,
     * product names in a review, or other spans of text whose typical
     * presentation would be boldfaced. Another example of its use is to mark
     * the lead sentence of each paragraph of an article.
     *
     * <br>
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/b">Reference
     * on developer.mozilla.org</a>
     *
     * @param childrenElements
     *            value
     * @return value
     */
    public static DomElement b(final Renderable... childrenElements) {
        return JaticHTMLElementFactory.get().elementWithContent("b", asList(childrenElements));
    }

    /***
     * The <strong>HTML &lt;b&gt; Element</strong> represents a span of text
     * stylistically different from normal text, without conveying any special
     * importance or relevance. It is typically used for keywords in a summary,
     * product names in a review, or other spans of text whose typical
     * presentation would be boldfaced. Another example of its use is to mark
     * the lead sentence of each paragraph of an article.
     *
     * <br>
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/b">Reference
     * on developer.mozilla.org</a>
     *
     * @param text
     *            value
     * @return value
     */
    public static DomElement b(final String text) {
        return JaticHTMLElementFactory.get().elementWithContent("b", asList(JaticBasicElements.text(text)));
    }

    /***
     * The HTML element<em>&nbsp;l</em><em>ine
     * break&nbsp;</em>&lt;br&gt;&nbsp;produces a line break in text
     * (carriage-return). It is useful for writing a poem or an address, where
     * the division of lines is significant.
     *
     * <br>
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/br">Reference
     * on developer.mozilla.org</a>
     *
     * @return value
     */
    public static DomElement br() {
        return JaticHTMLElementFactory.get().emptyElement("br");
    }
}
