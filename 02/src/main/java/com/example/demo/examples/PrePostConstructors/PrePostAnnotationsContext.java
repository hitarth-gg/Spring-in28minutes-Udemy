package com.example.demo.examples.PrePostConstructors;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Configuration
class SomeClass {
	private SomeDependency someDependency;

	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All dependencies are ready");
	}

	@PostConstruct
	public void initialize() {
		someDependency.getReady();
	}

	@PreDestroy
	public void cleanup () {
		System.out.println("PreDestroy Called");
	}
}

@Component
class SomeDependency {
	public void getReady()
	{
		System.out.println("------Post Construct Called-----");
	}
}

@Configuration
@ComponentScan // performs a component scan on the current package
public class PrePostAnnotationsContext {

	public static void main(String[] args) {


		var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContext.class);
//		Arrays.stream(context.getBeanDefinitionNames()).forEach((System.out::println));
	}

}
