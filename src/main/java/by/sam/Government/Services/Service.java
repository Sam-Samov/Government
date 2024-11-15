package by.sam.Government.Services;

import by.sam.Government.entity.*;

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
        ArrayList<Region> regionsList = Government.getInstance().getRegionsList();
        for (int i = 0; i < regionsList.size(); i++) {
            ArrayList<District> districtsList = Government.getInstance().getRegionsList().get(i).getDistrictsList();
            for (int j = 0; j < districtsList.size(); j++) {
                ArrayList<City> citiesList = Government.getInstance().getRegionsList().get(i).getDistrictsList().get(j).getCitiesList();
                for (int k = 0; k < citiesList.size(); k++) {
                    ArrayList<Citizen> citizensList = Government.getInstance().getRegionsList().get(i).getDistrictsList().get(j).getCitiesList().get(k).getCitizensList();
                    allCitizensArrayList.addAll(citizensList);
                }
            }
        }
        return allCitizensArrayList;
    }
}