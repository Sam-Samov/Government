package by.sam.Government.entity;

import by.sam.Government.Service.Service;

public class Citizen {
    private int id;
    private String name;
    private String surname;
    private int age;
    public static int counter = 0;
    private Government government;

    Service service = new Service();

    public Citizen() {
        ++counter;
        id = counter;
        name = service.generateName();
        surname = service.generateSurname();
        age = service.generateAge();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
