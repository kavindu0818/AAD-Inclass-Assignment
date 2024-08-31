package org.example.meals;

import org.example.Content.Food;
import org.springframework.stereotype.Component;

@Component
public class Pestry implements Food {

    public void aVoid(){
        System.out.println("Pestry");
    }
}
