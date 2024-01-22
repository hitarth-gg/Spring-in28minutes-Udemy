package com.example.demo.businessAssignment;

import com.example.demo.businessAssignment.components.BusinessCalculationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.demo.businessAssignment")
public class Runner {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Runner.class);

//        var mongoDB = context.getBean(DataService.class);
        var businessCalc = context.getBean(BusinessCalculationService.class);
        System.out.println(businessCalc.findMax());
    }
}
