public class Main{
    public static void main(String[] args){
            TravelPackage travelPackage = new TravelPackage("Sky Travel Package", 100);
            StandardPassenger standardPassenger = new StandardPassenger("Standard Passenger", "123456789", 1000);

            // Create a destination fro travel package
            Destination destination1 = new Destination("Mumbai");
            Destination destination2 = new Destination("Chennai");
            Destination destination3 = new Destination("Hyderabad");
            travelPackage.getDestinations().add(destination1);
            travelPackage.getDestinations().add(destination2);
            travelPackage.getDestinations().add(destination3);

            // Add a passenger to the travel package
            travelPackage.getPassengers().add(standardPassenger);
            
            // Add activities to a destination
            Activity activity1 = new Activity("Kudo", "Jumping", 100,   45);
            destination1.addActivity(activity1);
            destination2.addActivity(activity1);
            destination2.addActivity(new Activity("Mudo", "Rocking", 200, 50));
            destination3.addActivity(new Activity("Ludo", "Climbing", 300, 60));

            // Print the itinerary of the travel package
            travelPackage.printItinerary();

            // Print the passenger list of the travel package
            travelPackage.printPassengerList();
            


            // Register activity for a standard passenger from a destination

            standardPassenger.registerActivity(activity1);
            activity1.printAllActivityDetails();


    }
}