package by.sam.Government.entity;

import java.util.ArrayList;

public class Region {
    public String regionName;
    public String regionCapital;
    public double regionSquare;
    public int districtsCount;
    public int regionPopulation;
    public ArrayList<District> districtsList;


    public Region() {
        districtsCount = (int) (2 + Math.random() * 5);
        ArrayList<District> districtsList = new ArrayList<>();
        for (int i = 0; i < districtsCount; i++) {
            District district = new District();
            districtsList.add(i, district);
            regionPopulation += district.getDistrictPopulation();
        }
        this.districtsList = districtsList;
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

    public int getDistrictsCount() {
        return districtsCount;
    }

    public int getRegionPopulation() {
        return regionPopulation;
    }

    public ArrayList<District> getDistrictsList() {
        return districtsList;
    }
}
