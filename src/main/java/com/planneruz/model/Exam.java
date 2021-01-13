package com.planneruz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


@Entity
public class Exam {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    @ManyToMany(mappedBy = "exams")
    private Set<StudentGroup> studentGroups = new HashSet<>();
    private Timestamp examDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<StudentGroup> getGroups() {
        return studentGroups;
    }

    public void setGroups(Set<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    public Timestamp getExamDate() {
        return examDate;
    }

    public void setExamDate(Timestamp examDate) {
        this.examDate = examDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Exam)) return false;
        Exam exam = (Exam) o;
        return Objects.equals(id, exam.id) && Objects.equals(title, exam.title) && Objects.equals(description, exam.description) && Objects.equals(studentGroups, exam.studentGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, studentGroups);
    }
}
