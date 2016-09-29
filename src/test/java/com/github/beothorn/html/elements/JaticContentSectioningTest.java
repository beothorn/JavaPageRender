package com.github.beothorn.html.elements;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.github.beothorn.html.elements.types.Target;

public class JaticContentSectioningTest {

    @Test
    public void htmlTest(){
        assertThat(JaticContentSectioning.base("foo").render(), is("<base href=\"foo\">"));
        assertThat(JaticContentSectioning.base("foo",Target.SELF).render(), is("<base href=\"foo\" target=\"_self\">"));
    }
}
