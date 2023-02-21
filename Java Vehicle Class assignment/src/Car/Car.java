
package Car;

public class Car {
    private String make;
    private String model;
    private String maxSpeed;

    public Car (String make, String model, String maxSpeed) {
        this.make = make;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void accelerate() {
        System.out.println("My" + " " +  make + " " + "is accelerating!");
    }

    public void brake() {
        System.out.println( make + " " + model + " " + "has an anti-lock braking system (ABS).");
    }

    public void handBrake() {
        System.out.println("No, my Tesla doesn't have a handbrake but it has an electric handbrake instead!");
    }
    
}

/*  We'll also have to make the car class a parent class with Hatchback and Sedan classes as child classes
in it */