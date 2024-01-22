package com.in28minutes.springboot.learnjpahibernate.course.jpa;

import com.in28minutes.springboot.learnjpahibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository // as we are talking to the database, we need to annotate this class with @Repository
@Transactional // if you want to execute queries, you need to annotate this class with @Transactional
public class CourseJpaRepository {
    // when you want to talk to the database, you need to use the EntityManager
    // we created an entity and we need to manage it using the EntityManager
//    @Autowired
    @PersistenceContext // this annotation is used to inject the EntityManager dependency however we can use @Autowired as well
    private EntityManager entityManager; // we need to inject the EntityManager dependency

//    @Autowired
    public void insert (Course course) { // this method is used to insert a course into the database
        entityManager.merge(course); // merge is used to insert a course into the database
    }

    public Course findById(int id) {
        return entityManager.find(Course.class, id); // find is used to find a course in the database
    }

    public void deleteById(int id) {
        Course find = entityManager.find(Course.class, id);
        entityManager.remove(find); // remove is used to delete a course from the database
    }
}
