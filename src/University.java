import java.time.LocalDate;

public class University {
    private String name;
    private LocalDate yearOfFoundation;
    private String[] fakulties;
    private String address;

    public University() {
    }

    public University(String name, LocalDate yearOfFoundation, String[] fakulties, String address) {
        this.name = name;
        this.yearOfFoundation = yearOfFoundation;
        this.fakulties = fakulties;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(LocalDate yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public String[] getFakulties() {
        return fakulties;
    }

    public void setFakulties(String[] fakulties) {
        this.fakulties = fakulties;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

