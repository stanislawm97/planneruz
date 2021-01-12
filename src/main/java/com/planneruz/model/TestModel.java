package com.planneruz.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class TestModel {
    @Id
    private Long id;
    private String name;

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

    @Override
    public String toString() {
        return "TestModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TestModel)) return false;
        TestModel testModel = (TestModel) o;
        return Objects.equals(id, testModel.id) && Objects.equals(name, testModel.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
