package com.example.EmployeeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeeManagement.Models.Employees;

public interface EmployeesRepo extends JpaRepository<Employees, Integer> {

}
