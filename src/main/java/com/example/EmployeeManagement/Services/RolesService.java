package com.example.EmployeeManagement.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeManagement.IServices.IRolesService;
import com.example.EmployeeManagement.Models.Roles;
import com.example.EmployeeManagement.Repository.RolesRepo;

import jakarta.transaction.Transactional;

@Service
public class RolesService implements IRolesService {
	@Autowired
	private RolesRepo rolesRepo;

	@Override
	public List<Roles> getAllRoles() {
		List<Roles> userlist = rolesRepo.findAll();
		return userlist;
	}

	@Override
	public Roles saveRoles(Roles u) {
		Roles res = rolesRepo.save(u);
		return res;
	}

	@SuppressWarnings("deprecation")
	@Transactional
	public Roles updateRoles(Roles r) {
		Roles p1 = new Roles();
		p1 = (Roles) rolesRepo.getOne(r.getRoleid());

		if (p1 != null) {
			p1.setRolename(r.getRolename());
			p1 = rolesRepo.save(p1);
		}
		return p1;
	}

	@Override
	public void deleteRoles(int id) {
		rolesRepo.deleteById(id);
	}

}
