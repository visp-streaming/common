package ac.at.tuwien.infosys.visp.common.operators;

import java.util.List;

public class Split extends Operator {
    List<String> pathOrder;

    public List<String> getPathOrder() {
        return pathOrder;
    }

    public void setPathOrder(List<String> pathOrder) {
        this.pathOrder = pathOrder;
    }
}
