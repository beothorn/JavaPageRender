package com.github.beothorn.html.elements.base;

import com.github.beothorn.Attribute;
import com.github.beothorn.Render;
import com.github.beothorn.Renderable;
import com.github.beothorn.html.elements.DomElement;

public class Base extends DomElement{
	
	public Base(final String href) {
		super("", new Renderable[]{new Attribute("href", href)});
	}
	
	public Base(final String href, final Target target) {
		super("", new Renderable[]{new Attribute("href", href), new Attribute("target", target.toString())});
	}
	
	@Override
	public String render() {
		return Render.renderEmptyTag("base", props);
	}
}
