package ac.at.tuwien.infosys.visp.common.resources;

/**
 * Connection between to visp runtimes
 * Describes the properties of the network connection between resource pools of
 * the "start" runtime and resource pools of the "end" runtime.
 * Self-References (i.e. start = end) are considered as well.
 */
public class VISPConnectionDTO {

    private String start;
    private String end;
    private Double delay;
    private Double dataRate;
    private Double availability;

    public VISPConnectionDTO() {

    }

    public VISPConnectionDTO(String start, String end, Double delay, Double dataRate, Double availability) {
        this.start = start;
        this.end = end;
        this.delay = delay;
        this.dataRate = dataRate;
        this.availability = availability;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Double getDelay() {
        return delay;
    }

    public void setDelay(Double delay) {
        this.delay = delay;
    }

    public Double getDataRate() {
        return dataRate;
    }

    public void setDataRate(Double dataRate) {
        this.dataRate = dataRate;
    }

    public Double getAvailability() {
        return availability;
    }

    public void setAvailability(Double availability) {
        this.availability = availability;
    }
}
