package by.sam.Government.entity;

import java.util.ArrayList;

public class District {
    public String districtName;
    public String districtCapital;
    public double districtSquare;
    public int citiesCount;
    public int districtPopulation;
    public ArrayList<City> citiesList;

    public District() {
        citiesCount = (int) (5 + Math.random() * 5);
        ArrayList <City> citiesList= new ArrayList<>();
        for (int i = 0; i < citiesCount; i++) {
            City city = new City();
            citiesList.add(i, city);
            districtPopulation += city.getCityPopulation();
        }
        this.citiesList = citiesList;
    }

    public String getDistrictName() {
        return districtName;
    }

    public String getDistrictCapital() {
        return districtCapital;
    }

    public double getDistrictSquare() {
        return districtSquare;
    }

    public int getCitiesCount() {
        return citiesCount;
    }

    public int getDistrictPopulation() {
        return districtPopulation;
    }

    public ArrayList<City> getCitiesList() {
        return citiesList;
    }
}
