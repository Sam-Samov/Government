package by.sam.Government.Services;

import by.sam.Government.entity.City;
import by.sam.Government.entity.District;
import by.sam.Government.entity.Region;
import by.sam.Government.entity.Government;

import java.util.ArrayList;

public class PrintMenu {
    Service service = new Service();

    public void printMenu() {
        System.out.println("""
                Введите номер команды для вывода информации:
                1 - столица государства;
                2 - количество областей;
                3 - площадь государства;
                4 - список областных центров;
                5 - средний возраст жителей;
                6 - список жителей, у которых имя состоит из <...> букв;
                7 - список жителей, у которых имя начинается с буквы <...>.""");
    }

    public void printMethod(int printMethod) {
        switch (printMethod) {
            case (1): printMethod1(); break;
            case (2): printMethod2(); break;
            case (3): printMethod3(); break;
            case (4): printMethod4(); break;
            case (5): printMethod5(); break;
            case (6): printMethod6(); break;
            case (7): printMethod7(); break;
        }
        System.out.println("_______________________________________________________________");
        System.out.println();
    }
    //столица государства
    public void printMethod1() {
        System.out.println(Government.getInstance().getGovernmentCapitalName());
    }

    //количество областей
    public void printMethod2() {
        System.out.println(Government.getInstance().getRegionsCount());
    }

    /*Площадь государства здорового человека
    public void printMethod3() {
        System.out.println(Government.getInstance().getGovernmentSquare());
    }*/

    /*Площадь государства курильщика (это полный бред, но таково условие задачи: площадь должна считаться по вызову
    метода из консоли, а не заранее при создании объектов. В итоге заново гоняем все циклы, но в одном месте, штош...)
    PS. По условию задачи сэтать площади объектам не требуется, нужна только общая площадь, но пусть всё-таки будет.....*/
    public void printMethod3() {
        ArrayList<Region> regionsList = Government.getInstance().getRegionsList();
        int governmentSquare = 0;
        int sumRegionSquare = 0;
        int sumDistrictSquare = 0;
        int sumCitySquare = 0;
        for (int i = 0; i < regionsList.size(); i++) {
            ArrayList<District> districtsList = Government.getInstance().getRegionsList().get(i).getDistrictsList();
            for (int j = 0; j < districtsList.size(); j++) {
                ArrayList<City> citiesList = Government.getInstance().getRegionsList().get(i).getDistrictsList().get(j).getCitiesList();
                for (City city : citiesList) {
                    city.setCitySquare(service.generateSquare());
                    sumCitySquare += city.getCitySquare();
                }
                districtsList.get(j).setDistrictSquare(sumCitySquare);
                sumDistrictSquare += districtsList.get(j).getDistrictSquare();
            }
            regionsList.get(i).setRegionSquare(sumDistrictSquare);
            governmentSquare = sumRegionSquare += regionsList.get(i).getRegionSquare();
        }
        Government.getInstance().setGovernmentSquare(governmentSquare);
        System.out.println(Government.getInstance().getGovernmentSquare() + " км2");
    }

    //список областных центров
    public void printMethod4() {
        System.out.println("Method 4");
    }

    //средний возраст жителей
    public void printMethod5() {
        System.out.println("Method 5");
    }

    //список жителей, у которых имя состоит из <...> букв
    public void printMethod6() {
        System.out.println("Method 6");
    }
     //список жителей, у которых имя начинается с буквы <...>
    public void printMethod7() {
        System.out.println("Method 7");
    }
}