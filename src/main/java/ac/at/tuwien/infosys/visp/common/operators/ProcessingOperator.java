package ac.at.tuwien.infosys.visp.common.operators;


import java.util.List;

public class ProcessingOperator extends Operator {

    protected double expectedDuration, scalingCPUThreshold, scalingMemoryThreshold, queueThreshold;

    private boolean replicationAllowed, pinned;

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

    public double getExpectedDuration() {
        return expectedDuration;
    }

    public void setExpectedDuration(double expectedDuration) {
        this.expectedDuration = expectedDuration;
    }

    public double getScalingCPUThreshold() {
        return scalingCPUThreshold;
    }

    public void setScalingCPUThreshold(double scalingCPUThreshold) {
        this.scalingCPUThreshold = scalingCPUThreshold;
    }

    public double getScalingMemoryThreshold() {
        return scalingMemoryThreshold;
    }

    public void setScalingMemoryThreshold(double scalingMemoryThreshold) {
        this.scalingMemoryThreshold = scalingMemoryThreshold;
    }

    public double getQueueThreshold() {
        return queueThreshold;
    }

    public void setQueueThreshold(double queueThreshold) {
        this.queueThreshold = queueThreshold;
    }

    public boolean isPinned() {
        return pinned;
    }

    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }
}
