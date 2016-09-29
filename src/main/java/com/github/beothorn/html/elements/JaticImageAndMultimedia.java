package com.github.beothorn.html.elements;

import java.util.List;

import com.github.beothorn.Attribute;
import com.github.beothorn.html.DomElement;
import com.github.beothorn.html.JaticHTMLElementFactory;

public class JaticImageAndMultimedia {

    /***
     * <p>
     * The <strong>HTML &lt;img&gt; element</strong> represents an image in the
     * document.
     * </p>
     *
     * <br>
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/img">Reference
     * on developer.mozilla.org</a>
     *
     * @param childrenElements
     *            value
     * @return value
     */
    public static DomElement img(final DomElement... childrenElements) {
        return JaticHTMLElementFactory.get().elementWithContent("img", childrenElements);
    }

    /***
     * The HTML &lt;img&gt; element represents an image in the document.
     *
     * <br>
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/img">Reference
     * on developer.mozilla.org</a>
     *
     * @param props
     *            value
     * @param childrenElements
     *            value
     *
     * @return value
     */
    public static DomElement img(final List<Attribute> props, final List<DomElement> childrenElements) {
        return JaticHTMLElementFactory.get().elementWithContent("img", props, childrenElements);
    }
}
