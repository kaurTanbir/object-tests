package tw.tanbirka.Test;

import org.junit.Test;
import tw.tanbirka.Person;

import java.util.ArrayList;

public class ArrayListTest {
    Person tanbir = new Person("Tanbir", 19);

    @Test(expected = ClassCastException.class)
    public void testArrayList() {
        ArrayList<Person> list = new ArrayList<Person>();
        ArrayList ObjectList = list;
        ObjectList.add(tanbir);
        ObjectList.add(10);

        for (Object o : ObjectList) {
            Person person = (Person) o;
        }
    }

    @Test(expected = ClassCastException.class)
    public void testArrayListStrings() {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList ObjectList = list;
        ObjectList.add("tanbir");
        ObjectList.add(10);

        for (Object o : ObjectList) {
            String name = (String) o;
        }
    }

    @Test
    public void testArrayListByAddingSubClass() {
        Person sandesh = new Person("Sandesh", 1) {

        };
        ArrayList<? extends Person> list = new ArrayList<Person>();
        ArrayList ObjectList = list;
        ObjectList.add(sandesh);
        ObjectList.add(tanbir);

        for (Object o : ObjectList) {
            Person name = (Person) o;
        }
    }
}