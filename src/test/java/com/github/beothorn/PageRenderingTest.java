package com.github.beothorn;

import static com.github.beothorn.html.JPRBasicElements.content;
import static com.github.beothorn.html.JPRBasicElements.html;
import static com.github.beothorn.html.JPRBasicElements.text;
import static com.github.beothorn.html.JPRForms.button;
import static com.github.beothorn.html.JPRImageAndMultimedia.img;
import static com.github.beothorn.html.JPRInlineText.br;
import static com.github.beothorn.html.common.GlobalAttributes.attrs;
import static com.github.beothorn.html.common.Unit.px;
import static com.github.beothorn.html.elements.img.ImgAttributes.height;
import static com.github.beothorn.html.elements.img.ImgAttributes.src;
import static com.github.beothorn.html.elements.img.ImgAttributes.width;
import static org.hamcrest.core.Is.is;

import org.junit.Assert;
import org.junit.Test;

import com.github.beothorn.html.JPRBasicElements;
import com.github.beothorn.html.JPRContentSectioning;
import com.github.beothorn.html.elements.Header;

public class PageRenderingTest{
	
	@Test
	public void helloWorld(){
		String html = html(
			JPRContentSectioning.header(Header.H1, JPRBasicElements.text("Hello World"))
		).render();
		
		Assert.assertThat(html, is("<html><h1>Hello World</h1></html>"));
	}
	
	@Test
	public void imgWithHeight(){
		String img = img(
			attrs(
				height(px(13)),
				width(px(11)),
				src("foo")
			),
			content(
				text("img text"),
				br()
			)
		).render();
		Assert.assertThat(img, is("<img height=\"13px\" width=\"11px\" src=\"foo\">img text<br></img>"));
	}
	
	@Test
	public void simpleButton(){
		String button = button(
			text("test")
		).onClick("alert('Hello')").render();
		Assert.assertThat(button, is("<button onclick=\"alert('Hello')\">test</button>"));
	}
	
}
