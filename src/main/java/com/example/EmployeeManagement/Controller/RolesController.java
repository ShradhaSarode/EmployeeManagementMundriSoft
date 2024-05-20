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

import com.example.EmployeeManagement.IServices.IRolesService;
import com.example.EmployeeManagement.Models.Roles;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/roles")
public class RolesController {
	@Autowired
	private IRolesService rolesService;
	
	public RolesController() {
		System.out.println("in role controller");
	}

	@GetMapping("/getallRoles")
	public List<Roles> getAllRoles() {
		
		return rolesService.getAllRoles();
	}
	
	@PostMapping("/saveRoles")
	public Roles saveRoles(@RequestBody Roles e){
		Roles res=null;
	
		try
		{
		res=rolesService.saveRoles(e);
		}
		
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return res;
		
	}
	@PutMapping("/updateRoles")
	public Roles updateRoles(@RequestBody Roles e) {
		Roles res=null;
		try
		{
			res=rolesService.updateRoles(e);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return res;
	}
	
	@DeleteMapping("/deleteRole/{id}")
	public void deleteRoles(@PathVariable int id) {
		try
		{
			rolesService.deleteRoles(id);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}

