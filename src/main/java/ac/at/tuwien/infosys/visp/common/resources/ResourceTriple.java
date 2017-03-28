package ac.at.tuwien.infosys.visp.common.resources;

public class ResourceTriple {
    private Double cores = 0.0;
    private Integer memory = 0;
    private Float storage = 0.0F;

    public ResourceTriple() {
        this.cores = 0.0;
        this.memory = 0;
        this.storage = 0.0F;
    }

    public ResourceTriple(Double cores, Integer memory, Float storage) {
        this.cores = cores;
        this.memory = memory;
        this.storage = storage;
    }


    public Double getCores() {
        return cores;
    }

    public void setCores(Double cores) {
        this.cores = cores;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Float getStorage() {
        return storage;
    }

    public void setStorage(Float storage) {
        this.storage = storage;
    }

    public void incrementCores(Double cores) {
        this.cores += cores;
    }

    public void incrementMemory(Integer memory) {
        this.memory += memory;
    }

    public void incrementStorage(Float storage) {
        this.storage += storage;
    }

    public void decrementCores(Double cores)  {
        this.cores -= cores;
        if (this.cores < 0){
            System.out.println("Too little cpu cores.");
        }
    }

    public void decrementMemory(Integer memory)  {
        this.memory -= memory;
        if (this.memory < 0){
            System.out.println("Too little cpu cores.");
        }
    }

    public void decrementStorage(Float storage)  {
        this.storage -= storage;
        if (this.storage < 0){
            System.out.println("Too little cpu cores.");
        }
    }

    public void increment(Double cores, Integer memory, Float storage) {
        incrementCores(cores);
        incrementMemory(memory);
        incrementStorage(storage);
    }

    public void decrement(Double cores, Integer memory, Float storage) {
        decrementCores(cores);
        decrementMemory(memory);
        decrementStorage(storage);
    }

    public void divideForMultipleRecordings(Integer counter) {
        this.cores = cores / counter;
        this.memory = memory / counter;
        this.storage = storage / counter;
    }

}