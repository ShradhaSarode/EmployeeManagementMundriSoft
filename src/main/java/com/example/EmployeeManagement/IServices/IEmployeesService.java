package com.example.EmployeeManagement.IServices;

import java.util.List;
import com.example.EmployeeManagement.Models.Employees;

public interface IEmployeesService {
	List<Employees>getAllEmps();
	Employees saveEmps(Employees e);
	Employees updateEmps(Employees e);
	void deleteEmps(int id);
}
