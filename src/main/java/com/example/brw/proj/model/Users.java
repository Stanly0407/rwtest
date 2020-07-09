package com.example.brw.proj.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Users {
    private long userId;
    private String employeeId;
    private String email;
    private String password;
    private String surname;
    private String forename;
    private String patronym;
    private String position;
    private String cellPhone;
    private String officePhone;
    private String homePhone;
    private byte enabled;
    private Departmentsbook departmentsbookByDepartmentId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userID", nullable = false)
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "employeeID", nullable = false, length = 255)
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "surname", nullable = true, length = 255)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "forename", nullable = true, length = 255)
    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    @Basic
    @Column(name = "patronym", nullable = true, length = 255)
    public String getPatronym() {
        return patronym;
    }

    public void setPatronym(String patronym) {
        this.patronym = patronym;
    }

    @Basic
    @Column(name = "position", nullable = true, length = 255)
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Basic
    @Column(name = "cellPhone", nullable = true, length = 255)
    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    @Basic
    @Column(name = "officePhone", nullable = true, length = 255)
    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    @Basic
    @Column(name = "homePhone", nullable = true, length = 255)
    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    @Basic
    @Column(name = "enabled", nullable = false)
    public byte getEnabled() {
        return enabled;
    }

    public void setEnabled(byte enabled) {
        this.enabled = enabled;
    }


    @ManyToOne
    @JoinColumn(name = "departmentID", referencedColumnName = "departmentID")
    public Departmentsbook getDepartmentsbookByDepartmentId() {
        return departmentsbookByDepartmentId;
    }

    public void setDepartmentsbookByDepartmentId(Departmentsbook departmentsbookByDepartmentId) {
        this.departmentsbookByDepartmentId = departmentsbookByDepartmentId;
    }
}
