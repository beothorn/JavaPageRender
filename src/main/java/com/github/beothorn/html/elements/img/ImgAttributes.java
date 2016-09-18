package com.github.beothorn.html.elements.img;

import com.github.beothorn.Attribute;
import com.github.beothorn.html.elements.Px;
/***
 * 
 * https://developer.mozilla.org/en-US/docs/Web/HTML/Element/img
 *
 */
public class ImgAttributes extends Attribute {
	
	/***
	 * The image URL. This attribute is mandatory for the &lt;img&gt; element. 
	 * On browsers supporting srcset, src is treated like a candidate 
	 * image with a pixel density descriptor 1x unless an image with 
	 * this pixel density descriptor is already defined in srcset, or 
	 * unless srcset contains 'w' descriptors.
	 * 
	 * @param src value
	 * @return value
	 */
	public static ImgAttributes src(
		final String src
	) {
		return new ImgAttributes("src", src);
	}
	
	/***
	 * This attribute defines the alternative text describing the image. 
	 * Users will see this text displayed if the image URL is wrong, the 
	 * image is not in one of the supported formats, or if the image is 
	 * not yet downloaded.
	 * 
	 * @param altText value
	 * @return value
	 */
	public static ImgAttributes alt(
		final String altText
	) {
		return new ImgAttributes("alt", altText);
	}
	
	/***
	 * The intrinsic height of the image in pixels. In HTML 4, the 
	 * height could be defined pixels or as a percentage. 
	 * In HTML5, however, the value must be in pixels.
	 * 
	 * @param height value
	 * @return value
	 */
	public static ImgAttributes height(
		final Px height
	){
		return new ImgAttributes("height", height.render());
	}

	/***
	 * The intrinsic width of the image in pixels. In HTML 4, either 
	 * a percentage or pixels were acceptable values. In HTML5, however, 
	 * only pixels are acceptable.
	 * 
	 * @param width value
	 * @return value
	 */
	public static ImgAttributes width(
		final Px width
	) {
		return new ImgAttributes("width", width.render());
	}
	
	/***
	 * Use this for creating attribute, bur first
	 * chack all others static constructors available on this class
	 * 
	 * @param name value
	 * @param value value
	 */
	public ImgAttributes(String name, String value) {
		super(name, value);
	}
	
}
