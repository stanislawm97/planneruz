package com.planneruz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class FieldOfStudy {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany(mappedBy = "fieldOfStudy")
    private Set<StudentGroup> studentGroups = new HashSet<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<StudentGroup> getGroups() {
        return studentGroups;
    }

    public void setGroups(Set<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FieldOfStudy)) return false;
        FieldOfStudy that = (FieldOfStudy) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(studentGroups, that.studentGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, studentGroups);
    }

}
