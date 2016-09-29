package com.github.beothorn.html.elements;

import com.github.beothorn.html.DomElement;
import com.github.beothorn.html.JaticHTMLElementFactory;

public class JaticForms {

    /***
     * The <strong>HTML <em>&lt;button&gt;</em> Element</strong> represents a
     * clickable button.
     *
     * <br>
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/button">Reference
     * on developer.mozilla.org</a>
     *
     * @param childrenElements
     *            value
     * @return value
     */
    public static DomElement button(final DomElement... childrenElements) {
        return JaticHTMLElementFactory.get().elementWithContent("button", childrenElements);
    }

}
