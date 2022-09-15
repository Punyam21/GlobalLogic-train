package com.micro.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.micro.employee.entity.Emplo;



@Service
public interface EmploService {
	public List<Emplo> showdet();

	public String adddet(Emplo s);

	public List<Emplo> updateEmployees(Emplo emp);

	public List<Emplo> deleteEmployees(int id);
}
