package com.github.beothorn.html;

import java.util.ArrayList;
import java.util.List;

import com.github.beothorn.Attribute;
import com.github.beothorn.Renderable;

public abstract class DomElement implements Renderable {

    protected final List<Renderable> attributes = new ArrayList<>();
    protected final String tag;

    public DomElement(final String tag) {
        this.tag = tag;
    }

    public DomElement(final String tag, final List<? extends Attribute> props) {
        this.tag = tag;
        this.attributes.addAll(props);
    }

    /***
     * 
     * The <strong>onclick</strong> property returns the click event handler
     * code on the current element.
     * 
     * <br>
     * <a href=
     * "https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onclick">Reference
     * on developer.mozilla.org</a>
     * 
     * @param onclickFunction
     *            value
     * @return value
     */
    public DomElement onClick(final String onclickFunction) {
        attributes.add(new Attribute("onclick", onclickFunction));
        return this;
    }
}
