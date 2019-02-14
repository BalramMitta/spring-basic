package com.balram.springcoretesting;

import java.util.logging.Logger;

public class X {
    private static final Logger logger = Logger.getLogger("X");

    X() {
        logger.info("Inside X constructor");
    }

    void display() {
        logger.info("X displaying");
    }
}
