package ac.at.tuwien.infosys.visp.common.resources;

public class OperatorConfiguration {

    private String name;
    private Integer frequency;
    private Double expectedDuration;
    private Double actualDuration;
    private Integer itemsWaiting;
    private Double incomingRate;
    private Double networkUpload;
    private Double networkDownload;
    private ResourceTriple plannedResources;
    private ResourceTriple actualResources;

    public OperatorConfiguration() {
    }

    public OperatorConfiguration(String name, Integer frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public ResourceTriple getPlannedResources() {
        return plannedResources;
    }

    public void setPlannedResources(ResourceTriple plannedResources) {
        this.plannedResources = plannedResources;
    }

    public ResourceTriple getActualResources() {
        return actualResources;
    }

    public void setActualResources(ResourceTriple actualResources) {
        this.actualResources = actualResources;
    }

    public Double getExpectedDuration() {
        return expectedDuration;
    }

    public void setExpectedDuration(Double expectedDuration) {
        this.expectedDuration = expectedDuration;
    }

    public Double getActualDuration() {
        return actualDuration;
    }

    public void setActualDuration(Double actualDuration) {
        this.actualDuration = actualDuration;
    }

    public Integer getItemsWaiting() {
        return itemsWaiting;
    }

    public void setItemsWaiting(Integer itemsWaiting) {
        this.itemsWaiting = itemsWaiting;
    }

    public Double getIncomingRate() {
        return incomingRate;
    }

    public void setIncomingRate(Double incomingRate) {
        this.incomingRate = incomingRate;
    }

    public Double getNetworkUpload() {
        return networkUpload;
    }

    public void setNetworkUpload(Double networkUpload) {
        this.networkUpload = networkUpload;
    }

    public Double getNetworkDownload() {
        return networkDownload;
    }

    public void setNetworkDownload(Double networkDownload) {
        this.networkDownload = networkDownload;
    }
}
