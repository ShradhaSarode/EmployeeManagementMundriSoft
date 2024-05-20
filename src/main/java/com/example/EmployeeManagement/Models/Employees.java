package com.example.EmployeeManagement.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="employee")
public class Employees {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="empid")
	private int empid;
	private String name;
	private int deptid;
	private int salary;
}
