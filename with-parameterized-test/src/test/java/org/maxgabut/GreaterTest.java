package org.maxgabut;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class GreaterTest {

    private String parameter;

    public GreaterTest(String parameter) {
        this.parameter = parameter;
    }

    @Parameters(name= "test: {0}")
    public static Iterable<Object[]> parameters() {
        return asList(new Object[][] {{"\0 Null-Byte a b </lol> \n"}});
    }

    @Test
    public void test() {
        assertEquals("Bonjour", new Greater().great());
    }

}
