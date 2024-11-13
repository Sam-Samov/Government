package by.sam.Government.Service;

public class Service {
    public char[] alfabetRusBig() {
        char[] alfabet = new char[32];
        char sign = 'А';
        int i = 0;
        while (sign <= 'Я') {
            alfabet[i++] = sign++;
        }
        return alfabet;
    }

    public char[] alfabetRusSmall() {
        char[] alfabet = new char[32];
        char sign = 'а';
        int i = 0;
        while (sign <= 'я') {
            alfabet[i++] = sign++;
        }
        return alfabet;
    }

    public String generateName() {
        int randWordLength = (int) (5 + Math.random() * 5);
        StringBuilder s = new StringBuilder();
        s.append(Character.toString(alfabetRusBig()[(int) (Math.random() * 32)]));
        for (int j = 1; j < randWordLength; j++) {
            s.append(Character.toString(alfabetRusSmall()[(int) (Math.random() * 32)]));
        }
        return String.valueOf(s);
    }

    public String generateSurname() {
        int randWordLength = (int) (5 + Math.random() * 10);
        StringBuilder s = new StringBuilder();
        s.append(Character.toString(alfabetRusBig()[(int) (Math.random() * 32)]));
        for (int j = 1; j < randWordLength; j++) {
            s.append(Character.toString(alfabetRusSmall()[(int) (Math.random() * 32)]));
        }
        return String.valueOf(s);
    }

    public String generateObjectName() {
        String cityName = "";
        return cityName;
    }

    public int generateSquare() {
        return (int) (Math.random() * 50000);
    }

    public int generateAge() {
        return (int) (1 + Math.random() * 70);
    }
}
