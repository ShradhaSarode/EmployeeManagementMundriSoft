package com.example.EmployeeManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeManagement.IServices.IEmployeesService;
import com.example.EmployeeManagement.Models.Employees;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/employees")
public class EmployeesController {
	@Autowired
	private IEmployeesService empsService;
	
	public EmployeesController() {
		System.out.println("in Employee controller");
	}

	@GetMapping("/getallEmps")
	public List<Employees> getAllEmps() {
		
		return empsService.getAllEmps();
	}
	
	@PostMapping("/saveEmps")
	public Employees saveEmp(@RequestBody Employees e){
		Employees res=null;
	
		try
		{
		res=empsService.saveEmps(e);
		}
		
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return res;
		
	}
	@PutMapping("/updateEmps")
	public Employees updateEmps(@RequestBody Employees e) {
		Employees res=null;
		try
		{
			res=empsService.updateEmps(e);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return res;
	}
	
	@DeleteMapping("/deleteEmps/{id}")
	public void deleteEmps(@PathVariable int id) {
		try
		{
			empsService.deleteEmps(id);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}

