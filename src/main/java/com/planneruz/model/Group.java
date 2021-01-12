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
    private Set<NotUser> users = new HashSet<>();
    @OneToMany(mappedBy = "groups")
    @JoinColumn
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
        if (!(o instanceof Group)) return false;
        Group group = (Group) o;
        return Objects.equals(id, group.id) && Objects.equals(name, group.name) && Objects.equals(subgroup, group.subgroup) && Objects.equals(users, group.users) && Objects.equals(exams, group.exams) && Objects.equals(classDetails, group.classDetails) && Objects.equals(fieldOfStudy, group.fieldOfStudy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, subgroup, users, exams, classDetails, fieldOfStudy);
    }
}
