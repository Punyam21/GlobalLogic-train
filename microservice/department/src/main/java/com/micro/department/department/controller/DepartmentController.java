package com.micro.department.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.department.department.entity.Department;
import com.micro.department.department.service.DepartmentService;

@RestController
@RequestMapping("/Department")

public class DepartmentController {
	@Autowired
	DepartmentService depart;
    @PostMapping("/Create")
	public String Create(@RequestBody Department obj) {
		return (depart.Create(obj));
	}
    @PutMapping("/Update")
	public String Update(@RequestBody Department obj) {
		return (depart.Update(obj));
	}
    @GetMapping("/Display")
	public List<Department> Display() {
		return depart.Display();
	}
   @DeleteMapping("/Delete/{id}")
	public String Delete(@PathVariable int id) {
		return depart.Delete(id);
	}
   @GetMapping("/NAME/{name}")
	public List<Department> findByName(@PathVariable String name) {
		return depart.findByName(name);
	}
}
