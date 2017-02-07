package entities.operators;

public class ExternalService extends Operator {
    private String location;


    public Location getConcreteLocation() {
        return new Location(location, null);
    }

    public void setConcreteLocation(String concreteLocation) {
        this.location = concreteLocation;
    }

}


