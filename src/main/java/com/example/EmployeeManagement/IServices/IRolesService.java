package com.example.EmployeeManagement.IServices;

import java.util.List;

import com.example.EmployeeManagement.Models.Roles;

public interface IRolesService {
	List<Roles>getAllRoles();
	Roles saveRoles(Roles u);
	Roles updateRoles(Roles e);
	void deleteRoles(int id);
}
