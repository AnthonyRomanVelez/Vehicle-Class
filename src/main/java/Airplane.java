//subclass from superclass Vehicle
public class Airplane extends Vehicle {//Airplane class extends from Vehicle class
    private int numberOfEngines;
    //constructor that inherit variables from super class and add its own
    public Airplane(){
        super("N/A",0);
        setEngines(0);
               
    }
    public Airplane(String name, int maxSpeed, int numberOfEngines){
        super(name, maxSpeed);
        numberOfEngines = 0;
    }
    //get and set function
    public void setEngines(int numberOfEngines){
        this.numberOfEngines = numberOfEngines;
    }
    public int getEngines(){
        return numberOfEngines;
    }
    public String toString(){
        return super.toString()+"it has " + numberOfEngines + " Engines";
    }
    }
