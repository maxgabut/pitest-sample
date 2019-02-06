package org.maxgabut;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaClassTest {

    @Test
    public void getLol() {
      assertEquals("lol", new JavaClass().getLol());
    }
}
