import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;;
public class UnitTest {

   
    @Test
    public void travelPackage_destination() {
        TravelPackage travelPackage = new TravelPackage("Sky Travel Package", 100);
        // Create a destination for travel package
        Destination destination1 = new Destination("Mumbai");
        ArrayList<Destination> destinations = new ArrayList<Destination>();
        destinations.add(destination1);
        travelPackage.setDestinations(destinations);
        assertEquals(destinations, travelPackage.getDestinations());
    }
    @Test
    public void travelPackage_passenger() {
        TravelPackage travelPackage = new TravelPackage("Sky Travel Package", 100);
        // Create a destination for travel package
        Passenger passenger = new StandardPassenger("Standard Passenger", "123456789", 1000);
        ArrayList<Passenger> passengers = new ArrayList<Passenger>();
        passengers.add(passenger);
        travelPackage.setPassengers(passengers);
        assertEquals(passengers, travelPackage.getPassengers());
    }

    @Test
    public void destination_activity() {
        Destination destination1 = new Destination("Mumbai"); 
        ArrayList<Activity> activities = new ArrayList<Activity>();
        Activity activity = new Activity("Kudo", "Jumping", 100,   45);
        activities.add(activity);       // Create a destination for travel package
        activity.setDestination(destination1);
        destination1.setActivities(activities);
        System.out.println(activity.toString());
        assertEquals(activities, destination1.getActivities() );
        assertEquals(destination1,destination1.getActivities().get(0).getDestination());
    }

    @Test
    public void passenger_low_balance() {
        StandardPassenger standardPassenger = new StandardPassenger("Standard Passenger", "123456789", 0);

        Activity activity1 = new Activity("Kudo", "Jumping", 100,   45);
        standardPassenger.registerActivity(activity1);

        assertEquals(0,standardPassenger.getActivities().size());

    }
    @Test
    public void passenger_high_balance() {
        StandardPassenger standardPassenger = new StandardPassenger("Standard Passenger", "123456789", 1000);

        Activity activity1 = new Activity("Kudo", "Jumping", 100,   45);
        standardPassenger.registerActivity(activity1);

        assertEquals(1,standardPassenger.getActivities().size());
        assertEquals((Integer)900, standardPassenger.getBalance());

    }


}

   

    
