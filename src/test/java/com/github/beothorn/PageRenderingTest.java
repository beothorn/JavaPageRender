package com.github.beothorn;

import static com.github.beothorn.html.Unit.px;
import static com.github.beothorn.html.common.GlobalAttributes.attrs;
import static com.github.beothorn.html.elements.Page.br;
import static com.github.beothorn.html.elements.Page.button;
import static com.github.beothorn.html.elements.Page.content;
import static com.github.beothorn.html.elements.Page.header;
import static com.github.beothorn.html.elements.Page.html;
import static com.github.beothorn.html.elements.Page.img;
import static com.github.beothorn.html.elements.Page.text;
import static com.github.beothorn.html.elements.img.ImgAttributes.height;
import static com.github.beothorn.html.elements.img.ImgAttributes.src;
import static com.github.beothorn.html.elements.img.ImgAttributes.width;
import static org.hamcrest.core.Is.is;

import org.junit.Assert;
import org.junit.Test;

import com.github.beothorn.html.elements.Page.Header;

public class PageRenderingTest{
	
	@Test
	public void helloWorld(){
		String html = html(
			header(Header.H1,text("Hello World"))
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
		).onClick("alert('Hello')")
		.render();
		Assert.assertThat(button, is("<button onclick=\"alert('Hello')\">test</button>"));
	}
	
}
