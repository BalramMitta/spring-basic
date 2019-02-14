package com.balram.springcoretesting;

import org.springframework.context.annotation.Bean;


public class Conf {

    @Bean
    public X x2() {
        return new X();
    }

    @Bean
    public Z z() {
        return new Z(x2());
    }

}
