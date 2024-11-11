package by.sam.Government;

import by.sam.Government.Service.Service;
import by.sam.Government.entity.Citizen;
import by.sam.Government.entity.Government;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Citizen[] citizensArr = new Citizen[0];
        Government.getInstance();
        Government.getInstance().setGovernmentName("Лапландия");

        System.out.println(Government.getInstance().getGovernmentName());
        System.out.println(Government.getInstance().getCitiesArr()[0].getCitizensArr()[0].getId());
    }
}
