package by.sam.Government.entity;

import by.sam.Government.Services.Service;

import java.util.ArrayList;

public class Government {
    private String governmentName;
    private String governmentCapitalName;
    private int governmentSquare;
    private int regionsCount;
    private int governmentPopulation;
    public ArrayList<Region> regionsList;

    private static volatile Government instance;

    public static Government getInstance() {
        Government government = instance;
        if (government == null) {
            synchronized (Government.class) {
                government = instance;
                if (government == null) {
                    instance = government = new Government();
                }
            }
        }
        return government;
    }

    Service service = new Service();
    private Government() {
        regionsCount = (int) (2 + Math.random() * 5);
        ArrayList<Region> regionsList = new ArrayList<>();
        for (int i = 0; i < regionsCount; i++) {
            Region region = new Region();
            regionsList.add(i, region);
            //governmentSquare += region.getRegionSquare(); см.PrintMenu printMethod3
            //governmentPopulation += region.getRegionPopulation(); см.PrintMenu printMethod5
        }
        this.regionsList = regionsList;
        governmentCapitalName = service.generateObjectName();
    }

    public String getGovernmentName() {
        return governmentName;
    }

    public void setGovernmentName(String governmentName) {
        this.governmentName = governmentName;
    }

    public ArrayList<Region> getRegionsList() {
        return regionsList;
    }

    public String getGovernmentCapitalName() {
        return governmentCapitalName;
    }

    public void setGovernmentCapitalName(String governmentCapitalName) {
        this.governmentCapitalName = governmentCapitalName;
    }

    public int getRegionsCount() {
        return regionsCount;
    }

    public int getGovernmentPopulation() {
        return governmentPopulation;
    }

    public void setGovernmentPopulation(int governmentPopulation) {
        this.governmentPopulation = governmentPopulation;
    }

    public int getGovernmentSquare() {
        return governmentSquare;
    }

    public void setGovernmentSquare(int governmentSquare) {
        this.governmentSquare = governmentSquare;
    }
}