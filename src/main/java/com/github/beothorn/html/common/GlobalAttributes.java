package com.github.beothorn.html.common;

import static java.util.Arrays.asList;

import java.util.List;

/***
 * 
 * <strong>Global attributes</strong> are attributes common to all HTML elements; 
 * they can be used on all elements, though the attributes may have no effect on some elements.
 * 
 * <br>
 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes">Reference on developer.mozilla.org</a>
 * 
 * @author lucas
 *
 */
public class GlobalAttributes {

	public static List<Attribute> attrs(
		final Attribute... props
	){
		return asList(props);
	}
	
	/***
	 * The <strong>accesskey</strong> <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes">global attribute</a> 
	 * provides a hint for generating a keyboard shortcut for the current element. This attribute consists of a 
	 * space-separated list of characters (one single Unicode code point). The browser uses the first one that 
	 * exists on the computer keyboard layout.
	 * 
	 * <p>The operation to activate the accesskey depends on browser and its platform.</p>
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/accesskey">Reference on developer.mozilla.org</a> 
	 * 
	 * @param keyboardShortcut value
	 * @return value
	 */
	public static Attribute accessKey(
		final char keyboardShortcut
	) {
		return new Attribute("accesskey", Character.toString(keyboardShortcut));
	}
	
	/***
	 * Is a space-separated list of the classes of the element. 
	 * Classes allows CSS and JavaScript to select and access specific 
	 * elements via the class selectors or functions like the method 
	 * Document.getElementsByClassName().
	 *
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/class">Reference on developer.mozilla.org</a>
	 * 
	 * @param className value
	 * @return value
	 */
	public static Attribute className(
		final String className
	) {
		return new Attribute("class", className);
	}
	
	/***
	 * The <strong>contenteditable</strong></code> <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes">global attribute</a> 
	 * is an enumerated attribute indicating if the element should be editable by the user. If so, the 
	 * browser modifies its widget to allow editing.
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/contenteditable">Reference on developer.mozilla.org</a>
	 * 
	 * @param editable value
	 * @return value
	 */
	public static Attribute contentEditable(
		final boolean editable
	) {
		return new Attribute("contenteditable", Boolean.toString(editable));
	}
	
	/***
	 * The <strong>contextmenu</strong> <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes">global attribute</a> is the 
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/id"><strong>id</strong></a> of 
	 * a <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/menu">
	 * 
	 * The HTML <menu> element represents a group of commands that a user can perform or activate. 
	 * This includes both list menus, which might appear across the top of a screen, as well as context menus, 
	 * such as those that might appear underneath a button after it has been clicked.
	 * 
	 * &lt;menu&gt;</code></a> to use as the contextual menu for this element.
	 * 
	 * <p>A <em>context menu</em> is a menu that appears upon user interaction, such as a right-click. HTML5 now 
	 * allows us to customize this menu. Here are some implementation examples, including nested menus.</p>
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/contextmenu">Reference on developer.mozilla.org</a>
	 * 
	 * @param id value
	 * @return value
	 */
	public static Attribute contextMenu(
		final String id
	) {
		return new Attribute("contextmenu", id);
	}	
	
	/***
	 * Forms a class of attributes, called custom data attributes, that 
	 * allow proprietary information to be exchanged between the HTML 
	 * and its DOM representation that may be used by scripts. All such 
	 * custom data are available via the HTMLElement interface of the 
	 * element the attribute is set on. The HTMLElement.dataset property 
	 * gives access to them.
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/data-*">Reference on developer.mozilla.org</a>
	 * 
	 * @param name value
	 * @param value value
	 * @return value
	 */
	public static Attribute data(
		final String name, 
		final String value
	) {
		return new Attribute("data-"+name, value);
	}
	
	public enum Direction{
		LEFT_TO_RIGHT("ltr"), RIGHT_TO_LEFT("rtl"), AUTO("auto");
		
		private final String name;       

	    private Direction(String s) {
	        name = s;
	    }

	    public boolean equalsName(String otherName) {
	        return (otherName == null) ? false : name.equals(otherName);
	    }

	    public String toString() {
	       return this.name;
	    }
	}
	
	/***
	 * <p>The <strong>dir</strong> <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes">global attribute</a> is an enumerated attribute indicates the directionality of the element's text. It can have the following values:</p>
	 * <ul>
	 * <li><span style="font-family: Courier New;">ltr</span>, which means <em>left to right </em>and is to be used for languages that are written from the left to the right (like English);</li>
	 * <li><span style="font-family: Courier New;">rtl</span>, which means <em>right to left</em> and is to be used for languages that are written from the right to the left (like Arabic);</li>
	 * <li><span style="font-family: Courier New;">auto</span>, which let the user agent decides. It uses a basic algorithm as it parses the characters inside the element until it finds a character with a strong directionality, then apply that directionality to the whole element.</li>
	 * </ul>
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/dir">Reference on developer.mozilla.org</a> 
	 * 
	 * @param dir value
	 * @return value
	 */
	public static Attribute dir(
		final Direction dir
	) {
		return new Attribute("contextmenu", dir.toString());
	}
	
	/***
	 * The <strong>hidden</code></strong> 
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes">global attribute</a> is a 
	 * Boolean attribute indicating that the element is not yet, or is no longer, <em>relevant</em>. For example, 
	 * it can be used to hide elements of the page that can't be used until the login process has been completed. 
	 * Browsers won't render elements with the hidden</code> attribute set.</p>
	 * <p>The hidden</code> attribute must not be used to hide content that could legitimately be shown in 
	 * another presentation. For example, it is incorrect to use hidden to hide panels in a tabbed dialog, because 
	 * the tabbed interface is merely a kind of overflow presentation — one could equally well just show all the form 
	 * controls in one big page with a scrollbar. It is similarly incorrect to use this attribute to hide content 
	 * just from one presentation — if something is marked hidden, it is hidden from all presentations, including, 
	 * for instance, screen readers.</p>
	 * <p>Hidden elements shouldn't be linked from non-hidden elements and elements that are descendants of a hidden 
	 * element are still active, which means that script elements can still execute and form elements can still submit.</p>
	 *
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/hidden">Reference on developer.mozilla.org</a> 
	 * 
	 * @param hidden value
	 * @return value
	 */
	public static Attribute hidden(
		final boolean hidden
	) {
		return new Attribute("hidden", Boolean.toString(hidden));
	}
	
	/*** 
	 * Defines a unique identifier (ID) which must be unique in the whole document. 
	 * Its purpose is to identify the element when linking (using a fragment identifier), 
	 * scripting, or styling (with CSS).
	 *
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/id">Reference on developer.mozilla.org</a>
	 * 
	 * @param id value
	 * @return value
	 */
	public static Attribute id(
		final String id
	) {
		return new Attribute("id", id);
	}
	
	/***
	 * <p>The <strong>lang</strong> 
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes">global attribute</a> participates 
	 * in defining the language of the element, the language that is non-editable elements are written in or the 
	 * language that the editable elements should be written in. The tag contains one single entry value in the format 
	 * defined in the <a href="http://www.ietf.org/rfc/bcp/bcp47.txt" class="external external-icon"><em>Tags for 
	 * Identifying Languages (BCP47)</em></a> IETF document. If the tag content is the <em>empty string</em> the language 
	 * is set to <em>unkn</em><em>own</em>; if the tag content is not valid, regarding BCP47, it is set to <em>invalid</em>.</p>
	 * <p>Even if the <strong>lang</strong> attribute is set, it may not be taken into account, as the 
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/xml:lang" class="new">
	 * <strong>xml:lang</strong></a> attribute has priority.</p>
	 * <p>For the CSS pseudo-class <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/:lang">:lang</code></a>, 
	 *
	 * The :lang CSS pseudo-class matches elements based on the language the 
	 * element is determined to be in. In HTML, the language is determined by a combination of the lang attribute, 
	 * the &lt;meta&gt; element, and possibly by information from the protocol (such as HTTP headers). For other document 
	 * types there may be other document methods for determining the language.
	 * 
	 * two invalid language names are different if their names are different.</p>
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/lang">Reference on developer.mozilla.org</a>
	 * 
	 * @param lang value
	 * @return value
	 */
	public static Attribute lang(
		final String lang
	) {
		return new Attribute("lang", lang);
	}
	
	/***
	 * <p>The <strong>style</strong> <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes">global attribute</a> contains <a href="https://developer.mozilla.org/en-US/docs/Web/CSS">CSS</a> styling declarations to be applied to the element. Note that it is recommended for styles to be defined in a separate file or files. This attribute and the <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/style" title="The HTML <style> element contains style information for a document, or part of a document. By default, the style instructions written inside that element are expected to be CSS.">&lt;style&gt;</code></a> element have mainly the purpose of allowing for quick styling, for example for testing purposes.</p>
	 *
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/style">Reference on developer.mozilla.org</a>
	 * 
	 * @param style value
	 * @return value
	 */
	public static Attribute style(
		final String style
	) {
		return new Attribute("style", style);
	}
	
	/***
	 * <p>The <strong>tabindex</strong> <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes">global attribute</a> is an integer indicating if the element can take input focus (is <em>focusable</em>), if it should participate to sequential keyboard navigation, and if so, at what position. It can take&nbsp;several values:</p>
	 * <ul>
	 * <li>a <em>negative value</em> means that the element should be focusable, but should not be reachable via sequential keyboard navigation;</li>
	 *  <li>0</code> means that the element should be focusable and reachable via sequential keyboard navigation, but its relative order is defined by the platform convention;</li>
	 * <li>a <em>positive</em><em> value</em> means should be focusable and reachable via sequential keyboard navigation; its relative order is defined by the value of the attribute: the sequential follow the increasing number of the <strong>tabindex</strong>. If several elements share the same tabindex, their relative order follows their relative position in the document.</li>
	 * </ul>
	 * <p>An element with a 0</code> value, an invalid value, or no <strong>tabindex</strong> value should be placed after elements with a positive <strong>tabindex</strong> in the sequential keyboard navigation order.</p>
	 *
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/tabindex">Reference on developer.mozilla.org</a>
	 * 
	 * @param tabindex value
	 * @return value
	 */
	public static Attribute tabIndex(
		final int tabindex
	) {
		return new Attribute("tabindex", Integer.toString(tabindex));
	}
	
	/***
	 * The <strong>title</strong> <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes">global attribute</a> contains a 
	 * text representing advisory information related to the element it belongs to. Such information can typically, 
	 * but not necessarily, be presented to the user as a tooltip.
	 * 
	 * <br>
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/title">Reference on developer.mozilla.org</a>
	 * 
	 * @param title value
	 * @return value
	 */
	public static Attribute title(
		final String title
	) {
		return new Attribute("title", title);
	}
	
}
