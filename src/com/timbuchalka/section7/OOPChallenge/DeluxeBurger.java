package com.timbuchalka.section7.OOPChallenge;

import java.util.List;

/**
 *
 * @author tl0904
 */
public class DeluxeBurger extends Hamburger {
    
    private String name;
    private int price;
    private Items items;

    public DeluxeBurger() {
        this.name = "Deluxe Burger";
        this.items = new Items();
        this.price = 0;
    }

    public String getName() {
        return name;
    }

    @Override
    public void show(List<String> list) {
        price = getBread() + getMeat() + items.getValue("cheaps") + items.getValue("drink");
        System.out.println("You've choosen: " + this.getName());
        System.out.print(this.getBreadName() + ", meat, cheaps, drink, ");
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + ", ");
            price += items.getValue(list.get(i));
        }
        price += items.getValue(list.get(list.size() - 1));
        System.out.println(list.get(list.size() - 1));
        System.out.println("Price: " + price + " HUF");
    }
    
}
