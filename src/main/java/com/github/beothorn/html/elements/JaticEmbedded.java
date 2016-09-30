package com.github.beothorn.html.elements;

import java.util.Arrays;

import com.github.beothorn.Attribute;
import com.github.beothorn.html.DomElement;
import com.github.beothorn.html.JaticHTMLElementFactory;

/***
 * In addition to regular multimedia content, HTML can include a variety of other content,
 * even if it's not always easy to interact with.
 *
 * <br>
 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element">Reference on developer.mozilla.org</a>
 *
 */
public class JaticEmbedded {


    /***
     * The <strong>HTML <code>&lt;embed&gt;</code> Element</strong> represents an integration point
     * for an external application or interactive content (in other words, a plug-in).
     *
     * <br>
     * <a href= "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/embed">Reference on developer.mozilla.org</a>
     *
     * @param type The MIME type to use to select the plug-in to instantiate.
     * @param src The URL of the resource being embedded.
     * @param width The displayed width of the resource, in CSS pixels.
     * @param height The displayed height of the resource, in CSS pixels.
     * @return value
     */
    public static DomElement embed(
        final String type,
        final String src,
        final int width,
        final int height
    ){
        return JaticHTMLElementFactory.get().emptyElement("link", Arrays.asList(
            new Attribute("type", type),
            new Attribute("src", src),
            new Attribute("width", Integer.toString(width)),
            new Attribute("height", Integer.toString(height))
        ));
    }

}
