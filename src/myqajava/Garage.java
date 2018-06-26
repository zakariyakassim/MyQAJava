
package myqajava;

import java.util.ArrayList;

public class Garage {
    
    ArrayList<Vehicle> vehicles;
    
    public Garage() {
        
      vehicles = new ArrayList<Vehicle>();
        

    }
    
    public void addNewVehicle(Vehicle vehicle){
        
        this.vehicles.add(vehicle);
        
    }
    
    public ArrayList<Vehicle> searchVehicleByOwner(String owner){
       ArrayList<Vehicle> searchedVehicles = new ArrayList<Vehicle>();
        
        for (int i = 0; i < this.vehicles.size(); i++) {
            
            if (this.vehicles.get(i).getOwner().toLowerCase().contains(owner.toLowerCase())) {
                searchedVehicles.add(this.vehicles.get(i));
            }
            
        }
        
        return searchedVehicles;
    }
    
    public ArrayList<Vehicle> getAllVehicles(){
        
        return vehicles;
    }
    
}
