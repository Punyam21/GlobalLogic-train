package com.micro.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Emplo")
public class Emplo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@Column
	String name;
	@Column
	String addres;
	@Column
	double Sal;
	@Column
	String category;

	public Emplo(int id, String name, String addres, double sal, String category) {
		super();
		this.id = id;
		this.name = name;
		this.addres = addres;
		Sal = sal;
		this.category = category;
	}

	public Emplo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emplo [id=" + id + ", name=" + name + ", addres=" + addres + ", Sal=" + Sal + ", category=" + category
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public double getSal() {
		return Sal;
	}

	public void setSal(double sal) {
		Sal = sal;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
