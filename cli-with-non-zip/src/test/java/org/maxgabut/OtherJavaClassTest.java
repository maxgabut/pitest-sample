package org.maxgabut;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class OtherJavaClassTest {

  @Test
  public void testGetFreeBeer() {

    try {
      new OtherJavaClass().getFreeBeer();
      fail();
    } catch (Exception e) {
      assertTrue(e instanceof NoSuchElementException);
    }

  }
}