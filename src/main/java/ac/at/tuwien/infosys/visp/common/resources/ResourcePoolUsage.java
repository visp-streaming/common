package ac.at.tuwien.infosys.visp.common.resources;

public class ResourcePoolUsage {

    private String name;
    private Double cost;
    private Integer cpuFrequency;
    private Double availability;
    private ResourceTriple overallResources;

    private ResourceTriple plannedResources;
    private ResourceTriple actualResources;

    public ResourcePoolUsage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getCpuFrequency() {
        return cpuFrequency;
    }

    public void setCpuFrequency(Integer cpuFrequency) {
        this.cpuFrequency = cpuFrequency;
    }

    public Double getAvailability() {
        return availability;
    }

    public void setAvailability(Double availability) {
        this.availability = availability;
    }

    public ResourceTriple getOverallResources() {
        return overallResources;
    }

    public void setOverallResources(ResourceTriple overallResources) {
        this.overallResources = overallResources;
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


}
