package com.in28minutes.springboot.learnjpahibernate.course.springDataJpa;

import com.in28minutes.springboot.learnjpahibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Integer> {
    // naming convention : findBy<property name>
    List<Course> findByAuthor(String author); // this method will return a list of courses with the given author name
}
