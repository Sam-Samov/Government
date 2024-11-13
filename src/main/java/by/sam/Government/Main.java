package by.sam.Government;

import by.sam.Government.entity.Government;

public class Main {
    public static void main(String[] args) {
        Government.getInstance();
        Government.getInstance().setGovernmentName("Лапландия");

        System.out.println("Название государства: " + Government.getInstance().getGovernmentName());
        System.out.println("Количество областей государства: " + Government.getInstance().getRegionsList().size());
        System.out.println("Количество областей государства: " + Government.getInstance().getRegionsCount());
        System.out.println("Количество районов области 1: " + Government.getInstance().getRegionsList().get(0).getDistrictsList().size());
        System.out.println("Количество районов области 1: " + Government.getInstance().getRegionsList().get(0).getDistrictsCount());
        System.out.println("Количество городов района 1: " + Government.getInstance().getRegionsList().get(0).getDistrictsList().get(0).getCitiesList().size());
        System.out.println("Количество городов района 1: " + Government.getInstance().getRegionsList().get(0).getDistrictsList().get(0).getCitiesCount());
        System.out.println("Количество жителей города 1: " + Government.getInstance().getRegionsList().get(0).getDistrictsList().get(0).getCitiesList().get(0).getCitizensList().size());
        System.out.println("Количество жителей города 1: " + Government.getInstance().getRegionsList().get(0).getDistrictsList().get(0).getCitiesList().get(0).getCityPopulation());
        System.out.println("Возраст 1го жителя 1го города 1го района 1ой области: " + Government.getInstance().getRegionsList().get(0).getDistrictsList().get(0).getCitiesList().get(0).getCitizensList().get(0).getAge());
        System.out.println("Количество жителей государства: " + Government.getInstance().governmentPopulation);
    }
}
