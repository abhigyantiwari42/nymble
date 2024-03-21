import java.util.ArrayList;
public class TravelPackage {
   
   private String name;
   private Integer capacity;
   private ArrayList<Passenger> passengers;
   private ArrayList<Destination> destinations;

   //Constructors
   public TravelPackage(String name, Integer capacity){
       this.name = name;
       this.capacity = capacity;
       this.passengers = new ArrayList<Passenger>();
       this.destinations = new ArrayList<Destination>();
   }

   // Setter methods
   public void setName(String name){
       this.name = name;
   }
   public void setCapacity(Integer capacity){
       this.capacity = capacity;
   }
   public void setPassengers(ArrayList<Passenger> passengers){
       this.passengers = passengers;
   }
   public void setDestinations(ArrayList<Destination> destinations){
       this.destinations = destinations;
   }

   // Getter methods
   public String getName(){
       return this.name;
   }
   public Integer getCapacity(){
       return this.capacity;
   }
   public ArrayList<Passenger> getPassengers(){
       return this.passengers;
   }
   public ArrayList<Destination> getDestinations(){
       return this.destinations;
   }

   //Print itinerary of the travel package 
   public void printItinerary(){
        System.out.println(this.name);
        for(Destination destination : this.destinations){
            System.out.println(destination.getName());
            for(Activity activity : destination.getActivities()){
                System.out.println(activity.getName() + " " + activity.getCost() + " " + activity.getCapacity() + " " + activity.getDescription());
            }
            System.out.println();
        }
    }

    //Print the passenger list of the travel package
    public void printPassengerList(){
        System.out.println(this.name);
        System.out.println("Capcity-" + this.capacity);
        System.out.println("Size-" + this.passengers.size());
        for(Passenger passenger : this.passengers){
            System.out.println("Name-" + passenger.getName() + " " + "Number-" + passenger.getPassengerNumber() + " " +"Balance-" + passenger.getBalance());
        }
        System.out.println();
    }

}