package org.learning.portal;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        final int expected = 6;

        int actual = new App().sum(1, 5);

        Assert.assertEquals(expected, actual);
    }
}
