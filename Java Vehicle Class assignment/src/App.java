import Car.Car;

import Bike.Bike;

import Cycle.Cycle;

import Hatchback.Hatchback;

import Sedan.Sedan;

import Truck.Truck;

import Vehicle.Vehicle;

//Importing our packages


public class App {
    public static void main(String[] args) {
        Car KianasCar = new Car("Tesla","Model X","250 to 262 km/h");
        KianasCar.accelerate();  
        KianasCar.brake();       
        KianasCar.handBrake();

        Bike KianasBike = new Bike("Mountain bike", "Whyte 901", 2, "30km/hr ", " ");
       // KianasBike.break();
        KianasBike.accelerate();
        KianasBike.brake();
    }
}


// Uisng the fucnctions and everything we made in the other classes in our main class which is App.java
