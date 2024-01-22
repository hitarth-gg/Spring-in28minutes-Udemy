package com.example.demo.examples.lazyInitialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {
	public ClassA() {
		System.out.println("ClassA me ghus gaye dawg uwu");
	}
}

@Component
@Lazy
class ClassB {
	ClassA classA;
	public ClassB(ClassA classA) {
		System.out.println("SomeThing");
		this.classA = classA;
	}

	public void doSomething() {
		System.out.println("Did sumn");
	}
}

@Configuration
@ComponentScan // performs a component scan on the current package
public class LazyInitialization {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(LazyInitialization.class);
		var retard = context.getBean(ClassB.class);
		retard.doSomething();
	}

}
