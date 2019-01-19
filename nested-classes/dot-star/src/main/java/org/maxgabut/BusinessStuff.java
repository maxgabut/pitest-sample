package org.maxgabut;

/**
 * multi line comment
 */
public class BusinessStuff {

    public String getLol() {
        return "lol";
    }

    public boolean funny() {
      return new BusinessStuffSubStuff().funny();
    }

    public static final class BusinessStuffSubStuff {
      public boolean funny() {
        return true;
      }
    }
}
