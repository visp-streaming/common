package ac.at.tuwien.infosys.visp.common.operators;

import ac.at.tuwien.infosys.visp.common.resources.ResourceTriple;

public class OperatorConfiguration {

    private String name;
    private Integer frequency;

    private ResourceTriple plannedResources;
    private ResourceTriple actualResources;

    //TODO add more information from the topology

    public OperatorConfiguration(String name) {
        this.name = name;
        //TODO make this dynamic
        this.frequency = 2400;
    }

    public OperatorConfiguration() {
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
}
