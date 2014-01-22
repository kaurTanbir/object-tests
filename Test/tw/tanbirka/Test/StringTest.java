package tw.tanbirka.Test;

import org.junit.Test;

import java.lang.*;
import java.lang.String;

import static org.junit.Assert.assertEquals;

public class StringTest {
    @Test
    public void testStringUsingEquals() throws Exception {
        String literal1 = "All izz well";
        String literal2 = "All izz well";
        assertEquals(true, literal1.equals(literal2));
    }

    @Test
    public void testStringWithDoubleEquals() throws Exception {
        String literal1 = "All izz well";
        String literal2 = "All izz well";
        assertEquals(true, literal1 == literal2);
    }

    @Test
    public void testStringWithUsingConstructor() throws Exception {
        String literal1 = "All izz well";
        String string1 = new String("All izz well");
        assertEquals(false, literal1 == string1);
    }

    @Test
    public void testStringWithUsingTwoConstructors() throws Exception {
        String string1 = new String("All izz well");
        String string2 = new String("All izz well");
        assertEquals(false, string1 == string2);
    }

    @Test
    public void testStringWithUsingConstructorAndUsingEquals() throws Exception {
        String literal1 = "All izz well";
        String string1 = new String("All izz well");
        assertEquals(true, literal1.equals(string1));
    }

    @Test
    public void testStringWithUsingTwoConstructorsAndUsingEquals() throws Exception {
        String string1 = new String("All izz well");
        String string2 = new String("All izz well");
        assertEquals(true, string1.equals(string2));
    }

    @Test
    public void testStringWithDifferentValuesAndUsingEquals() throws Exception {
        String literal1 = "All izz well";
        String literal2 = "hello";
        assertEquals(false, literal1.equals(literal2));
    }

    @Test
    public void testStringWithDifferentValuesAndUsingDoubleEquals() throws Exception {
        String string1 = "All izz well";
        String string2 = "hello";
        assertEquals(false, string1 == string2);
    }
}