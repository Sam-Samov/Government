package by.sam.Government.Services;

import by.sam.Government.entity.*;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Scanner;

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
            case (1):
                printMethod1();
                break;
            case (2):
                printMethod2();
                break;
            case (3):
                printMethod3();
                break;
            case (4):
                printMethod4();
                break;
            case (5):
                printMethod5();
                break;
            case (6):
                printMethod6();
                break;
            case (7):
                printMethod7();
                break;
        }
        System.out.println("_______________________________________________________________");
        System.out.println();
    }

    //Сводная информация "Государство"
    public void printMethod1() {
        System.out.println(Government.getInstance());
    }

    //Количество областей
    public void printMethod2() {
        System.out.println("\nКоличество областей: " + Government.getInstance().getRegionsList().size());
    }

    //Площадь государства
    public void printMethod3() {
        double governmentSquare = service.governmentSquare();
        System.out.println("\nПлощадь государства: " + governmentSquare + " км2");
    }

    //Список областных центров
    public void printMethod4() {
        ArrayList<String> regionsCapitalsArrayList = service.regionsCapitalsArrayList();
        System.out.println("\nСписок областных центров:\n" + regionsCapitalsArrayList);
    }

    //Средний возраст жителей
    public void printMethod5() {
        double midAge = service.midAge();
        System.out.println("\nСредний возраст жителей: " + midAge + " лет");
    }

    //Список жителей, у которых имя состоит из <...> букв
    public void printMethod6() {
        System.out.println("Введите количество букв в имени:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Citizen> citizenNameLengthNList = service.citizenNameLengthN(n);
        System.out.println("\nСписок жителей, у которых имя состоит из <...> букв:\n" + citizenNameLengthNList);
        System.out.println("\nКоличество данных жителей:  " + citizenNameLengthNList.size());
    }

    //Список жителей, у которых имя начинается с буквы <...>
    public void printMethod7() {
        System.out.println("Введите ЗАГЛАВНУЮ русскую букву:");
        Scanner sc = new Scanner(System.in);
        String letter = sc.nextLine();
        ArrayList<Citizen> citizenNameFirstList = service.citizenNameFirstList(letter);
        System.out.println("\nСписок жителей, у которых имя начинается с буквы " + letter + ":\n" + citizenNameFirstList);
        System.out.println("\nКоличество данных жителей:  " + citizenNameFirstList.size());
    }
}