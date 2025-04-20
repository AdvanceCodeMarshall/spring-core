package com.springcore.configuration;

import com.springcore.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {

     @Bean
     public Vehicle vehicle() {
         var vehicle = new Vehicle();
         vehicle.setName("Honda");
         return vehicle;
     }

    @Bean
    String hello() {
        return "Hello";
    }
    @Bean
    Integer number() {
        return 10;
    }
}
