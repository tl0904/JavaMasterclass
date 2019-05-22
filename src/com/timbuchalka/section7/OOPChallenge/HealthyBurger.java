package com.timbuchalka.section7.OOPChallenge;

import java.util.List;

/**
 *
 * @author tl0904
 */
public class HealthyBurger extends Hamburger {
    
    private String name;
    private String breadName;
    private int bread;

    public HealthyBurger() {
        this.name = "Healthy Burger";
        this.breadName = "Brown Rye Bread Roll";
        this.bread = 320;
    }

    public String getName() {
        return name;
    }

    public int getBread() {
        return bread;
    }

    public String getBreadName() {
        return breadName;
    }

    @Override
    public void show(List<String> list) {
        super.show(list);
    }
    
    
}
