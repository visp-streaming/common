package entities;

public class Report {
    private String id;
    private String averageSpeed;
    private String distance;

    public Report(String id, String averageSpeed, String distance) {
        this.id = id;
        this.averageSpeed = averageSpeed;
        this.distance = distance;
    }

    public Report() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(String averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
}
