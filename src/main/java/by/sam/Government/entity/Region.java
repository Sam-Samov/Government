package by.sam.Government.entity;

import by.sam.Government.Services.Service;

import java.util.ArrayList;

public class Region {
    private String regionName;
    private String regionCapitalName;
    private int regionSquare;
    private int districtsCount;
    private int regionPopulation;
    public ArrayList<District> districtsList;

    Service service = new Service();
    public Region() {
        districtsCount = (int) (2 + Math.random() * 5);
        ArrayList<District> districtsList = new ArrayList<>();
        for (int i = 0; i < districtsCount; i++) {
            District district = new District();
            districtsList.add(i, district);
            regionName = service.generateObjectName();
            regionCapitalName = service.generateObjectName();
            //regionSquare += district.getDistrictSquare(); см.PrintMenu printMethod3
            //regionPopulation += district.getDistrictPopulation(); см.PrintMenu printMethod5
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

    @Override
    public String toString() {
        return "\nОбласть " + regionName +
                "\nОбластной центр: " + regionCapitalName +
                "\nКоличество районов: " + districtsCount +
                "\n__________________________________________________";
    }
}