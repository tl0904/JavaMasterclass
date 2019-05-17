package com.timbuchalka.section7.OOPChallenge;

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
    
}
