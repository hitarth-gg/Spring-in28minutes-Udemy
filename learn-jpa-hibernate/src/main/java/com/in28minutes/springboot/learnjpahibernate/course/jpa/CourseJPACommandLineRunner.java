package com.in28minutes.springboot.learnjpahibernate.course.jpa;

import com.in28minutes.springboot.learnjpahibernate.course.Course;
import com.in28minutes.springboot.learnjpahibernate.course.jdbc.CourseJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJPACommandLineRunner implements CommandLineRunner {

    @Autowired //Autowired is used to inject the dependency of CourseJdbcRepository
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Spring padhle", "Ranga Karanam"));
        repository.insert(new Course(2, "Node bhi 😔", "Pluhh"));
        repository.insert(new Course(3, "DSA karle", "dawg"));
        repository.deleteById(2);
        System.out.println(repository.findById(1));
    }
}
