package com.github.beothorn.html.elements;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class JaticBasicElementsTest {

    @Test
    public void htmlTest(){
        assertThat(JaticBasicElements.html().render(), is("<html></html>"));
    }
}
