package com.github.beothorn.html;

import com.github.beothorn.html.elements.DomElement;

public class JPRForms {
	
	/***
	 * The <strong>HTML <em>&lt;button&gt;</em> Element</strong> represents a clickable button.
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/button">Reference on developer.mozilla.org</a>
	 * 
	 * @param childrenElements value
	 * @return value
	 */
	public static DomElement button(
		final DomElement... childrenElements
	){
		return new DomElement("button", childrenElements);
	}

}
