package ac.at.tuwien.infosys.visp.common.operators;

public class ExternalService extends Operator {
    private String location;


    public Location getConcreteLocation() {
        return new Location(location, null);
    }

    public void setConcreteLocation(String concreteLocation) {
        this.location = concreteLocation;
    }

}


