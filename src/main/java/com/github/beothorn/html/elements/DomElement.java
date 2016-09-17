package com.github.beothorn.html.elements;

import java.util.ArrayList;
import java.util.List;

import com.github.beothorn.html.Renderable;
import com.github.beothorn.html.common.Render;
import com.github.beothorn.html.common.SimpleAttr;

public abstract class DomElement implements Renderable{

	protected List<Renderable> children = new ArrayList<Renderable>();
	protected List<Renderable> props = new ArrayList<>();
	
	protected abstract String tag();
	
	public DomElement onClick(final String onclickFunction){
		props.add(new SimpleAttr("onclick", onclickFunction));
		return this;
	}
	
	@Override
	public String render() {
		return Render.renderTag(tag(), props, children);
	}
	
}
