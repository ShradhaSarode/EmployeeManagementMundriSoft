package com.example.EmployeeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeeManagement.Models.Roles;

public interface RolesRepo extends JpaRepository<Roles, Integer> {

}
