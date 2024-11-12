package by.sam.Government;

import by.sam.Government.entity.Government;

public class Main {
    public static void main(String[] args) {
        Government.getInstance();
        Government.getInstance().setGovernmentName("Лапландия");

        System.out.println(Government.getInstance().getGovernmentName());
        System.out.println(Government.getInstance().getRegionsArr()[0].getDistrictsArr()[0].getCitiesArr()[0].getCitizensArr()[0].getId());
        System.out.println("Количество жителей: " + Government.getInstance().governmentPopulation);
    }
}
