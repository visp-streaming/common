package ac.at.tuwien.infosys.visp.common.operators;


import java.util.ArrayList;
import java.util.List;

public abstract class Operator {

    public enum Size {
        SMALL, MEDIUM, UNKNOWN, LARGE
    }

    public static class Location {
        String ipAddress;
        String resourcePool;

        public Location(String ipAddress, String resourcePool) {
            this.ipAddress = ipAddress;
            this.resourcePool = resourcePool;
        }

        public Location() {

        }

        public String getIpAddress() {
            return ipAddress;
        }

        public void setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
        }

        public String getResourcePool() {
            return resourcePool;
        }

        public void setResourcePool(String resourcePool) {
            this.resourcePool = resourcePool;
        }

        @Override
        public String toString() {
            return ipAddress+"/"+resourcePool;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Location location = (Location) o;

            if (ipAddress != null ? !ipAddress.equals(location.ipAddress) : location.ipAddress != null) return false;
            return resourcePool != null ? resourcePool.equals(location.resourcePool) : location.resourcePool == null;
        }

        @Override
        public int hashCode() {
            int result = ipAddress != null ? ipAddress.hashCode() : 0;
            result = 31 * result + (resourcePool != null ? resourcePool.hashCode() : 0);
            return result;
        }
    }

    protected String name;
    protected String type;
    protected List<Operator> sources = new ArrayList<>();
    protected List<Operator> affectedInstances = new ArrayList<>();
    protected List<String> sourcesText = new ArrayList<>();
    @Deprecated protected String allowedLocations;
    protected List<Location> allowedLocationsList;
    protected List<String> inputFormat;
    protected String outputFormat;
    protected Size size;
    protected Location concreteLocation; // the actual concreteLocation, as decided by random assignment amongst all allowed ones
    protected boolean stateful; // whether operator has stateful behavior

    public boolean isStateful() {
        return stateful;
    }

    public void setStateful(boolean stateful) {
        this.stateful = stateful;
    }

    private String messageBrokerHost;

    public List<Location> getAllowedLocationsList() {
        return allowedLocationsList;
    }

    public Location getConcreteLocation() {
        return concreteLocation;
    }

    public void setConcreteLocation(Location concreteLocation) {
        this.concreteLocation = concreteLocation;
    }

    public void setAllowedLocationsList(List<Location> allowedLocationsList) {
        this.allowedLocationsList = allowedLocationsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Operator> getSources() {
        return sources;
    }

    public void setSources(List<Operator> sources) {
        this.sources = sources;
    }

    @Deprecated
    public String getAllowedLocations() {
        return allowedLocations;
    }

    @Deprecated
    public void setAllowedLocations(String allowedLocations) {
        this.allowedLocations = allowedLocations;
    }

    public List<String> getInputFormat() {
        return inputFormat;
    }

    public void setInputFormat(List<String> inputFormat) {
        this.inputFormat = inputFormat;
    }

    public String getOutputFormat() {
        return outputFormat;
    }

    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    public String getMessageBrokerHost() {
        return messageBrokerHost;
    }

    public void setMessageBrokerHost(String messageBrokerHost) {
        this.messageBrokerHost = messageBrokerHost;
    }

    public List<String> getSourcesText() {
        return sourcesText;
    }

    public void setSourcesText(List<String> sourcesText) {
        this.sourcesText = sourcesText;
    }

    public List<Operator> getAffectedInstances() {
        return affectedInstances;
    }

    public void setAffectedInstances(List<Operator> affectedInstances) {
        this.affectedInstances = affectedInstances;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Operator operator = (Operator) o;

        return name.equals(operator.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Operator{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", sources=" + sources +
                ", affectedInstances=" + affectedInstances +
                ", sourcesText=" + sourcesText +
                ", allowedLocations='" + allowedLocations + '\'' +
                ", inputFormat='" + inputFormat + '\'' +
                ", outputFormat='" + outputFormat + '\'' +
                ", messageBrokerHost='" + messageBrokerHost + '\'' +
                '}';
    }
}
