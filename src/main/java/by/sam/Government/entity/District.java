package by.sam.Government.entity;

import by.sam.Government.Services.Service;

import java.util.ArrayList;

public class District {
    private String districtName;
    private String districtCapitalName;
    private int districtSquare;
    private int citiesCount;
    private int districtPopulation;
    public ArrayList<City> citiesList;

    Service service = new Service();
    public District() {
        citiesCount = (int) (5 + Math.random() * 5);
        ArrayList <City> citiesList= new ArrayList<>();
        for (int i = 0; i < citiesCount; i++) {
            City city = new City();
            citiesList.add(i, city);
            districtName = service.generateObjectName();
            districtCapitalName = service.generateObjectName();
            //districtSquare += city.getCitySquare(); см.PrintMenu printMethod3
            //districtPopulation += city.getCityPopulation(); см.PrintMenu printMethod5
        }
        this.citiesList = citiesList;
    }

    public String getDistrictName() {
        return districtName;
    }

    public String getDistrictCapitalName() {
        return districtCapitalName;
    }

    public int getDistrictSquare() {
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

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public void setDistrictCapitalName(String districtCapitalName) {
        this.districtCapitalName = districtCapitalName;
    }

    public void setDistrictSquare(int districtSquare) {
        this.districtSquare = districtSquare;
    }

    @Override
    public String toString() {
        return "\nРайон: " + districtName +
                "\nРайонный центр: " + districtCapitalName +
                "\nКоличество городов: " + citiesCount +
                "\n________________________________________";
    }
}