package com.timbuchalka.section7.PolymorphismChallenge;

/**
 *
 * @author tl0904
 */
public class Main {
    
    public static void main(String[] args) {
        
        for (int i = 1; i < 11; i++) {
            Car car = randomCar();
            System.out.println("Car # " + i);
            car.startEngine();
            car.accelerate();
            car.breaks();
        }
    }
    
    public static Car randomCar() {
        int randomNumber = (int) (Math.random()* 3) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Ford();
            case 2:
                return new Porshe();
            case 3:
                return new Trabant();
            default:
                return null;
        }
    }
    
}
