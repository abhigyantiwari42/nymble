import java.util.ArrayList;

public class Destination {
    private String name;
    private ArrayList<Activity> Activities;
    
    //
    public Destination(String name) {
        this.name = name;
        this.Activities = new ArrayList<Activity>();
    }
    public String getName() {
        return this.name;
    }   
    public ArrayList<Activity> getActivities() {
        return this.Activities;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setActivities(ArrayList<Activity> Activities) {
       this.Activities = Activities;
    }
    public void addActivity(Activity activity) {
        
        if(activity.getDestination()==null)
        {
            activity.setDestination(this);
            this.Activities.add(activity);
        }   
    }   
}

