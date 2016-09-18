package com.github.beothorn.html.elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.github.beothorn.html.Renderable;
import com.github.beothorn.html.common.Render;
import com.github.beothorn.html.common.Attribute;

public class DomElement implements Renderable {

	protected List<Renderable> children = new ArrayList<Renderable>();
	protected List<Renderable> props = new ArrayList<>();
	private final String tag;
	
	public DomElement(
		final String tag,
		final Renderable[] childrenElements
	){
		this.tag = tag;
		children.addAll(Arrays.asList(childrenElements));
	}
	
	public DomElement(
		final String tag,
		final List<? extends Renderable> childrenElements
	){
		this.tag = tag;
		children.addAll(childrenElements);
	}
	
	public DomElement(
		final String tag,
		final List<? extends Attribute> props ,
		final List<? extends Renderable> childrenElements
	){
		this.tag = tag;
		children.addAll(childrenElements);
		this.props.addAll(props);
	}
	
	/***
	 * 
	 * The <strong>onclick</strong> property returns the <code>click event handler code on the current element.
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onclick">Reference on developer.mozilla.org</a>
	 * 
	 * @param onclickFunction value
	 * @return value
	 */
	public DomElement onClick(final String onclickFunction){
		props.add(new Attribute("onclick", onclickFunction));
		return this;
	}
	
	@Override
	public String render() {
		return Render.renderTag(tag, props, children);
	}
	
}
