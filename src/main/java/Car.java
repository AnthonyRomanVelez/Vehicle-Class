//Sub class of Vehicle class
public class Car extends Vehicle{//to gain access to the vehicle class I used the extends keyword
    private int numberOfCylinders;
    //constructor that inherits the variables from the superclass and adds its own
    public Car(){
        super("N/A", 0);
        setCylinders(0);
        
    }
    public Car(String name, int maxSpeed, int numberOfCylinders){
        super(name, maxSpeed);
        numberOfCylinders = 0;
    }
    //get and set function
    public void setCylinders(int numberOfCylinders){
        this.numberOfCylinders = numberOfCylinders;
    }
    public int getCylinders(){
        return numberOfCylinders;
    }
    public String toString(){
        return super.toString()+ "it has "+ numberOfCylinders + " Cylinders";
    }
    }

