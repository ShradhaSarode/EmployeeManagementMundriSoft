package com.example.EmployeeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeeManagement.Models.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer>{

}
