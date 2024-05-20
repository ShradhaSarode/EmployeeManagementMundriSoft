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
@Table(name="role")
public class Roles {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="roleid")
	private int roleid;
	@Column(name="rolename")
	private String rolename;
	
}
