package by.sam.Government.entity;

public class City {
    public String cityName;
    public double citySquare;
    public int cityPopulation;
    public Citizen[] citizensArr;

    public City() {
        cityPopulation = (int) (50 + Math.random() * 500);
        Citizen[] citizensArr = new Citizen[cityPopulation];
        for (int i = 0; i < cityPopulation - 1; i++) {
            Citizen citizen = new Citizen();
            citizensArr[i] = citizen;
        }
        this.citizensArr = citizensArr;
    }

    public String getCityName() {
        return cityName;
    }

    public double getCitySquare() {
        return citySquare;
    }

    public int getCityPopulation() {
        return cityPopulation;
    }

    public Citizen[] getCitizensArr() {
        return citizensArr;
    }
}
