package com.example.EmployeeManagement.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeManagement.IServices.IDepartmentService;
import com.example.EmployeeManagement.Models.Department;
import com.example.EmployeeManagement.Repository.DepartmentRepo;

@Service
public class DepartmentService implements IDepartmentService{
	@Autowired
	private DepartmentRepo deptRepo;

	@Override
	public List<Department> getAllDept() {
		List<Department> deptlist=deptRepo.findAll();
		return deptlist;
	}
}
