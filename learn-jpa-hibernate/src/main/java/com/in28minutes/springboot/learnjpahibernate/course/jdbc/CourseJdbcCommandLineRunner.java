package com.in28minutes.springboot.learnjpahibernate.course.jdbc;

import com.in28minutes.springboot.learnjpahibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired //Autowired is used to inject the dependency of CourseJdbcRepository
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        repository.insert(new Course(1, "Spring Boot in 100 Steps", "Ranga Karanam"));
//        repository.insert(new Course(2, "Learn AWS", "Pluhh"));
//        repository.insert(new Course(3, "NodeJS bhi padhle bhai", "dawg"));
//        repository.delete(2);
//        System.out.println(repository.findById(1));
    }
}
