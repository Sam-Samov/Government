package by.sam.Government.entity;

public class Government {
    public String governmentName;
    public Region[] regionArr;

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

    public String getGovernmentName() {
        return governmentName;
    }

    public void setGovernmentName(String governmentName) {
        this.governmentName = governmentName;
    }

    public Region[] getRegionArr() {
        return regionArr;
    }

    public void setRegionArr(Region[] regionArr) {
        this.regionArr = regionArr;
    }

    public District[] getDistrictArr() {
        return districtArr;
    }

    public void setDistrictArr(District[] districtArr) {
        this.districtArr = districtArr;
    }

    public City[] getCityArr() {
        return cityArr;
    }

    public void setCityArr(City[] cityArr) {
        this.cityArr = cityArr;
    }
}

