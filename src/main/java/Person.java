public class Person {
    public static final String DEFAULT_ADDRESS = "Тамбов";
    private final String name;
    private final String surname;
    private int age;
    private String address;

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.getSurname())
                .setAddress(this.getAddress());
    }

    public Person(PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.surname = personBuilder.surname;
        this.age = personBuilder.age;
        this.address = personBuilder.address;
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

    public void setAge(int age) {
        if (hasAge()) {
            happyBirthday();
        } else {
            this.age = age;
        }
    }

    public void setAddress(String address) {
        this.address = address;
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
        if (hasAddress()) {
            return address;
        } else {
            return "Не указан";
        }
    }

    public boolean hasAge() {
        return this.age > 0;
    }

    public boolean hasAddress() {
        return this.address != null;
    }

    public void happyBirthday() {
        if (hasAge()) {
            this.age += 1;
        }
    }

    @Override
    public String toString() {
        return "Person: {\n"
                + "\tname: " + getName() + ",\n"
                + "\tsurname: " + getSurname() + ",\n"
                + "\tage: " + getAge() + ",\n"
                + "\taddress: " + getAddress() + ",\n"
                + "}";
    }

    public String toOneLineString() {
        return "["
                + getName() + ";"
                + getSurname() + ";"
                + getAge() + ";"
                + getAddress()
                + "]";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
