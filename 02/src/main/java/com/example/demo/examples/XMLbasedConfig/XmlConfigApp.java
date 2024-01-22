package com.example.demo.examples.XMLbasedConfig;

import com.example.demo.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

// XML file is located in src/main/resources
public class XmlConfigApp {

	public static void main(String[] args) {
		var context = new ClassPathXmlApplicationContext("contextConfiguration.xml");
		Arrays.stream(context.getBeanDefinitionNames()).forEach((System.out::println));
		System.out.println(context.getBean("age"));
		context.getBean(GameRunner.class).run();
	}
}
