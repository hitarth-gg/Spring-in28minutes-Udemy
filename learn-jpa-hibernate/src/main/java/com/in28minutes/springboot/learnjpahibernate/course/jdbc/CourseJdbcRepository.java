package com.in28minutes.springboot.learnjpahibernate.course.jdbc;

import com.in28minutes.springboot.learnjpahibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

// this class will be used for talking to the database
@Repository // this annotation is used to tell spring that this class is a repository, and it is used to talk to the database
public class CourseJdbcRepository {
    // to fire queries using the spring JDBC : we need to create an object of JdbcTemplate
    @Autowired // this annotation is used to inject the dependency of JdbcTemplate
    private JdbcTemplate springJdbcTemplate; // this is the object that we will use to fire queries

    private static String INSERT_QUERY =
            """
                    insert into course (id, name, author)
                    values(?, ?, ?);
            """;

    private static String TO_DELETE =
            """
                    delete from course where id=?;
                    """;
    private static String SELECT_QUERY =
            """
                    select * from course where id=?;
                    """;
    public void insert(Course course) {
        // the 3 values should be in the same order as the question marks in the query
        springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor()); // to run this query everytime the application starts up, we'll have to make use of CommandLineRunner
    }
    public void delete(int id)
    {
        springJdbcTemplate.update(TO_DELETE, id);
    }
    public Course findById(int id)
    {
        //queryForObject is used to get a single row from the database
        //ResultSet-> Bean => Row Mapper : Row Mapper is used to map the result set to a bean
        return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
    }
}
