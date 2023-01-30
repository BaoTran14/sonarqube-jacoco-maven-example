package maven.test.jacoco.junit;

import maven.test.jacoco.Jacoco;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JacocoTest {
    /**
     * Method under test: {@link Jacoco#minus(int, int)}
     */
    @Test
    public void testMinus() {
        assertEquals(0, (new Jacoco()).minus(1, 1));
        assertEquals(2, (new Jacoco()).minus(3, 1));
        assertEquals(-1, (new Jacoco()).minus(0, 1));
        assertEquals(-2, (new Jacoco()).minus(-1, 1));
    }

    /**
     * Method under test: {@link Jacoco#isNegative(int)}
     */
    @Test
    public void testIsNegative() {
        assertFalse((new Jacoco()).isNegative(1));
        assertTrue((new Jacoco()).isNegative(-2));
    }
}
