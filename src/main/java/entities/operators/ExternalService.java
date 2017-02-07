package entities.operators;

public class ExternalService extends Operator {
    private String location;


    public String getConcreteLocation() {
        return location;
    }

    public void setConcreteLocation(String concreteLocation) {
        this.location = concreteLocation;
    }

}


