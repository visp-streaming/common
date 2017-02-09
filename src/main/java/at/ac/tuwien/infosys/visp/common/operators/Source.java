package at.ac.tuwien.infosys.visp.common.operators;

public class Source extends Operator {
    private String source;
    private String mechanism;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Deprecated
    public String getMechanism() {
        return mechanism;
    }

    @Deprecated
    public void setMechanism(String mechanism) {
        this.mechanism = mechanism;
    }

}
