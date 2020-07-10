package com.example.brw.proj.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userID")
    private long userId;
    @Column(name = "employeeID")
    private String employeeId;
    private String email;
    private String password;
    private String surname;
    private String forename;
    private String patronym;
    private String position;
    @Column(name = "`cellPhone`")
    private String cellPhone;
    @Column(name = "officePhone")
    private String officePhone;
    @Column(name = "homePhone")
    private String homePhone;
    private boolean enabled;
    @ManyToOne
    @JoinColumn(name = "departmentID")
    private Departmentsbook departmentsbookByDepartmentId;

}
