import java.util.Objects;
import java.util.OptionalInt;

public class Person {

    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;


    public boolean hasAge() {
        return 0 != age;
    }

    public boolean hasAddress() {
        return null != address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        if (hasAge()) {
            return OptionalInt.of(age);
        } else return OptionalInt.empty();
    }

    public String getAddress() {
        return hasAddress() ? address : "Адрес не указан";
    }

    public String setAddress(String address) {
        return this.address = address;
    }

    public void happyBirthday() {
        if (hasAge()) {
            age += 1;
        }
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this(name, surname);
        this.age = age;
    }

    public PersonBuilder newChildBuilder() { /*...*/
        return new PersonBuilder()
                .setSurname(surname)
                .setAddress(getAddress());
    }

    @Override
    public String toString() {
        return  "Имя ='" + name + '\'' +"\n"+
                "Фамилия ='" + surname + '\'' +"\n"+
                "Возраст =" + (getAge().isPresent()? getAge().getAsInt() : "Возраст не указан ") +"\n"+
                "Адрес ='" + address + '\'';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }

}
