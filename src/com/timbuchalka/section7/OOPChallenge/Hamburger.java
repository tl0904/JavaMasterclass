package com.timbuchalka.section7.OOPChallenge;

import java.util.List;

/**
 *
 * @author tl0904
 */
public class Hamburger {
    
    private String name;
    private String breadName;
    private int bread;
    private int meat;
    private int price;
    
    private Items items;
    
    public Hamburger() {
        this.name = "Hamburger";
        this.breadName = "Bread Roll";
        this.bread = 250;
        this.meat = 400;
        this.items = new Items();
        this.price = 0;
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

    public String getBreadName() {
        return breadName;
    }
    
    public void show(List<String> list) {
        price = this.getBread() + this.getMeat();
        System.out.println("You've choosen: " + this.getName());
        System.out.print(this.getBreadName() + ", meat, ");
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + ", ");
            price += items.getValue(list.get(i));
        }
        price += items.getValue(list.get(list.size() - 1));
        System.out.println(list.get(list.size() - 1));
        System.out.println("Price: " + price + " HUF");
    }
    
}
