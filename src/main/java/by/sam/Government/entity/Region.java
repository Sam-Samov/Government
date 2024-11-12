package by.sam.Government.entity;

public class Region {
    public String regionName;
    public String regionCapital;
    public double regionSquare;
    public int districtsAmount = 0;
    public int regionPopulation;
    public District[] districtsArr;


    public Region() {
        districtsAmount = (int) (5 + Math.random() * 20);
        District[] districtsArr = new District[districtsAmount];
        for (int i = 0; i < districtsAmount - 1; i++) {
            District district = new District();
            districtsArr[i] = district;
            regionPopulation += district.getDistrictPopulation();
        }
        regionPopulation += 1000;
        this.districtsArr = districtsArr;
    }

    public String getRegionName() {
        return regionName;
    }

    public String getRegionCapital() {
        return regionCapital;
    }

    public double getRegionSquare() {
        return regionSquare;
    }

    public int getDistrictsAmount() {
        return districtsAmount;
    }

    public int getRegionPopulation() {
        return regionPopulation;
    }

    public District[] getDistrictsArr() {
        return districtsArr;
    }
}
