package com.github.beothorn.html.elements;

import com.github.beothorn.html.DomElement;
import com.github.beothorn.html.JaticHTMLElementFactory;

/***
 * These elements let you provide indications that specific parts of the text have been altered.
 *
 * <br>
 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element">Reference on developer.mozilla.org</a>
 *
 */
public class JaticDemarcatingEdits {

    /***
     * The <em>HTML Deleted Text Element</em>&nbsp;(<strong>&lt;del&gt;</strong>) represents a range of
     * text that has been deleted from a document. This element is often (but need not be) rendered with
     * strike-through text.
     *
     * <br>
     * <a href= "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/del">Reference on developer.mozilla.org</a>
     *
     * @param childrenElements value
     * @return value
     */
    public static DomElement del(final DomElement... childrenElements) {
        return JaticHTMLElementFactory.get().elementWithContent("del", childrenElements);
    }

    /***
     * The <strong>HTML <code>&lt;ins&gt;</code> Element</strong> (or <em>HTML Inserted Text</em>) HTML
     * represents a range of text that has been added to a document.
     *
     * <br>
     * <a href= "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/ins">Reference on developer.mozilla.org</a>
     *
     * @param childrenElements value
     * @return value
     */
    public static DomElement ins(final DomElement... childrenElements) {
        return JaticHTMLElementFactory.get().elementWithContent("ins", childrenElements);
    }

}
