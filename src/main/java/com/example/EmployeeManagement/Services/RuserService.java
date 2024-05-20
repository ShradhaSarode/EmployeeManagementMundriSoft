package com.example.EmployeeManagement.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeManagement.IServices.IRuserService;
import com.example.EmployeeManagement.Models.Ruser;
import com.example.EmployeeManagement.Repository.RuserRepo;

@Service
public class RuserService implements IRuserService {

	@Autowired
	private RuserRepo ruserRepo;
	public Ruser addRuser(Ruser ru) {
        ru.setRid(2);
        return ruserRepo.save(ru);
    }

    @Override
    public Ruser findByIdPassword(String email, String password) {
        return ruserRepo.findByEmailAndPassword(email, password);
//        if (ruser != null )
//        {
//          return ruser;
//        }else
//        {
//          return null;
//        }
    }

	@Override
	public Ruser getUserPassword(String email) {
		return ruserRepo.findByEmail(email);
	}

}
