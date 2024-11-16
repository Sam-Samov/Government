package by.sam.Government;

import by.sam.Government.Services.PrintMenu;
import by.sam.Government.entity.Government;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Government.getInstance();
        PrintMenu menu = new PrintMenu();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название государства: ");
        Government.getInstance().setGovernmentName(sc.next());
        sc.nextLine();
        System.out.println();
        while (true) {
            menu.printMenu();
            menu.printMethod(sc.nextInt());
            sc.nextLine();
        }
    }
}