package by.sam.Government.entity;

import java.util.ArrayList;

public class Government {
    public String governmentName;
    public String governmentCapital;
    public double governmentSquare;
    public int regionsCount;
    public int governmentPopulation;
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

    private Government() {
        regionsCount = (int) (2 + Math.random() * 5);
        ArrayList<Region> regionsList = new ArrayList<>();
        for (int i = 0; i < regionsCount; i++) {
            Region region = new Region();
            regionsList.add(i, region);
            governmentPopulation += region.getRegionPopulation();
            governmentSquare += region.regionSquare;
        }
        this.regionsList = regionsList;
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

    public String getGovernmentCapital() {
        return governmentCapital;
    }

    public int getRegionsCount() {
        return regionsCount;
    }

    public int getGovernmentPopulation() {
        return governmentPopulation;
    }

    public void setGovernmentCapital(String governmentCapital) {
        this.governmentCapital = governmentCapital;
    }

    public void setGovernmentSquare(double governmentSquare) {
        this.governmentSquare = governmentSquare;
    }
}

