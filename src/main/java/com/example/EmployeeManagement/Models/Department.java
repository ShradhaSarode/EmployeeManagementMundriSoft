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
@Table(name="department")
public class Department {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="deptid")
	private int deptid;
	private String deptname;
}
