package by.sam.Government.entity;

import java.util.ArrayList;

public class City {
    public String cityName;
    public double citySquare;
    public int cityPopulation;
    public ArrayList<Citizen> citizensList;

    public City() {
        cityPopulation = (int) (50 + Math.random() * 100000);
        ArrayList<Citizen> citizensList= new ArrayList<>();
        for (int i = 0; i < cityPopulation; i++) {
            Citizen citizen = new Citizen();
            citizensList.add(i, citizen);
        }
        this.citizensList = citizensList;
    }

    public String getCityName() {
        return cityName;
    }

    public double getCitySquare() {
        return citySquare;
    }

    public int getCityPopulation() {
        return cityPopulation;
    }

    public ArrayList<Citizen> getCitizensList() {
        return citizensList;
    }
}
