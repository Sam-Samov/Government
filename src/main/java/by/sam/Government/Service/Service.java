package by.sam.Government.Service;

public class Service {

    public char[] alfabetRusSmall() {
        char[] alfabet = new char[32];
        char sign = 'а';
        int i = 0;
        while (sign <= 'я') {
            alfabet[i++] = sign++;
        }
        return alfabet;
    }

    public String generateAbsctractName(int randWordLength) {
        StringBuilder s = new StringBuilder();
        s.append(Character.toUpperCase(alfabetRusSmall()[(int) (Math.random() * 32)]));
        for (int j = 1; j < randWordLength; j++) {
            s.append(alfabetRusSmall()[(int) (Math.random() * 32)]);
        }
        return String.valueOf(s);
    }

    public String generateCitizenName() {
        return generateAbsctractName((int) (5 + Math.random() * 5));
    }

    public String generateSurname() {
        return generateAbsctractName((int) (5 + Math.random() * 10));
    }

    public String generateObjectName() {
        return generateAbsctractName((int) (4 + Math.random() * 3));
    }

    public int generateSquare() {
        return (int) (1000 + Math.random() * 50000);
    }

    public int generateAge() {
        return (int) (1 + Math.random() * 70);
    }
}
