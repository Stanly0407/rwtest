package com.example.brw.proj.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Departmentsbook {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "departmentID")
	private long departmentId;
	@Column(name = "parentDepartmentID", nullable = false)
	private long parentDepartmentId;
	@Column(name = "department")
	private String department;
}
