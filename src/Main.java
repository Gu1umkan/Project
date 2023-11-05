import java.time.LocalDate;
import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class Main {

    public static void main(String[] args) {
        University university = new University("KTMU", LocalDate.of(1995, 9, 30), new String[]{"Fen", "Engineering", "Tourism"}, "Bishkek");
        University university1 = new University("OshSU", LocalDate.of(1951, 10, 6), new String[]{"MIT", "Medical", "Tourism"}, "Osh");
        University university2 = new University();
        university2.setName("BSU");
        university2.setYearOfFoundation(LocalDate.of(1979, 5, 29));
        university2.setFakulties(new String[]{"Fen", "Engineering", "Tourism"});
        university2.setAddress("Bishkek");

        University[] universities = {university, university1, university2};

        School school1 = new School("A.Toraliev secondary school", "K.Shakirova ", "Kadamjay");
        School school2 = new School("O.Abdrahmanov secondary school", "T.Duysheev ", "Aidarken");
        School school3 = new School("Ming-Chynar high school", "N.Arzymatova ", "Ming-Chynar");
        School school4 = new School();
        school4.setName("Orukzar high school");
        school4.setDirector("A.Gaparov ");
        school4.setAddress("Orukzar");

        School[] schools = {school1, school2, school3, school4};

        Car car1 = new Car("Tayota", "Camry", 2017);
        Car car2 = new Car("Mers", "S-Class", 2012);
        Car car3 = new Car();
        car3.setMarka("BMW");
        car3.setName("X-5");
        car3.setYear(2020);

        Car[] cars = {car1, car2, car3};

        Person person1 = new Person("Gulumkan", 21, "Kyrgyzstan");
        Person person2 = new Person("Urmat", 19, "Russian");
        Person person3 = new Person();
        person3.setName("Zarina");
        person3.setAge(21);
        person3.setCountry("Germany");

        Person[] people = {person1, person2, person3};

        for (University universty : universities) {
            System.out.println(STR. """
                 Name of  university : \{ universty.getName() }
                 Date of foundation : \{ universty.getYearOfFoundation() }
                 Address : \{ universty.getAddress() }
                    """ );
        }
        for (School school : schools) {
            System.out.println(STR. """
                    Name of school : \{ school.getName() }
                    Director of school : \{ school.getDirector() }
                    Address : \{ school.getaddress() }
                    """ );

        }
        for (Car car : cars) {
            System.out.println(STR. """
                    Marka of car : \{ car.getMarka() }
                    Name of car :\{ car.getName() }
                    Year : \{ car.getYear() }
                   """ );

        }
        for (Person person : people) {
            System.out.println(STR. """
                    Person name : \{ person.getName() }
                    Person age :\{ person.getAge() }
                    Country : \{ person.getCountry() }
                    """ );

        }

    }
}