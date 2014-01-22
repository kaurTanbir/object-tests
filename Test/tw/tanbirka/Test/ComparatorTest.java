package tw.tanbirka.Test;

import org.junit.Test;
import tw.tanbirka.Person;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static tw.tanbirka.MyClass.addPeopleToList;

public class ComparatorTest {
    Person swamiji = new Person("Swamiji", 3);
    Person kunal = new Person("Kunal", 50);
    Person digvijay = new Person("Digvijay", 35);

    //comparators
    @Test
    public void testSortPeopleByNameLength() throws Exception{
        List<Person> people = addPeopleToList(digvijay,kunal, swamiji);
        List<Person> expected = addPeopleToList(kunal, swamiji,digvijay);

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().length() - p2.getName().length();
            }
        });
        assertEquals(expected,people);

    };
    @Test
    public void testSortPeopleByAge() throws Exception{
        List<Person> people = addPeopleToList(digvijay,kunal, swamiji);
        List<Person> expected = addPeopleToList( swamiji,digvijay, kunal);

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getAge() - p2.getAge();
            }
        });
        assertEquals(expected,people);

    };
    @Test
    public void testSortPeopleByName() throws Exception{
        List<Person> expected = addPeopleToList(digvijay,kunal, swamiji);
        List<Person> people = addPeopleToList( swamiji,digvijay, kunal);

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                String name1 = p1.getName();
                String name2 = p2.getName();
                return name1.compareTo(name2);
            }
        });
        assertEquals(expected,people);

    };
    @Test
    public void testSortPeopleDescByName() throws Exception{
        List<Person> people = addPeopleToList(digvijay,kunal, swamiji);
        List<Person> expected = addPeopleToList( swamiji, kunal,digvijay);

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                String name1 = p1.getName();
                String name2 = p2.getName();
                return name2.compareTo(name1);
            }
        });
        assertEquals(expected,people);

    };

}