package com.example.EmployeeManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeManagement.IServices.IRuserService;
import com.example.EmployeeManagement.Models.Ruser;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/ruser")
public class RuserController {
	
	@Autowired
	private IRuserService ruserService;

	public RuserController() {
		System.out.println("In Ruser Controller");
	}
	
	@PostMapping("/adduser")
	public Ruser addUser(@RequestBody Ruser ru)
	{
		Ruser res=null;
		try {
			res=ruserService.addRuser(ru);
		} catch (Exception e) {
			System.out.println(e);
		}
		return res;
	}
	
	@PostMapping("/ruserLogin")
	   public ResponseEntity<Ruser>loginR(@RequestBody Ruser ru)
	   {
		Ruser ruser=ruserService.findByIdPassword(ru.getEmail(), ru.getPassword());
		if (ruser != null) {
            return ResponseEntity.ok(ruser);
        } else {
            return ResponseEntity.notFound().build();
        }
	   }
	
	@PostMapping("/forgetPassword")
	public ResponseEntity<Ruser> forgetPasswordDeatils(@RequestBody Ruser ru)
	{
		Ruser ruser = ruserService.getUserPassword(ru.getEmail());
    if (ruser != null) {
        return ResponseEntity.ok(ruser);
    } else {
        return ResponseEntity.notFound().build();
    }
	}
}
