package com.github.beothorn.html.common;

import static java.util.Arrays.asList;

import java.util.List;

public class GlobalAttributes {

	public static List<Attribute> attrs(
		final Attribute... props
	){
		return asList(props);
	}
	
	/***
	 * Forms a class of attributes, called custom data attributes, that 
	 * allow proprietary information to be exchanged between the HTML 
	 * and its DOM representation that may be used by scripts. All such 
	 * custom data are available via the HTMLElement interface of the 
	 * element the attribute is set on. The HTMLElement.dataset property 
	 * gives access to them.
	 * 
	 * https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/data-*
	 * 
	 * @param name
	 * @param value
	 * @return
	 */
	public static Attribute data(
		final String name, 
		final String value
	) {
		return new Attribute("data-"+name, value);
	}
	
	/***
	 * Is a space-separated list of the classes of the element. 
	 * Classes allows CSS and JavaScript to select and access specific 
	 * elements via the class selectors or functions like the method 
	 * Document.getElementsByClassName().
	 * 
	 * https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/class
	 * 
	 * @param className
	 * @return
	 */
	public static Attribute className(
		final String className
	) {
		return new Attribute("class", className);
	}
	
	/*** 
	 * Defines a unique identifier (ID) which must be unique in the whole document. 
	 * Its purpose is to identify the element when linking (using a fragment identifier), 
	 * scripting, or styling (with CSS).
	 * 
	 * https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/id
	 * 
	 * @param id
	 * @return
	 */
	public static Attribute id(
		final String id
	) {
		return new Attribute("id", id);
	}
	
}
