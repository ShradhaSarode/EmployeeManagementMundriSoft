package com.example.EmployeeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeeManagement.Models.Ruser;

public interface RuserRepo extends JpaRepository<Ruser, Integer> {
	 Ruser findByEmailAndPassword(String email, String password);
	 Ruser findByEmail(String email);
}
