package ac.at.tuwien.infosys.visp.common.operators;


import java.util.List;

public class ProcessingOperator extends Operator {
    @Deprecated
    private String scalingThreshold;

    private String expectedDuration;
    private String queueThreshold;

    private boolean replicationAllowed;

    public boolean isReplicationAllowed() {
        return replicationAllowed;
    }

    public void setReplicationAllowed(boolean replicationAllowed) {
        this.replicationAllowed = replicationAllowed;
    }

    public List<String> getRoutingKeys() {
        return routingKeys;
    }

    public void setRoutingKeys(List<String> routingKeys) {
        this.routingKeys = routingKeys;
    }

    private List<String> routingKeys;

    @Deprecated
    public String getScalingThreshold() {
        return scalingThreshold;
    }

    @Deprecated
    public void setScalingThreshold(String scalingThreshold) {
        this.scalingThreshold = scalingThreshold;
    }

    public String getExpectedDuration() {
        return expectedDuration;
    }

    public void setExpectedDuration(String expectedDuration) {
        this.expectedDuration = expectedDuration;
    }

    public String getQueueThreshold() {
        return queueThreshold;
    }

    public void setQueueThreshold(String queueThreshold) {
        this.queueThreshold = queueThreshold;
    }
}
