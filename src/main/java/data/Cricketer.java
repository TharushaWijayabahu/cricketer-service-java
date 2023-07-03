package data;

import java.util.Objects;

public class Cricketer {

    //name, juryNo, age, country
    private String name;
    private int jerseyId;
    private int age;
    private String country;

    public Cricketer(String name, int juryNo, int age, String country) {
        this.name = name;
        this.jerseyId = juryNo;
        this.age = age;
        this.country = country;
    }

    public Cricketer(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJerseyId() {
        return jerseyId;
    }

    @Override
    public String toString() {
        return "Cricketer{" + "name='" + name + '\'' + ", juryNo=" + jerseyId + ", age=" + age + ", country='" + country + '\'' + '}';
    }

    public void setJerseyId(int jerseyId) {
        this.jerseyId = jerseyId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Cricketer cricketer = (Cricketer) o;
        return jerseyId == cricketer.jerseyId && age == cricketer.age && name.equals(cricketer.name) && country.equals(cricketer.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, jerseyId, age, country);
    }
}
