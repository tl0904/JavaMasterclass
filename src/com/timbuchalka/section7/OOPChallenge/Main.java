package com.timbuchalka.section7.OOPChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author tl0904
 */
public class Main {

    public static void main(String[] args) {

        Map<Integer, String> items = Stream.of(new Object[][]{
            {1, "lettuce"},
            {2, "tomato"},
            {3, "carrot"},
            {4, "chees"},
            {5, "onion"},
            {6, "cucumber"},}).collect(Collectors.toMap(data -> (Integer) data[0], data -> (String) data[1]));

        Scanner sc = new Scanner(System.in);
        Hamburger hamburger;
        List<String> list = new ArrayList<>();
        int hambi = validateInput(sc);

        System.out.println(hambi);
        
        switch (hambi) {
            case 1:
                hamburger = new Hamburger();
                chooseItems(sc);
                break;
            case 2:
                hamburger = new HealthyBurger();
                chooseItems(sc);
                break;
            case 3:
                hamburger = new DeluxeBurger();
                chooseItems(sc);
                break;
        }
        
        sc.close();

    }

    public static int validateInput(Scanner sc) {

        int hambi = 0;
        boolean isNumber;
        do {
            System.out.println("Which burger do you choose?");
            System.out.println("1 - Hamburger, 2 - Healthy Burger, 3 - Deluxe Burger");
            if (sc.hasNextInt()) {
                hambi = sc.nextInt();
                while (hambi < 1 || hambi > 3) {
                    System.out.println("Please choose 1 or 2 or 3!");
                    hambi = sc.nextInt();
                }
                isNumber = true;
            } else {
                System.out.println("Please type only number!");
                isNumber = false;
                sc.next();
            }
        } while (!isNumber);
        sc.nextLine();

        return hambi;
    }
    
    public static void chooseItems(Scanner sc) {
        
        int number = 0;
        boolean isNumber;
        do {
            System.out.println("Choose items from the list!");
            System.out.println("1 - lettuce, 2 - tomato, 3 - carrot, 4 - cheese, "
                    + "5 - onion, 6 - cucumber");
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                while (number < 1 || number > 6) {
                    System.out.println("Please choose between 1 and 6!");
                    number = sc.nextInt();
                }
                isNumber = true;
            } else {
                System.out.println("Please type only whole number!");
                isNumber = false;
                sc.next();
            }
        } while (!isNumber);
        sc.nextLine();

    }

}
