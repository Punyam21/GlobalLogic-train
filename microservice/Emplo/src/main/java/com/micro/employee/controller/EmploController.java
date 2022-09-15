package com.micro.employee.controller;

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

import com.micro.employee.entity.Emplo;
import com.micro.employee.service.EmploService;


@RestController
@RequestMapping("/emplo")
public class EmploController {
	@Autowired
	EmploService eps;

	@GetMapping("/")
	public List<Emplo> showdetails() {
		return eps.showdet();
	}

	@PostMapping("/")
	public String adddet(@RequestBody Emplo s) {
		return eps.adddet(s);
	}

	@PutMapping("/")
	public List<Emplo> updateEmployees(@RequestBody Emplo emp) {

		return eps.updateEmployees(emp);
	}

	@DeleteMapping("/{id}")
	public List<Emplo> deleteEmployees(@PathVariable("id") int id) {
		return eps.deleteEmployees(id);
	}
}
