package org.maxgabut;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class BusinessStuffServiceTest {

  @Test
  public void test() {
    BusinessStuffService bss = new BusinessStuffService();
    assertNotNull(bss.getBusinessStuff());
  }
}
