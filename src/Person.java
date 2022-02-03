import java.util.OptionalInt;
import java.util.stream.Stream;

public class Person {

    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;


    public boolean hasAge() {
        return 0 != this.age;
    }

    public boolean hasAddress() {
        return null != this.address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(this.age);
    }

    public String setAddress(String address) {
        return this.address = address;
    }

    public void happyBirthday() {
        if (hasAge()) {
            this.age += 1;
        }
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public PersonBuilder newChildBuilder() { /*...*/
        return null;
    }

    @Override
    public String toString() {
        return "имя='" + name + '\'' +
                "фамилия='" + surname + '\'' +
                "возраст=" + age +
                "адрес='" + address + '\'';
    }

    @Override
    public int hashCode() { /*...*/
        return 0;
    }

}
