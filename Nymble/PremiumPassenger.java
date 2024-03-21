public class PremiumPassenger extends Passenger {
    // Constructor parameters
    public PremiumPassenger(String name, String passengerNumber, Integer balance) {
        super(name, passengerNumber, balance);
    }

    // Register activity for a Premium Passeng
    public void registerActivity(Activity activity){
            this.addActivity(activity,this.getBalance());
    }
}
