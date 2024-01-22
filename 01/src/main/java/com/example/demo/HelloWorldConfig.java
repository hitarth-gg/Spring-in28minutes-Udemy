package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age) {
}

record Address(String city, String state) {
}

@Configuration
public class HelloWorldConfig {

    @Bean
    public String name() {
        return "Ranga";
    }

    @Bean
    public int age() {
        return 20;
    }

    @Bean
    public Person person() {
        var person = new Person("Ravi", 20);
        return person;
    }

    @Bean
    public Person personMethodCalls() {
        var person = new Person(name(), age());
        return person;
    }

    @Bean(name = "name2")
    public String name2() {
        return "not Ranga lmao";
    }

    @Bean
    public Person personParameters(String name2, int age) {
        var person = new Person(name2, age);
        return person;
    }

    @Bean
    @Primary
    @Qualifier("addressHai")
    public Address address3() {
        return new Address("CityPrimary", "StatePrimary");
    }

}
