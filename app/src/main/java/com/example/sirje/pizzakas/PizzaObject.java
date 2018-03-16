package com.example.sirje.pizzakas;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/**
 * Created by sirje on 15.03.2018.
 */

public class PizzaObject {
    String pizzaName;
    String pizzaComponents;
    Integer pizzaPicture;

    public PizzaObject(String pizzaName, String pizzaComponents, Integer pizzaPicture) {
        this.pizzaName = pizzaName;
        this.pizzaComponents = pizzaComponents;
        this.pizzaPicture = pizzaPicture;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getPizzaComponents() {
        return pizzaComponents;
    }

    public void setPizzaComponents(String pizzaComponents) {
        this.pizzaComponents = pizzaComponents;
    }

    public Integer getPizzaPicture() {
        return pizzaPicture;
    }

    public void setPizzaPicture(Integer pizzaPicture) {
        this.pizzaPicture = pizzaPicture;
    }
}
