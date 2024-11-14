package by.sam.Government;

import by.sam.Government.Services.PrintMenu;
//import by.sam.Government.Services.Service;
import by.sam.Government.entity.Government;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Government.getInstance();
        Government.getInstance().setGovernmentName("Лапландия");
        /*Service service = new Service();
        System.out.println("Название государства: " + Government.getInstance().getGovernmentName());
        System.out.println("Количество областей государства: " + Government.getInstance().getRegionsCount());
        System.out.println("Количество районов области 1: " + Government.getInstance().getRegionsList().get(0).getDistrictsCount());
        System.out.println("Количество городов района 1: " + Government.getInstance().getRegionsList().get(0).getDistrictsList().get(0).getCitiesCount());
        System.out.println("Количество жителей города 1: " + Government.getInstance().getRegionsList().get(0).getDistrictsList().get(0).getCitiesList().get(0).getCityPopulation());
        System.out.println("Возраст 1го жителя 1го города 1го района 1ой области: " + Government.getInstance().getRegionsList().get(0).getDistrictsList().get(0).getCitiesList().get(0).getCitizensList().get(0).getCitizenAge());
        System.out.println("Имя 1го жителя 1го города 1го района 1ой области: " + Government.getInstance().getRegionsList().get(0).getDistrictsList().get(0).getCitiesList().get(0).getCitizensList().get(0).getCitizenName());
        System.out.println("Имя 1го жителя 1го города 1го района 1ой области: " + Government.getInstance().getRegionsList().get(0).getDistrictsList().get(0).getCitiesList().get(0).getCitizensList().get(1).getCitizenName());
        System.out.println("Количество жителей государства: " + Government.getInstance().governmentPopulation);*/

        PrintMenu menu = new PrintMenu();
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu.printMenu();
            menu.printMethod(sc.nextInt());
        }
    }
}