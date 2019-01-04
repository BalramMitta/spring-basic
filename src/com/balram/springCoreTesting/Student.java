package com.balram.springCoreTesting;

import java.beans.ConstructorProperties;

public class Student {
private String fname;
private String lname;

      @ConstructorProperties({"fname","lname"})
      Student(String fname,String lname){
          this.fname=fname;
          this.lname=lname;
          System.out.println("Student created from contructor arguments");
      }

      Student(){
            System.out.println("No Constructor arguments, getter setter methods");
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

public void displayInfo(){
	System.out.println("Hello: "+fname+" "+lname);
}
}
