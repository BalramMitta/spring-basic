package com.balram.springCoreTesting;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class Conf {

    @Bean
    public X x2(){
        return new X();
    }

    @Bean
    public Z z(){
        return new Z(x2());
    }

}
