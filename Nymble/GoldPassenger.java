public class GoldPassenger extends Passenger{
    //Constructor parameters
    public GoldPassenger(String name, String passengerNumber, Integer balance){
        super(name, passengerNumber, balance);
    }

    // Register activity for a gold passenger
    public void registerActivity(Activity activity){
        double discountedCost = activity.getCost() * 0.9;
        if(discountedCost <= this.getBalance()){
            this.addActivity(activity,this.getBalance() - (int) Math.round(discountedCost));
        }
    }
}