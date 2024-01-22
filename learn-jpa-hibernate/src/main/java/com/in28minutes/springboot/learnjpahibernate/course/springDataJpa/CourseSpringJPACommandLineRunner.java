package com.in28minutes.springboot.learnjpahibernate.course.springDataJpa;

import com.in28minutes.springboot.learnjpahibernate.course.Course;
import com.in28minutes.springboot.learnjpahibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseSpringJPACommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        repository.insert(new Course(1, "Spring padhle", "Ranga Karanam"));
        // instead of .insert we'll now use .save
        repository.save(new Course(1, "Random ahh course", "Ranga Karanam"));
        repository.save(new Course(2, "Node bhi 😔", "Pluhh"));
        repository.save(new Course(3, "DSA karle", "dawg"));
        repository.deleteById(2);
        System.out.println(repository.findById(1));

        // the following methods are provided by the SpringJPA, there are other pre defined methods as well
        System.out.println(repository.findAll());
        System.out.println(repository.count());

        // we can also define our own custom methods in the course CourseSpringDataJpaRepository interface
        System.out.println(repository.findByAuthor("Ranga Karanam"));
        System.out.println(repository.findByAuthor(""));
    }
}
