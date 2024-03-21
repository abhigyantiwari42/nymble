import java.util.ArrayList;
public class Passenger{

    // Variables
    private String name;
    private String passengerNumber;
    private Integer balance;
    private ArrayList<Activity> activities;

    //Constructors
    public Passenger(String name, String passengerNumber, Integer balance) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.balance = balance;
        this.activities = new ArrayList<Activity>();
    }
 
    // setter methods
    public void setName(String name){
        this.name = name;
    }
    public void setPassengerNumber(String passengerNumber){
        this.passengerNumber = passengerNumber;
    }
    public void setBalance(Integer balance){
        this.balance = balance;
    }

    public void setActivities(ArrayList<Activity> activities){
        this.activities = activities;
    }
   
    //Getter methods
    public String getName(){
        return this.name;
    }
    public String getPassengerNumber(){
        return this.passengerNumber;
    }
    public Integer getBalance(){
        return this.balance;
    }
    public ArrayList<Activity> getActivities(){
        return this.activities;
    }

     //Method to add activity for a passenger
     public void addActivity(Activity activity,Integer balance){
        if(activity.getCapacity()>activity.getRegistered()){
            this.activities.add(activity);
            this.balance = balance;
            activity.setRegistered(activity.getRegistered()+1);
        }
        else {
            System.out.println("You cannot register more than " + activity.getCapacity() + " activities");
        }
    }

    //Method to register for a new activity
    public void registerActivity(Activity activity){
        this.activities.add(activity);
    }
    //Print the details of an individual passenger
    public void printPassengerDetails(){
        System.out.println("Name-" + this.name);
        System.out.println("Passenger Number-" + this.passengerNumber);
        System.out.println("Balance-" + this.balance);
        for(Activity activity : this.activities){
            System.out.println(activity.getName() + " " + activity.getCost() + " " + activity.getCapacity() + " " + activity.getDescription());
        }
    }

}