package com.balram.springcoretesting;

import java.util.logging.Logger;

public class Animal {

    private static final Logger logger = Logger.getLogger("Animal");
    Food food;

    Animal() {
        logger.info("animal is created");
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food1) {
        this.food = food1;
    }

    public void eat(){
        logger.info("Eating "+food.name);
    }

}
