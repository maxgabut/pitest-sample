package org.maxgabut;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OtherJavaClassTest {

  @Test
  void testGetFreeBeer() {

    try {
      new OtherJavaClass().getFreeBeer();
      fail("Got free beer. Don't trust this.");
    } catch (Exception e) {
      assertTrue(e instanceof NoSuchElementException);
    }

  }
}