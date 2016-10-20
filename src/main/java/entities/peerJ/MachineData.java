package entities.peerJ;

public class MachineData {

    private String id;
    private String assetID;
    private String machineType;
    private String location;

    private Integer producedUnits;
    private Integer defectiveUnits;
    private Integer plannedProductionTime;
    private String active;
    private String timestamp;

    public MachineData() {
    }

    public MachineData(String id, String assetID, String machineType, String location, Integer producedUnits, Integer defectiveUnits, Integer plannedProductionTime, String active, String timestamp) {
        this.id = id;
        this.assetID = assetID;
        this.machineType = machineType;
        this.location = location;
        this.producedUnits = producedUnits;
        this.defectiveUnits = defectiveUnits;
        this.plannedProductionTime = plannedProductionTime;
        this.active = active;
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAssetID() {
        return assetID;
    }

    public void setAssetID(String assetID) {
        this.assetID = assetID;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getProducedUnits() {
        return producedUnits;
    }

    public void setProducedUnits(Integer producedUnits) {
        this.producedUnits = producedUnits;
    }

    public Integer getDefectiveUnits() {
        return defectiveUnits;
    }

    public void setDefectiveUnits(Integer defectiveUnits) {
        this.defectiveUnits = defectiveUnits;
    }

    public Integer getPlannedProductionTime() {
        return plannedProductionTime;
    }

    public void setPlannedProductionTime(Integer plannedProductionTime) {
        this.plannedProductionTime = plannedProductionTime;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}



