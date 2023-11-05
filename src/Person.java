public class Person {
    private String name;
    private int age;
    private String country;

    public Person() {
    }

    public Person(String name, int age, String country) {
        this.name = name;
        checkAge(age);
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        checkAge(age);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean checkAge(int age) {
        boolean isTrue = true;
        if (age < 0) {
            System.err.println("Invalid age " + age);
            System.exit(0);
        } else {
            this.age = age;
        }
        return isTrue;
    }
}
