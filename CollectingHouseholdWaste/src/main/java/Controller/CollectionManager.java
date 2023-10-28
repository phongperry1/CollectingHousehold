
package Controller;

import Model.CollectionModel;


public class CollectionManager {
    private final CollectionModel model;

    public CollectionManager(CollectionModel model) {
        this.model = model;
    }
    
    
    public void updateView() {
        model.printTotalCost(model.getTotalCost());
    }
    
    public void calculateCost() {
        model.calculateCost();
    }
}
