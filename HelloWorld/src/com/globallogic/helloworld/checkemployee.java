package com.globallogic.helloworld;

public class checkemployee {

	
	String employeename;
	int employeesalary;
	int employeeid;
	
	public void setinfo(String empname,int empsal,int empid)
	{
		employeename=empname;
		employeesalary=empsal;
		employeeid=empid;
	}
	
	public void work()
	{
		System.out.println(employeename);
	}
	
	public static void main(String[] args) {
		checkemployee emp=new checkemployee();
		emp.setinfo("Agam",4555454,4454);
		emp.work();
	}
}