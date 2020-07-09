package com.example.brw.proj.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@NoArgsConstructor
@Entity
public class Departmentsbook {
    private long departmentId;
    private long parentDepartmentId;
    private String department;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "departmentID", nullable = false)
    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    @Basic
    @Column(name = "parentDepartmentID", nullable = false)
    public long getParentDepartmentId() {
        return parentDepartmentId;
    }

    public void setParentDepartmentId(long parentDepartmentId) {
        this.parentDepartmentId = parentDepartmentId;
    }

    @Basic
    @Column(name = "department", nullable = true, length = 255)
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


}
