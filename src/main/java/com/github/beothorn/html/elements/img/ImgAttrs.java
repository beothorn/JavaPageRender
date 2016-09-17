package com.github.beothorn.html.elements.img;

import com.github.beothorn.html.common.SimpleAttr;
import com.github.beothorn.html.elements.Px;
/***
 * 
 * https://developer.mozilla.org/en-US/docs/Web/HTML/Element/img
 *
 */
public class ImgAttrs extends SimpleAttr {

	//Global attributes --------------------
	/***
	 * Forms a class of attributes, called custom data attributes, that 
	 * allow proprietary information to be exchanged between the HTML 
	 * and its DOM representation that may be used by scripts. All such 
	 * custom data are available via the HTMLElement interface of the 
	 * element the attribute is set on. The HTMLElement.dataset property 
	 * gives access to them.
	 * 
	 * @param name
	 * @param value
	 * @return
	 */
	public static ImgAttrs data(
		final String name, 
		final String value
	) {
		return new ImgAttrs("data-"+name, value);
	}
	
	/***
	 * Is a space-separated list of the classes of the element. 
	 * Classes allows CSS and JavaScript to select and access specific 
	 * elements via the class selectors or functions like the method 
	 * Document.getElementsByClassName().
	 * 
	 * @param className
	 * @return
	 */
	public static ImgAttrs className(
		final String className
	) {
		return new ImgAttrs("class", className);
	}
	//--------------------------------------
	/***
	 * The image URL. This attribute is mandatory for the <img> element. 
	 * On browsers supporting srcset, src is treated like a candidate 
	 * image with a pixel density descriptor 1x unless an image with 
	 * this pixel density descriptor is already defined in srcset, or 
	 * unless srcset contains 'w' descriptors.
	 * 
	 * @param src
	 * @return
	 */
	public static ImgAttrs src(
		final String src
	) {
		return new ImgAttrs("src", src);
	}
	
	/***
	 * This attribute defines the alternative text describing the image. 
	 * Users will see this text displayed if the image URL is wrong, the 
	 * image is not in one of the supported formats, or if the image is 
	 * not yet downloaded.
	 * 
	 * @param altText
	 * @return
	 */
	public static ImgAttrs alt(
		final String altText
	) {
		return new ImgAttrs("alt", altText);
	}
	
	/***
	 * The intrinsic height of the image in pixels. In HTML 4, the 
	 * height could be defined pixels or as a percentage. 
	 * In HTML5, however, the value must be in pixels.
	 * 
	 * @param height
	 * @return
	 */
	public static ImgAttrs height(
		final Px height
	){
		return new ImgAttrs("height", height.render());
	}

	/***
	 * The intrinsic width of the image in pixels. In HTML 4, either 
	 * a percentage or pixels were acceptable values. In HTML5, however, 
	 * only pixels are acceptable.
	 * 
	 * @param width
	 * @return
	 */
	public static ImgAttrs width(
		final Px width
	) {
		return new ImgAttrs("width", width.render());
	}
	
	/***
	 * Only use this for custom attributes.
	 * For all others use the static constructors available on this class
	 * 
	 * @param name
	 * @param value
	 */
	public ImgAttrs(String name, String value) {
		super(name, value);
	}
	
}
