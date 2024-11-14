package by.sam.Government.entity;

import by.sam.Government.Service.Service;

import java.util.ArrayList;

public class City {
    public String cityName;
    public double citySquare;
    public int cityPopulation;
    public ArrayList<Citizen> citizensList;

    Service service = new Service();
    public City() {
        cityPopulation = (int) (50 + Math.random() * 100000);
        ArrayList<Citizen> citizensList= new ArrayList<>();
        for (int i = 0; i < cityPopulation; i++) {
            Citizen citizen = new Citizen();
            citizensList.add(i, citizen);
            cityName = service.generateObjectName();
            citySquare = service.generateSquare();
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

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCitySquare(double citySquare) {
        this.citySquare = citySquare;
    }
}
