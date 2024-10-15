package Collection;

public class xyz {
    String name;
    int id;
    String city;

    public xyz(String name, int id, String city) {
        this.name = name;
        this.id = id;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "xyz{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", city='" + city + '\'' +
                '}';
    }
}
