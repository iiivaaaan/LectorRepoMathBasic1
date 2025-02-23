package hidden.test;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.learning.portal.App;

/**
 * @author Stanislav Hlova
 */
public class AppHiddenTest extends TestCase {
    public void testAppHidden() {
        final int expected = 10;

        int actual = new App().sum(5, 5);

        Assert.assertEquals(expected, actual);
    }
}
