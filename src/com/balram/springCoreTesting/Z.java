package com.balram.springCoreTesting;

import org.springframework.beans.factory.annotation.Autowired;

public class Z {

        private X x2;

        @Autowired
        public Z(X x2){
            System.out.println("Y created");
            this.x2=x2;
        }

        public void display(){
            System.out.println("YYYYY");
            x2.display();
        }


}
