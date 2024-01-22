package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// 1. Launch the Spring context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

		// 2. Configure the things that we want spring to manage
			// HelloWorldConfig.java - @Configuration
			// name - @Bean

		// 3. Get the bean from the context
		var temp = context.getBean("name");
		System.out.println(temp); // → Ranga

		System.out.println(context.getBean("person")); // → Person[name=Ravi, age=20]
		System.out.println(context.getBean("personMethodCalls")); // → Person[name=Ranga, age=20]
		System.out.println(context.getBean("personParameters")); // → Person[name=not Ranga lmao, age=20]
		System.out.println(context.getBean("address2")); // → Address[city=City1, state=State1]
		System.out.println(context.getBean(Address.class)); // → Address[city=CityPrimary, state=StatePrimary]


//		context.getBeanDefinitionNames(); // → [name, age, person, personMethodCalls, personParameters, address2, org.springframework.context.annotation.internalConfigurationAnnotationProcessor, org.springframework.context.annotation.internalAutowiredAnnotationProcessor, org.springframework.context.annotation.internalCommonAnnotationProcessor, org.springframework.context.event.internalEventListenerProcessor, org.springframework.context.event.internalEventListenerFactory, helloWorldConfig]
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}
}
