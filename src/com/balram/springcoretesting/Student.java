package com.balram.springcoretesting;

import java.beans.ConstructorProperties;
import java.util.logging.Logger;

public class Student {

    private static final Logger logger = Logger.getLogger("Student");
    private String fname;
    private String lname;

    @ConstructorProperties({"fname", "lname"})
    Student(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
        logger.info("Student created from contructor arguments");
    }

    Student() {

        logger.info("Student created from default constructor");
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void displayInfo() {
        logger.info("Hello: " + fname + " " + lname);
    }
}
