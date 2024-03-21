public class StandardPassenger extends Passenger {
    // Constructor parameters
    public StandardPassenger(String name, String passengerNumber, Integer balance) {
        super(name, passengerNumber, balance);
    }

    // Register Activity for a standard passenger
    public void registerActivity(Activity activity){
        if(activity.getCost() <= this.getBalance()){
             if (activity.getRegistered() == null) {
            activity.setRegistered(0); // Assuming a default value of 0 if it's null
        }
            this.addActivity(activity,this.getBalance() -activity.getCost());
        }
    }

} 