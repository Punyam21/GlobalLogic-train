package com.micro.department.department.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.micro.department.department.entity.Department;


@Service
public interface DepartmentService {

	public String Create(Department obj);

	public String Update(Department obj);

	public List<Department> Display();

	public String Delete(int id);

	public List<Department> findByName(String name);

}
