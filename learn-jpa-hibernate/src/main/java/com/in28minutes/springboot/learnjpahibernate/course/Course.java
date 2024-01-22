package com.in28minutes.springboot.learnjpahibernate.course;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;
//@Entity (name="course") // this annotation is used to tell spring that this class is an entity, and it is used to talk to the database
//@Entity // here we can omit the name attribute because the name of the entity is the same as the name of the class
public class Course {
    @Id // this annotation is used to tell spring that this field is the primary key
    private long id;
    @Column(name="name") //  this means that we are mapping the name field in the database to the name field in the Course class
    private String name;

    @Column(name="author") // writing this annotation is optional, because the name of the field in the database is the same as the name of the field in the Course class
    private String author;
    // constructor // getters and setters // toString
    public Course() {}

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }

    public void setId(long id) { // we need to have a setter for the id because we are using the BeanPropertyRowMapper
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
