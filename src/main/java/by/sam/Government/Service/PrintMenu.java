package by.sam.Government.Service;

public class PrintMenu {
    public void printMenu() {
        System.out.println("Введите номер команды для вывода информации:\n1 - Столица государства;\n2 - количество областей;" +
                "\n3 - площадь государства;\n4 - областные центры;\n5 - средний возраст жителей;\n6 - жители, у которых имя состоит из n букв;" +
                "\n7 - список жителей, у которых имя начинается с буквы char m.");
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

    public void printMethod1() {
        System.out.println("Method 1");
    }

    public void printMethod2() {
        System.out.println("Method 2");
    }

    public void printMethod3() {
        System.out.println("Method 3");
    }

    public void printMethod4() {
        System.out.println("Method 4");
    }

    public void printMethod5() {
        System.out.println("Method 5");
    }

    public void printMethod6() {
        System.out.println("Method 6");
    }

    public void printMethod7() {
        System.out.println("Method 7");
    }
}
