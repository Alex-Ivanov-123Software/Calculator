import static org.junit.Assert.assertEquals;

/**
 * Created by Alex Ivanov on 27.04.2016.
 */
public class mainTest extends main {

    @org.junit.Test
    public void text() throws Exception {
        assertEquals(text("Hello"),"Hello");
    }
}