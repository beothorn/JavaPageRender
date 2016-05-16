package com.github.beothorn;

import static com.github.beothorn.html.Page.h1;
import static com.github.beothorn.html.Page.html;
import static com.github.beothorn.html.Page.text;
import static org.hamcrest.core.Is.is;

import org.junit.Assert;
import org.junit.Test;

import com.github.beothorn.html.elements.Html;

public class PageRenderingTest{
	
	@Test
	public void helloWorld(){
		Html html = html(
			h1(text("Hello World"))
		);
		
		Assert.assertThat(html.render(), is("<html>\n<h1>Hello World<h1>\n<html>"));
	}
}
