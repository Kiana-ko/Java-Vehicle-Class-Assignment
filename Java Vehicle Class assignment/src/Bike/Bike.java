
package Bike;

public class Bike {
    private String model;
    private String make;
    private int numberOfWheels;
    private String topSpeed;
    private String engine;

    public Bike(String model, String make, int numberOfWheels, String topSpeed, String engine) {
        this.model = model;
        this.make = make;
        this.numberOfWheels = numberOfWheels;
        this.topSpeed = topSpeed;
        this.engine = engine;
    }

    public void accelerate() {
        System.out.println("The " + make + " " + model + " is accelerating! ");
    }


    public void brake() {
        System.out.println("My" + " " + make + " " + model + " has several brakes which r: TRP Slate Evo,  4-piston, sintered metal pads,  180mm rotors. ");
    }
}
