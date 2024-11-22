package com.gsv.lab;


class Vehicle {
     protected String brand;
     protected int speed;

 
     public Vehicle(String brand, int speed) {
     this.brand = brand;
     this.speed = speed;
 }

 
     public void displayInfo() {
     System.out.println("Brand: " + brand);
     System.out.println("Speed: " + speed + " km/h");
 }
     public void maxSpeed() {
    	 System.out.println("Max Speed: Not defined for generic vehicles.");
     }
}


class car1 extends Vehicle {
       private int numberOfDoors;

       public car1(String brand, int speed, int numberOfDoors) {
       super(brand, speed); 
       this.numberOfDoors = numberOfDoors;
 }

 @Override
       public void displayInfo() {
       super.displayInfo(); // Call superclass method
       System.out.println("Number of Doors: " + numberOfDoors);
 }
 public void maxSpeed() {
     System.out.println("Max Speed: 200 km/h");
 }
 
}

class Bicycle extends Vehicle {
     private boolean hasGear;


     public Bicycle(String brand, int speed, boolean hasGear) {
     super(brand, speed);
     this.hasGear = hasGear;
 }

 @Override
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Has Gear: " + (hasGear ? "Yes" : "No"));
 }
 public void maxSpeed() {
     System.out.println("Max Speed: 20 km/h");
 }
}

class Scooter extends Vehicle {
      private String fuelType;

 
      public Scooter(String brand, int speed, String fuelType) {
      super(brand, speed);
      this.fuelType = fuelType;
 }

 
      @Override
      public void displayInfo() {
      super.displayInfo();
      System.out.println("Fuel Type: " + fuelType);
 }
      public void maxSpeed() {
          System.out.println("Max Speed: 80 km/h");
      }
}


public class E07_02 {
	public static void main(String[] args) {
		// Create a Car object
		car1 Car = new car1("Toyota", 180, 4);
		System.out.println("Car Details:");
		Car.displayInfo();
		Car.maxSpeed();
		
		System.out.println();
		
		// Create a Bicycle object
		Bicycle bicycle = new Bicycle("Giant", 25, true);
		System.out.println("Bicycle Details:");
		bicycle.displayInfo();
		bicycle.maxSpeed();
		
		System.out.println();
		
		// Create a Scooter object
		Scooter scooter = new Scooter("Honda", 60, "Petrol");
		System.out.println("Scooter Details:");
		scooter.displayInfo();
		scooter.maxSpeed();
	}

}
