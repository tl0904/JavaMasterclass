package com.timbuchalka.section7.OOPChallenge;

import java.util.List;

/**
 *
 * @author tl0904
 */
public class Hamburger {
    
    private String name;
    private int bread;
    private int meat;
    
    private Items items;
    
    public Hamburger() {
        this.name = "Bread Roll";
        this.bread = 250;
        this.meat = 400;
    }

    public String getName() {
        return name;
    }

    public int getBread() {
        return bread;
    }

    public int getMeat() {
        return meat;
    }

    public Items getItems() {
        return items;
    }
    
    public void show(List<String> list) {
        System.out.println("You've choosen: Hamburger");
    }
    
}
