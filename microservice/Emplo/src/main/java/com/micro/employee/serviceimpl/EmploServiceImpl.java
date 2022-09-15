package com.micro.employee.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.employee.entity.Emplo;
import com.micro.employee.repository.EmploRepo;
import com.micro.employee.service.EmploService;

@Service
public class EmploServiceImpl implements EmploService{
@Autowired
EmploRepo erp;
	@Override
	public List<Emplo> showdet() {
		
		return erp.findAll();
	}

	@Override
	public String adddet(Emplo s) {
		erp.save(s);
		return "Data Addedd ";
	}

	@Override
	public List<Emplo> updateEmployees(Emplo emp) {
		erp.save(emp);
		return erp.findAll();
	}

	@Override
	
	public List<Emplo> deleteEmployees(int id) {
		erp.deleteById(id);
		return erp.findAll();
	}

}
