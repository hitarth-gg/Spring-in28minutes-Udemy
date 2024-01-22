package com.example.demo.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan // performs a component scan on the current package
public class DependencyInjectionLauncherApplication {

	public static void main(String[] args) {


		var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class);
		Arrays.stream(context.getBeanDefinitionNames()).forEach((System.out::println));
	}

}
