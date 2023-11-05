public class School {
    private String name;
    private String director;
    private String address;

    public School() {
    }

    public School(String name, String director, String address) {
        this.name = name;
        this.director = director;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getaddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
