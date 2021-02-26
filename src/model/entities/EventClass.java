package model.entities;

import java.util.ArrayList;
import java.util.List;

public class EventClass {

    private String name;
    private Integer capacity;

    private final List<People> people = new ArrayList<>();

    public EventClass(){
    }

    public EventClass(String name, Integer capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public void addPeople(People p) {
        people.add(p);
    }

    public void remove(People p) {
        people.remove(p);
    }

}
