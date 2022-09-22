package com.globallogic.BookStore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.BookStore.entity.MyInfo;
import com.globallogic.BookStore.entity.Signup;
import com.globallogic.BookStore.entity.admin;
import com.globallogic.BookStore.entity.book;
import com.globallogic.BookStore.entity.user;
import com.globallogic.BookStore.service.adminser;
import com.globallogic.BookStore.service.signinser;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	adminser service;
	@Autowired
	signinser serv;

	@GetMapping("/phone")
	public List<admin> phonedet(long phone) {
		return service.showdetbyphone(phone);
	}

	@GetMapping("/{id}/{pass}/{email}")
	public String signupcheck(@PathVariable("id") long id, @PathVariable("pass") String pass,
			@PathVariable("email") String email) {
		return service.sucessSignin(id, email, pass);
	}

	@GetMapping("/")
	public List<admin> details() {
		return service.showdet();
	}

	@GetMapping("/myinfo")
	public ResponseEntity<MyInfo> mydetails() {
		MyInfo m = new MyInfo(1812210086, "Punyam", 12, "General", new book(12, "yz", "sdha", 45934),
				new user(21, "as", 7659327, "Basti", new ArrayList<book>() {
					/**
					* 
					*/
					private static final long serialVersionUID = 1L;

					{
						add(new book(12, "xyz", "sdhana", 4596534));
						add(new book(1232, "xyf4dsz", "sdhadsdneta", 534));
						add(new book(123, "exyz", "sdhasdfna", 96534));
					}
				}), new admin(77, "fshh", 70074, new ArrayList<book>() {
					/**
					* 
					*/
					private static final long serialVersionUID = 1L;

					{
						add(new book(128, "xyz", "etret", 6534));
						add(new book(12352, "xyf4dsjgkjz", "sta", 53407));
						add(new book(12366, "e5jhxyz", "sddfna", 94));
					}
				}, new Signup("punyam24@gmail.com", 85959, "Hello")));
		return new ResponseEntity<MyInfo>(m, HttpStatus.OK);
	}

	@PostMapping("/")
	public String adddetails(@RequestBody admin s) {
		return service.admi(s);
	}

	@PutMapping("/")
	public String updatedetails(@RequestBody admin s) {
		System.out.println(s);
		return service.update(s);
	}

	@DeleteMapping("/{id}")

	public String deletedetails(@PathVariable("id") long id) {
		return service.delete(id);
	}

}