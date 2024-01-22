package com.example.demo.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component // spring will create a bean of this class automatically
class YourBusinessClass {


    Dependency1 dependency1;

    Dependency1 dependency2;

//    @Autowired // it is not necessary to annotate the constructor with @Autowired
//    public YourBusinessClass(Dependency1 dependency1, Dependency1 dependency2) {
//        System.out.println("constructor injection");
//        this.dependency1 = dependency1;
//        this.dependency2 = dependency2;
//    }

    @Autowired
    public void setDependency1(Dependency1 dependency1) {
        System.out.println("setter injection 1");
        this.dependency1 = dependency1;
    }

    @Autowired
    public void setDependency2(Dependency1 dependency2) {
        System.out.println("setter injection 2");
        this.dependency2 = dependency2;
    }

    @Override
    public String toString() {
        return "YourBusinessClass{" +
                "dependency1=" + dependency1 +
                ", dependency2=" + dependency2 +
                '}';
    }
}

@Component
class Dependency1 {
}

@Component
class Dependency2 {
}

@Configuration
@ComponentScan // performs a component scan on the current package
public class DependencyInjectionLauncherApplication {

    public static void main(String[] args) {


        var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach((System.out::println));

        System.out.println(context.getBean(YourBusinessClass.class));
    }

}
