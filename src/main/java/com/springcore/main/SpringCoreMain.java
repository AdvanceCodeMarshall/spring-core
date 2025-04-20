package com.springcore.main;

import com.springcore.beans.Vehicle;
import com.springcore.configuration.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringCoreMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle Name :  " + vehicle.getName());
        System.out.println("Vehicle HashCode :  " + vehicle.hashCode());

         var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
         Vehicle vehicle1 = context.getBean(Vehicle.class);
         System.out.println("Vehicle Name :  " + vehicle1.getName());
        System.out.println("Vehicle HashCode :  " + vehicle1.hashCode());
    }
}
