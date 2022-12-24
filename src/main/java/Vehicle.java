//This is a super class
public class Vehicle {
    //variables that will be shared by the subclasses
    private String name;
    private int maxSpeed;
    
    public Vehicle(String name, int maxSpeed){//constructor
        name = "N/A";
        maxSpeed = 0;
    }
    //get and set functions to acces the private data
    public void setName(String name){
        this.name = name;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public String getName(){
        return name;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public String toString(){//toString function to be called in the main function
        return "The name of the vehicle is : "+ name +" and it's max speed is: "+maxSpeed + " MPH\n";
    }
    }
