package by.sam.Government.entity;

import by.sam.Government.Services.Service;

import java.util.ArrayList;

public class Region {
    public String regionName;
    public String regionCapitalName;
    public int regionSquare;
    public int districtsCount;
    public int regionPopulation;
    public ArrayList<District> districtsList;

    Service service = new Service();
    public Region() {
        districtsCount = (int) (2 + Math.random() * 5);
        ArrayList<District> districtsList = new ArrayList<>();
        for (int i = 0; i < districtsCount; i++) {
            District district = new District();
            districtsList.add(i, district);
            regionPopulation += district.getDistrictPopulation();
            regionName = service.generateObjectName();
            //regionSquare += district.getDistrictSquare(); см.PrintMenu printMethod3
        }
        this.districtsList = districtsList;
    }

    public String getRegionName() {
        return regionName;
    }

    public String getRegionCapitalName() {
        return regionCapitalName;
    }

    public int getRegionSquare() {
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

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public void setRegionCapitalName(String regionCapitalName) {
        this.regionCapitalName = regionCapitalName;
    }

    public void setRegionSquare(int regionSquare) {
        this.regionSquare = regionSquare;
    }
}
