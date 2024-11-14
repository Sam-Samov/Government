package by.sam.Government.Services;

public class Service {

    public char[] alphabetRusSmall() {
        char[] alphabet = new char[32];
        char sign = 'а';
        int i = 0;
        while (sign <= 'я') {
            alphabet[i++] = sign++;
        }
        return alphabet;
    }

    public String generateAbstractName(int randWordLength) {
        StringBuilder s = new StringBuilder();
        s.append(Character.toUpperCase(alphabetRusSmall()[(int) (Math.random() * 32)]));
        for (int j = 1; j < randWordLength; j++) {
            s.append(alphabetRusSmall()[(int) (Math.random() * 32)]);
        }
        return String.valueOf(s);
    }

    public String generateCitizenName() {
        return generateAbstractName((int) (5 + Math.random() * 5));
    }

    public String generateSurname() {
        return generateAbstractName((int) (5 + Math.random() * 10));
    }

    public String generateObjectName() {
        return generateAbstractName((int) (4 + Math.random() * 3));
    }

    public int generateSquare() {
        return (int) (1000 + Math.random() * 50000);
    }

    public int generateAge() {
        return (int) (1 + Math.random() * 70);
    }
}
