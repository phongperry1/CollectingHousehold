
package Model;


public class CollectionModel {
    private int[] garbageAtStations ;
    private int totalCost;

    public CollectionModel() {
    }

    public CollectionModel(int[] garbageAtStations) {
        this.garbageAtStations = garbageAtStations;
        this.totalCost = 0;
    }
    
    public void calculateCost() {
        int total = 0;
        int time = 0;
        int count = 0;
        
        for(int i = 0; i < garbageAtStations.length; i++) {
            total += garbageAtStations[i];
            time += 8;
            
            if(total > 10000) {
                total = 0;
                i--;
                time += 30 - 8;
                count++;
            } else if(i == garbageAtStations.length - 1) {
                time += 30;
            }
        }
        count++;
        this.totalCost = (time* 120000 / 60) + (57000 * count);
    }
    
    public int getTotalCost() {
        return this.totalCost;
    }
    
    public void printTotalCost(int totalCost) {
        System.out.println("The total cost is " + totalCost + " VND");
    }

    

    
    
    
}
