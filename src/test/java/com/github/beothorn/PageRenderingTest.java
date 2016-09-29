package com.github.beothorn;

import static com.github.beothorn.html.common.GlobalAttributes.attrs;
import static com.github.beothorn.html.common.Unit.px;
import static com.github.beothorn.html.elements.JaticBasicElements.content;
import static com.github.beothorn.html.elements.JaticBasicElements.html;
import static com.github.beothorn.html.elements.JaticBasicElements.text;
import static com.github.beothorn.html.elements.JaticForms.button;
import static com.github.beothorn.html.elements.JaticImageAndMultimedia.img;
import static com.github.beothorn.html.elements.JaticInlineText.br;
import static com.github.beothorn.html.elements.img.ImgAttributes.height;
import static com.github.beothorn.html.elements.img.ImgAttributes.src;
import static com.github.beothorn.html.elements.img.ImgAttributes.width;
import static org.hamcrest.core.Is.is;

import org.junit.Assert;
import org.junit.Test;

import com.github.beothorn.html.elements.JaticBasicElements;
import com.github.beothorn.html.elements.JaticContentSectioning;
import com.github.beothorn.html.elements.types.Header;

public class PageRenderingTest {

    @Test
    public void helloWorld() {
        final String html = html(JaticContentSectioning.header(Header.H1, JaticBasicElements.text("Hello World"))).render();

        Assert.assertThat(html, is("<html><h1>Hello World</h1></html>"));
    }

    @Test
    public void imgWithHeight() {
        final String img = img(attrs(height(px(13)), width(px(11)), src("foo")), content(text("img text"), br()))
                .render();
        Assert.assertThat(img, is("<img height=\"13px\" width=\"11px\" src=\"foo\">img text<br></img>"));
    }

    @Test
    public void simpleButton() {
        final String button = button(text("test")).onClick("alert('Hello')").render();
        Assert.assertThat(button, is("<button onclick=\"alert('Hello')\">test</button>"));
    }

}
