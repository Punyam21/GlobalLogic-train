package com.globallogic.BookStore.entity;

public class MyInfo {
	int roll;
	String name;
	int clases;
	String cat;
	book my;
	user you;
    admin myname;
	/*public MyInfo() {
		super();
		// TODO Auto-generated constructor stub
	}*/

	public MyInfo(int roll, String name, int clases, String cat, book my, user you,admin myname) {
		super();
		this.roll = roll;
		this.name = name;
		this.clases = clases;
		this.cat = cat;
		this.my = my;
		this.you = you;
		this.myname=myname;
	}
	

	public admin getMyname() {
		return myname;
	}


	public void setMyname(admin myname) {
		this.myname = myname;
	}


	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClases() {
		return clases;
	}

	public void setClases(int clases) {
		this.clases = clases;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public book getMy() {
		return my;
	}

	public void setMy(book my) {
		this.my = my;
	}

	public user getYou() {
		return you;
	}

	public void setYou(user you) {
		this.you = you;
	}


	@Override
	public String toString() {
		return "MyInfo [roll=" + roll + ", name=" + name + ", clases=" + clases + ", cat=" + cat + ", my=" + my
				+ ", you=" + you + ", myname=" + myname + "]";
	}

	
}
