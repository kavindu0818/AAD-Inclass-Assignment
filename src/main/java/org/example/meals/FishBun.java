package org.example.meals;

import org.example.Content.Food;
import org.springframework.stereotype.Component;

@Component
public class FishBun implements Food {
    public void aVoid(){
        System.out.println("FishBun");
    }


}
