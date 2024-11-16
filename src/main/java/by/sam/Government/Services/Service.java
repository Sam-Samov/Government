package by.sam.Government.Services;

import by.sam.Government.entity.*;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;

public class Service {

    public char[] alphabetRusSmall() {
        char[] alphabet = new char[32];
        char sign = 'а';
        int i = 0;
        while (sign <= 'я') {
            alphabet[i++] = sign++;
        }
        return alphabet;
    }

    public String generateAbstractName(int randWordLength) {
        StringBuilder s = new StringBuilder();
        s.append(Character.toUpperCase(alphabetRusSmall()[(int) (Math.random() * 32)]));
        for (int j = 1; j < randWordLength; j++) {
            s.append(alphabetRusSmall()[(int) (Math.random() * 32)]);
        }
        return String.valueOf(s);
    }

    public String generateCitizenName() {
        return generateAbstractName((int) (5 + Math.random() * 5));
    }

    public String generateSurname() {
        return generateAbstractName((int) (5 + Math.random() * 10));
    }

    public String generateObjectName() {
        return generateAbstractName((int) (4 + Math.random() * 3));
    }

    public int generateSquare() {
        return (int) (1000 + Math.random() * 50000);
    }

    public int generateAge() {
        return (int) (1 + Math.random() * 70);
    }

    public ArrayList<Citizen> getAllCitizensArrayList() {
        ArrayList<Citizen> allCitizensArrayList = new ArrayList<>();
        ArrayList<City> citiesList = getAllCitiesArrayList();
        for (City city : citiesList) {
            ArrayList<Citizen> citizensList = city.getCitizensList();
            allCitizensArrayList.addAll(citizensList);
        }
        return allCitizensArrayList;
    }

    public ArrayList<City> getAllCitiesArrayList() {
        ArrayList<City> allCitiesArrayList = new ArrayList<>();
            ArrayList<District> districtsList = getAllDistrictsArrayList();
        for (District district : districtsList) {
            ArrayList<City> citiesList = district.getCitiesList();
            allCitiesArrayList.addAll(citiesList);
        }
        return allCitiesArrayList;
    }

    public ArrayList<District> getAllDistrictsArrayList() {
        ArrayList<District> allDistrictsArrayList = new ArrayList<>();
        ArrayList<District> districtsList;
        ArrayList<Region> regionsList = Government.getInstance().getRegionsList();
        for (int i = 0; i < regionsList.size(); i++) {
            districtsList = Government.getInstance().getRegionsList().get(i).getDistrictsList();
            allDistrictsArrayList.addAll(districtsList);
        }
        return allDistrictsArrayList;
    }

    /*Площадь государства здорового человека
    public void printMethod3() {
        System.out.println(Government.getInstance().getGovernmentSquare());
    }*/

    //"Площадь государства" курильщика
    public double governmentSquare() {
        int governmentSquare = 0;
        ArrayList<City> cityArrayList = getAllCitiesArrayList();
        for (City city : cityArrayList) {
            governmentSquare += city.getCitySquare();
        }
        return governmentSquare;
    }

    //Список областных центров
    public ArrayList<String> regionsCapitalsArrayList() {
        ArrayList<Region> regionsArrayList = Government.getInstance().getRegionsList();
        ArrayList<String> regionsCapitalsArrayList = new ArrayList<>();
        for (Region region : regionsArrayList) {
            regionsCapitalsArrayList.add(region.getRegionCapitalName());
        }
        return regionsCapitalsArrayList;
    }

     /*"средний возраст жителей" здорового человека
    public void printMethod3() {
        System.out.println(Government.getInstance().getGovernmentPopulation());
    }*/

    //"средний возраст жителей" курильщика
    public double midAge() {
        int countCitizens = getAllCitizensArrayList().size();
        int sumCityAge = 0;
        ArrayList<Citizen> citizensList = getAllCitizensArrayList();
        for (Citizen citizen : citizensList)
            sumCityAge += citizen.getCitizenAge();
        DecimalFormatSymbols separator = new DecimalFormatSymbols();
        separator.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#.#", separator);
        return Double.parseDouble(df.format((double) sumCityAge / countCitizens));
    }

    //Список жителей, у которых имя состоит из <...> букв
    public ArrayList<Citizen> citizenNameLengthN(int n) {
        ArrayList<Citizen> citizensList = getAllCitizensArrayList();
        ArrayList<Citizen> citizenNameLengthNList = new ArrayList<>();
        for (Citizen citizen : citizensList) {
            int citizenNameLengthCurrent = citizen.getCitizenName().length();
            if (citizenNameLengthCurrent == n) {
                citizenNameLengthNList.add(citizen);
            }
        }
        return citizenNameLengthNList;
    }

    //Список жителей, у которых имя начинается с буквы <...>
    public ArrayList<Citizen> citizenNameFirstList(String letter) {
        ArrayList<Citizen> citizensList = getAllCitizensArrayList();
        ArrayList<Citizen> citizenNameFirstList = new ArrayList<>();
        String citizenNameFirstCurrent;
        for (Citizen citizen : citizensList) {
            citizenNameFirstCurrent = citizen.getCitizenName().substring(0,1);
            if (citizenNameFirstCurrent.equals(letter)) {
                citizenNameFirstList.add(citizen);
            }
        }
        return citizenNameFirstList;
    }
}