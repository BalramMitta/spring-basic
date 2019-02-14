package com.balram.springcoretesting;

import java.util.logging.Logger;

public class Food {

    private static final Logger logger = Logger.getLogger("Food");
    String name;

    Food(String name) {
        this.name = name;
        logger.info("Food : " + name + " is created from xml");
    }
}
