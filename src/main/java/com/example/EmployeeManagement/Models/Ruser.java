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
@Table(name="users")
public class Ruser {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="userid")
	private int uid;
	@Column(name="emailid")
	private String email;
	@Column(name="pwd")
	private String password;
	@Column(name="roleid")
	private int rid;
}
