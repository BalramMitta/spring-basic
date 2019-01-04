package com.balram.springCoreTesting;

public class Y {

    private X x1;

    //@Autowired
   public Y(X x1){
        System.out.println("Y created");
        this.x1=x1;
    }

    public void display(){
        System.out.println("YYYYY");
        x1.display();
    }
}
