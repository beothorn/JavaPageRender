package com.github.beothorn;

import static com.github.beothorn.html.elements.Page.br;
import static com.github.beothorn.html.elements.Page.content;
import static com.github.beothorn.html.elements.Page.h1;
import static com.github.beothorn.html.elements.Page.html;
import static com.github.beothorn.html.elements.Page.img;
import static com.github.beothorn.html.elements.Page.text;
import static com.github.beothorn.html.elements.img.Img.height;
import static com.github.beothorn.html.elements.img.Img.props;
import static com.github.beothorn.html.elements.img.Img.src;
import static com.github.beothorn.html.elements.img.Img.width;
import static org.hamcrest.core.Is.is;

import org.junit.Assert;
import org.junit.Test;

public class PageRenderingTest{
	
	@Test
	public void helloWorld(){
		String html = html(
			h1(text("Hello World"))
		).render();
		
		Assert.assertThat(html, is("<html><h1>Hello World</h1></html>"));
	}
	
	@Test
	public void imgWithHeight(){
		String img = img(
			props(
				height(13),
				width(11),
				src("foo")
			),
			content(
				text("alt text"),
				br()
			)
		).render();
		Assert.assertThat(img, is("<img height=\"13\" width=\"11\" src=\"foo\">alt text<br></img>"));
	}
	
}
