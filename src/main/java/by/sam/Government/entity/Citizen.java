package by.sam.Government.entity;

import by.sam.Government.Services.Service;

public class Citizen {
    private final int citizenID;
    private String citizenName;
    private String citizenSurname;
    private int citizenAge;
    private static int counter = 0;
    private Government government;

    Service service = new Service();

    public Citizen() {
        ++counter;
        citizenID = counter;
        citizenName = service.generateCitizenName();
        citizenSurname = service.generateSurname();
        citizenAge = service.generateAge();
    }

    public int getCitizenID() {
        return citizenID;
    }

    public String getCitizenName() {
        return citizenName;
    }

    public String getCitizenSurname() {
        return citizenSurname;
    }

    public int getCitizenAge() {
        return citizenAge;
    }

    public void setCitizenName(String citizenName) {
        this.citizenName = citizenName;
    }

    public void setCitizenSurname(String citizenSurname) {
        this.citizenSurname = citizenSurname;
    }

    public void setCitizenAge(int citizenAge) {
        this.citizenAge = citizenAge;
    }

    @Override
    public String toString() {
        return "\nЖитель" +
                "\nID: " + citizenID +
                "\nИмя: " + citizenName +
                "\nФамилия: " + citizenSurname +
                "\nВозраст: " + citizenAge +
                "\n_________________________________";
    }
}