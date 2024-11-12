package by.sam.Government.entity;

public class Government {
    public String governmentName;
    public String governmentCapital;
    public int regionsAmount = 0;
    public int governmentPopulation;
    public Region[] regionsArr;

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
        regionsAmount = (int) (2 + Math.random() * 5);
        Region[] regionsArr = new Region[regionsAmount];
        for (int i = 0; i < regionsAmount - 1; i++) {
            Region region = new Region();
            regionsArr[i] = region;
            governmentPopulation += region.getRegionPopulation();
        }
        governmentPopulation += 2000;
        this.regionsArr = regionsArr;
    }

    public String getGovernmentName() {
        return governmentName;
    }

    public void setGovernmentName(String governmentName) {
        this.governmentName = governmentName;
    }

    public Region[] getRegionsArr() {
        return regionsArr;
    }

    public String getGovernmentCapital() {
        return governmentCapital;
    }
}

