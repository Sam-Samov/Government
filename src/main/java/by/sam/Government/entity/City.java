package by.sam.Government.entity;

public class City {
    public String cityName;
    public double citySquare;
    public int cityPopulation;
    public Citizen[] citizensArr;

    public City() {
        cityPopulation = (int) (50 + Math.random() * 500);
        Citizen[] citizensArr = new Citizen[cityPopulation];
        for (int i = 0; i < cityPopulation; i++) {
            Citizen citizen = new Citizen();
            citizensArr[i] = citizen;
        }
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getCitySquare() {
        return citySquare;
    }

    public void setCitySquare(double citySquare) {
        this.citySquare = citySquare;
    }

    public int getCityPopulation() {
        return cityPopulation;
    }

    public void setCityPopulation(int cityPopulation) {
        this.cityPopulation = cityPopulation;
    }

    public Citizen[] getCitizensArr() {
        return citizensArr;
    }

    public void setCitizensArr(Citizen[] citizensArr) {
        this.citizensArr = citizensArr;
    }
}
