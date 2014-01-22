package tw.tanbirka.Test;

import org.junit.Test;
import tw.tanbirka.AnotherPerson;
import tw.tanbirka.Person;
import java.util.*;
import static org.junit.Assert.assertEquals;



public class PersonTest {
    @Test
    public void testEquals() throws Exception {
        Person P1 = new Person("Tanbir", 19);
        Person P2 = new Person("Tanbir", 19);

        assertEquals(false, P1.equals(P2));
        assertEquals(false, P1 == P2);
    }

    @Test
    public void testWithOverridenEqualsAndHashCodeMethod() throws Exception {

        AnotherPerson P1 = new AnotherPerson("Tanbir", 19);
        AnotherPerson P2 = new AnotherPerson("Tanbir", 19);

        assertEquals(true, P1.hashCode() == P2.hashCode());
        assertEquals(true, P1.equals(P2));
        assertEquals(true, P2.equals(P1));
        assertEquals(false, P1 == P2);
    }

    @Test
    public void testWithOverridenEqualsAndHashCodeForUnequalPersons() throws Exception {

        AnotherPerson P1 = new AnotherPerson("Tanbir", 19);
        AnotherPerson P2 = new AnotherPerson("P1", 19);

        assertEquals(false, P1.hashCode() == P2.hashCode());
        assertEquals(false, P1.equals(P2));
        assertEquals(false, P1 == P2);
    }

    @Test
    public void testInsertIntoSetShouldNotAllowDuplicateValuesWhenEqualsIsImplemented() throws Exception {
        Set<AnotherPerson> people = new HashSet<AnotherPerson>();
        AnotherPerson P1 = new AnotherPerson("Tanbir", 19);
        AnotherPerson P2 = new AnotherPerson("Tanbir", 19);
        people.add(P1);
        people.add(P2);
        people.add(P1);
        people.add(P2);
        assertEquals(1, people.size());
    }

    @Test
    public void testInsertIntoSetShouldNotAllowDuplicateValuesWhenEqualsIsNotImplemented() throws Exception {
        Set<Person> people = new HashSet<Person>();
        Person P1 = new Person("Tanbir", 19);
        Person P2 = new Person("Tanbir", 19);
        people.add(P1);
        people.add(P2);
        assertEquals(2, people.size());
    }

    @Test
    public void testInsertIntoHashMapShouldOverWriteWhenEqualsIsImplemented() throws Exception {
        HashMap<AnotherPerson, AnotherPerson> people = new HashMap<AnotherPerson, AnotherPerson>();
        AnotherPerson P1 = new AnotherPerson("Tanbir", 19);
        AnotherPerson P2 = new AnotherPerson("Tanbir", 19);
        people.put(P1, P1);
        people.put(P2, P1);
        assertEquals(1, people.size());
    }

    @Test
    public void testInsertIntoHashMapShouldNotOverWriteWhenEqualsIsNotImplemented() throws Exception {
        HashMap<Person, Person> people = new HashMap<Person, Person>();
        Person P1 = new Person("Tanbir", 19);
        Person P2 = new Person("Tanbir", 19);
        people.put(P1, P1);
        people.put(P2, P1);
        assertEquals(2, people.size());
    }

    @Test
    public void testInsertIntoArrayListAddsDuplicateValues() throws Exception {
        ArrayList<AnotherPerson> people = new ArrayList<AnotherPerson>();
        AnotherPerson P1 = new AnotherPerson("Tanbir", 19);
        AnotherPerson P2 = new AnotherPerson("Tanbir", 19);
        people.add(P1);
        people.add(P2);
        assertEquals(2, people.size());
    }
}
