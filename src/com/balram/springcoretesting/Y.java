package com.balram.springcoretesting;

import java.util.logging.Logger;

public class Y {

    private static final Logger logger = Logger.getLogger("Y");
    private X x1;

    public Y(X x1) {
        logger.info("Inside Y constructor taking object x");
        this.x1 = x1;
    }

    public void display() {
        logger.info("Y displaying");
        x1.display();
    }
}
