package com.example.EmployeeManagement.IServices;

import com.example.EmployeeManagement.Models.Ruser;

public interface IRuserService {
	Ruser addRuser(Ruser ru);
	Ruser findByIdPassword(String email,String password);
	Ruser getUserPassword(String email);
}
