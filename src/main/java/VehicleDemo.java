//Class to test the superclass and subclass together in the main funtion
public class VehicleDemo {
    public static void main(String[] args){//main function
        Car car = new Car();//create an obectt to call the set functions
        Airplane airplane = new Airplane();
        //Set the data for both subclasses
        car.setName("Nissan GTR");
        airplane.setName("F18 Hornet");
        
        car.setMaxSpeed(195);
        airplane.setMaxSpeed(1385);
        
        car.setCylinders(6);
        airplane.setEngines(2);
        
        //Call the toString function
        System.out.println(car.toString());
        System.out.println(airplane.toString());
        //if statement to compare both classes
        if(car.getMaxSpeed() > airplane.getMaxSpeed())
            System.out.println(car.getName() + " is faster than " + airplane.getName());
        else
            System.out.println(airplane.getName() + " is faster than " + car.getName());
        
    }
}
