package com.micro.department.department.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micro.department.department.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Integer> {

	 List<Department> findByName(String name);
	
}
