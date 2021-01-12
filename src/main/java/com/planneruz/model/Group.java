package com.planneruz.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Group {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String subgroup;
    @OneToMany(mappedBy = "group")
    @JoinColumn
    private Set<User> users = new HashSet<>();
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

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<Exam> getExams() {
        return exams;
    }

    public void setExams(Set<Exam> exams) {
        this.exams = exams;
    }

    public Set<ClassDetails> getClassDetails() {
        return classDetails;
    }

    public void setClassDetails(Set<ClassDetails> classDetails) {
        this.classDetails = classDetails;
    }

    public FieldOfStudy getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(FieldOfStudy fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
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

    public String getSubgroup() {
        return subgroup;
    }

    public void setSubgroup(String subgroup) {
        this.subgroup = subgroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
        Group group = (Group) o;
        return Objects.equals(id, group.id) && Objects.equals(name, group.name) && Objects.equals(subgroup, group.subgroup) && Objects.equals(users, group.users) && Objects.equals(exams, group.exams) && Objects.equals(classDetails, group.classDetails) && Objects.equals(fieldOfStudy, group.fieldOfStudy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, subgroup, users, exams, classDetails, fieldOfStudy);
    }
}
