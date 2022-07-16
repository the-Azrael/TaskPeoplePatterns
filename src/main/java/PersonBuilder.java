import java.util.function.Predicate;

public class PersonBuilder{
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public PersonBuilder() {

    }

    private boolean hasNameAndSurname() {
        return this.name != null && this.surname != null;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        Person person = new Person(this);

        /*if (person.getAge() < 0) {
            throw new IllegalArgumentException("Не допустимый возраст для " + this.name);
        }
        if (!person.hasAge()) {
            throw new IllegalArgumentException("Не указан возраст для " + this.name);
        }*/
        return person;
    }
}
