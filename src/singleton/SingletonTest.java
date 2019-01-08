package singleton;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class SingletonTest {
    private Singleton s1;
    private Singleton s2;

    @Before
    public void setUp() throws Exception {
        s1 = Singleton.getInstance("test1");
        s2 = Singleton.getInstance("test2");
    }

    @Test
    public void testGetInstance() {
        assertEquals("test1", s2.getData() );


        //assertEquals("test2", s2.getData() ); // exception

        assertSame(s1, s2);
    }
}
