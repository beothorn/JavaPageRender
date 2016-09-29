package com.github.beothorn.html;

import java.util.List;

import com.github.beothorn.Attribute;
import com.github.beothorn.Renderable;

public class JaticHTMLElementFactory {

    private static  JaticHTMLElementFactory fact = new JaticHTMLElementFactory();

    public static void set(final JaticHTMLElementFactory fact){
        JaticHTMLElementFactory.fact = fact;
    }

    public static JaticHTMLElementFactory get(){
        return fact;
    }

    public DomElement emptyElement(final String tag) {
        return new EmptyElement(tag);
    }

    public DomElement emptyElement(final String tag, final List<? extends Attribute> props) {
        return new EmptyElement(tag, props);
    }

    public ElementWithContent elementWithContent(
        final String tag,
        final Renderable... childrenElements
    ){
        return new ElementWithContent(tag, childrenElements);
    }

    public ElementWithContent elementWithContent(
        final String tag,
        final List<? extends Renderable> childrenElements
    ){
        return new ElementWithContent(tag, childrenElements);
    }

    public ElementWithContent elementWithContent(
        final String tag,
        final List<? extends Attribute> props,
        final List<? extends Renderable> childrenElements
    ){
        return new ElementWithContent(tag, props, childrenElements);
    }

}
