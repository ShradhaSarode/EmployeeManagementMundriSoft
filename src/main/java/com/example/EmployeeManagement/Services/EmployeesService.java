package com.example.EmployeeManagement.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeManagement.IServices.IEmployeesService;
import com.example.EmployeeManagement.Models.Employees;
import com.example.EmployeeManagement.Repository.EmployeesRepo;

import jakarta.transaction.Transactional;

@Service
public class EmployeesService implements IEmployeesService{
	@Autowired
	private EmployeesRepo empsRepo;
	
	
	public List<Employees> getAllEmps(){
		
		List<Employees> productlist=empsRepo.findAll();
			return productlist;
	}
	
	public Employees saveEmps(Employees p) {
		
		Employees res=empsRepo.save(p);
		return res;
	}
	
	@SuppressWarnings("deprecation")
	@Transactional
public Employees updateEmps(Employees e) {
		Employees emp=new Employees();
		emp=(Employees)empsRepo.getOne(e.getEmpid());
		
				if(emp!=null) {
					emp.setName(e.getName());
					emp.setDeptid(e.getDeptid());
					emp.setSalary(e.getSalary());
					emp=empsRepo.save(emp);
				}
		return emp;
	}
public void deleteEmps(int id) {
		
	empsRepo.deleteById(id);
		
	}
}

