package by.sam.Government.entity;

public class District {
    public String districtName;
    public String districtCapital;
    public double districtSquare;
    public int citiesAmount = 0;
    public int districtPopulation;
    public City[] citiesArr;

    public District() {
        citiesAmount = (int) (5 + Math.random() * 20);
        City[] citiesArr = new City[citiesAmount];
        for (int i = 0; i < citiesAmount - 1; i++) {
            City city = new City();
            citiesArr[i] = city;
            districtPopulation += city.getCityPopulation();
        }
        districtPopulation += 100;
        this.citiesArr = citiesArr;
    }

    public String getDistrictName() {
        return districtName;
    }

    public String getDistrictCapital() {
        return districtCapital;
    }

    public double getDistrictSquare() {
        return districtSquare;
    }

    public int getCitiesAmount() {
        return citiesAmount;
    }

    public int getDistrictPopulation() {
        return districtPopulation;
    }

    public City[] getCitiesArr() {
        return citiesArr;
    }
}
