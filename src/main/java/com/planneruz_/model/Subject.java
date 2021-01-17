package com.planneruz_.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Objects;

@Entity
public class Subject {

    @Id
    private Long id;
    private String name;
    private String subjectType;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "subject")
    private ClassDetails classDetails;

    public ClassDetails getClassDetails() {
        return classDetails;
    }

    public void setClassDetails(ClassDetails classDetails) {
        this.classDetails = classDetails;
    }

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

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subject)) return false;
        Subject subject = (Subject) o;
        return Objects.equals(id, subject.id) && Objects.equals(name, subject.name) && Objects.equals(subjectType, subject.subjectType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, subjectType);
    }
}
