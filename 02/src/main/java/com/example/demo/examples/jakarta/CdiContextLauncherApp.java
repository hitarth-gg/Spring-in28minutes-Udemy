package com.example.demo.examples.jakarta;

import com.example.demo.businessAssignment.components.DataService;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jdk.jfr.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
@Named
class BusinessService {
	private DataService2 dataService;

//	@Autowired
	@Inject
	public void setDataService(DataService2 dataService) {
		System.out.println("Setter called");
		this.dataService = dataService;
	}

	public DataService2 getDataService() {
		System.out.println("Setter injection");
		return dataService;
	}

}

//@Component
@Named
class DataService2 {

}

@Configuration
@ComponentScan // performs a component scan on the current package
public class CdiContextLauncherApp {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(CdiContextLauncherApp.class);
		Arrays.stream(context.getBeanDefinitionNames()).forEach((System.out::println));
		System.out.println(context.getBean(BusinessService.class).getDataService());
	}

}
