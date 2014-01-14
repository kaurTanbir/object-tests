package tw.tanbirka;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
    public static List addPeopleToList(Person... persons){
        List<Person> people = new ArrayList<Person>();
        for (Person person : persons) {
            people.add(person);
        }
        return people;
    }
}