package za.ac.cput.adp3;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testObjectEquality() {
        String name = "Leo";
        assertEquals(name, "Leo");
    }

    @Test
    public void testObjectIdentity() {
        String name = new String("John Doe");
        assertSame(name, name);
    }

    @Test
    public void testFails() {
        String name = new String("John Doe");
        assertSame(name, "John Doe");
    }

    @Test(timeout = 1)
    public void testTimeouts() {
        System.out.println("Inside timeout test");
    }

    @Ignore
    @Test
    public void testDisabling() {
        String name = new String("John Doe");
        assertSame(name, "John Doe");
    }

}
