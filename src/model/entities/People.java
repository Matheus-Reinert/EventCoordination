package model.entities;

public class People {

    private String name;
    private String surname;

    public People() {
    }

    public People(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return " \n"
                +  name
                + " "
                + surname
                +  "\n";
    }

}
