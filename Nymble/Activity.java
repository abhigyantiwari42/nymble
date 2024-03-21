public class Activity {
    private String name;
    private String description;
    private Integer cost;
    private Integer capacity;
    private Integer registered;
    private Destination destination;

    //Constructor parameters
    public Activity(String name, String description, Integer cost, Integer capacity) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
    }
    // Getter methods  
    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return this.description;
    }
    public Integer getCost() {
        return this.cost;
    }
    public Integer getCapacity() {
        return this.capacity;
    }
    public Integer getRegistered() {
        return this.registered;
    }
    public Destination getDestination() {
        return this.destination;
    }
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCost(Integer cost) {
        this.cost = cost;
    }
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
    public void setRegistered(Integer registered) {
        this.registered = registered;
    }
    public void setDestination(Destination destination) {
        this.destination = destination;
    }
    //Prints the details of all the activities that still have spaces available
    public void printAllActivityDetails() {
        System.out.println("Name-" + this.getName());
        System.out.println("Description-" + this.getDescription());
        System.out.println("Cost-" + this.getCost());
        System.out.println("Capacity-" + this.getCapacity());
        System.out.println("Spaces Available-" + String.valueOf(this.getCapacity() - this.getRegistered()));
    }
    @Override
    public String toString() {
        return "Activity{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                ", capacity=" + capacity +
                ", registered=" + registered +
                ", destination=" + destination +
                '}';
    }
}