package com.globallogic.springcore;

import java.util.List;
import java.util.Set;

class Employe {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public Set<String> getMobile() {
		return mobile;
	}

	public void setMobile(Set<String> mobile) {
		this.mobile = mobile;
	}

	public void setName(String name) {
		this.name = name;
	}

	int id;
	String name;
	List<String> address;
	Set<String> mobile;

	public Employe(int id, String name, List<String> address, Set<String> mobile) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", address=" + address + ", mobile=" + mobile + "]";
	}

	public Employe(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

}