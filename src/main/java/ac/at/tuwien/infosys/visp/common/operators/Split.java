package ac.at.tuwien.infosys.visp.common.operators;

import java.util.List;

public class Split extends Operator {

    private List<String> pathOrder;
    private boolean lazyDeployment = false;

    public List<String> getPathOrder() {
        return pathOrder;
    }

    public void setPathOrder(List<String> pathOrder) {
        this.pathOrder = pathOrder;
    }

    public boolean isLazyDeployment() {
        return lazyDeployment;
    }

    public void setLazyDeployment(boolean lazyDeployment) {
        this.lazyDeployment = lazyDeployment;
    }
}
