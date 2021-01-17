package com.planneruz_.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class StudentGroup {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String subgroup;
    @ManyToMany
    @JoinTable(
            joinColumns = {@JoinColumn(name = "group_id")},
            inverseJoinColumns = {@JoinColumn(name = "exam_id")}
    )
    private Set<Exam> exams = new HashSet<>();
    @ManyToMany
    @JoinTable(
            joinColumns = {@JoinColumn(name = "group_id")},
            inverseJoinColumns = {@JoinColumn(name = "class_id")}
    )
    private Set<ClassDetails> classDetails = new HashSet<>();
    @ManyToOne
    @JoinColumn(name = "field_id")
    private FieldOfStudy fieldOfStudy;

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

    public String getSubgroup() {
        return subgroup;
    }

    public void setSubgroup(String subgroup) {
        this.subgroup = subgroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentGroup)) return false;
        StudentGroup studentGroup = (StudentGroup) o;
        return Objects.equals(id, studentGroup.id) && Objects.equals(name, studentGroup.name) && Objects.equals(subgroup, studentGroup.subgroup) && Objects.equals(exams, studentGroup.exams) && Objects.equals(classDetails, studentGroup.classDetails) && Objects.equals(fieldOfStudy, studentGroup.fieldOfStudy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, subgroup, exams, classDetails, fieldOfStudy);
    }
}
