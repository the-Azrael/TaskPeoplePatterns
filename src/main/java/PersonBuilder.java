import java.util.function.Predicate;

public class PersonBuilder{
    private String name;
    private String surname;
    private int age;
    private String address;

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
        if (age < 0) {
            throw new IllegalArgumentException("Не допустимый возраст для " + this.name);
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public Person build() {
        if (hasNameAndSurname()) {
            Person person = new Person(this);
            return person;
        } else {
            throw new IllegalArgumentException("Не хватает обязательных полей " + this.name);
        }
    }
}
