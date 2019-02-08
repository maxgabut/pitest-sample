package org.maxgabut;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaClassTest {

    @Test
    void getLol() {
      assertEquals("lol", new JavaClass().getLol());
    }
}
