package org.example.meals;

import org.example.Content.Food;
import org.springframework.stereotype.Component;

@Component
public class ChickenBun implements Food {
    public void aVoid(){
        System.out.println("ChickenBun");
    }
}
