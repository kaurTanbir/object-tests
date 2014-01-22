package tw.tanbirka;

public class AnotherPerson extends Person {

    public AnotherPerson(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (this.getAge() != person.getAge()) return false;
        if (this.getName() != null ? !this.getName().equals(person.getName()) : person.getName() != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = this.getAge();
        result = 31 * result + (this.getName() != null ? this.getName().hashCode() : 0);
        return result;
    }
}
