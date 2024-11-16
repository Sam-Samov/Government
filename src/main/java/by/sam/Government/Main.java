package by.sam.Government;

import by.sam.Government.Services.PrintMenu;
import by.sam.Government.entity.Government;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Government.getInstance();
        Government.getInstance().setGovernmentName("Лапландия");

        PrintMenu menu = new PrintMenu();
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu.printMenu();
            menu.printMethod(sc.nextInt());
            sc.nextLine();
        }
    }
}