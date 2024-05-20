package com.example.EmployeeManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeManagement.IServices.IDepartmentService;
import com.example.EmployeeManagement.Models.Department;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	private IDepartmentService deptservice;

	public DepartmentController() {
		System.out.println("DepartmentController");
	}
	@GetMapping("/getallDepts")
	public List<Department> getAllEmps() {
		return deptservice.getAllDept();
	}
	
}
