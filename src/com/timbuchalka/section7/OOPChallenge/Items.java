package com.timbuchalka.section7.OOPChallenge;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author tl0904
 */
public class Items {

    private Map<String, Integer> items;
    
    public Items() {
        
        this.items = Stream.of(new Object[][] { 
            { "lettuce", 40 }, 
            { "tomato", 60 }, 
            { "carrot", 50 },
            { "chees", 90 },
            { "onion", 30 },
            { "cucumber", 40 },
            { "cheaps", 50 },
            { "drink", 100 },
        }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));
    }

    public Map<String, Integer> getItems() {
        return items;
    }
    
    public int getValue(String key) {
        return items.get(key);
    }

}
