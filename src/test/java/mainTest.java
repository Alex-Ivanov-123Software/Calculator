import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Alex Ivanov on 27.04.2016.
 */
public class mainTest extends main {

    @Test
    public void text() throws Exception {
        assertEquals(text("Hello"),"Hello");
    }

    @Test
    public void number() throws Exception {
        assertEquals(number(45),45);
    }

    @Test
    public void string() throws Exception {
        assertEquals(string("Total"),"Total 2000");
    }
}