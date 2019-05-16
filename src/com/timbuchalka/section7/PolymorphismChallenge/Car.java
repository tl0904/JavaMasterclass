package com.timbuchalka.section7.PolymorphismChallenge;

/**
 *
 * @author tl0904
 */
public class Car {
    
    private int cylinders;
    private String name;
    private int wheels;
    private boolean engine;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    
    public void startEngine() {
        System.out.println(this.cylinders + " cylinders in the " + this.name + " are starting");
    }
    
    public void accelerate() {
        System.out.println(this.name + " is accelerating");
    }
    
    public void breaks() {
        System.out.println(this.name + " is breaking");
    }
}
