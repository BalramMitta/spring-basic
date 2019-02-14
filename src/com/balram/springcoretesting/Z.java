package com.balram.springcoretesting;


import java.util.logging.Logger;

public class Z {

    private static final Logger logger = Logger.getLogger("Z");
    private X x2;

    public Z(X x2) {
        logger.info("Inside Z constructor taking object x");
        this.x2 = x2;
    }

    public void display() {
        logger.info("Z displaying");
        x2.display();
    }


}
