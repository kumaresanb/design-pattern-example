package com.evolvus.java.design.prototype.pattern;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
	
	private List<String> empList;
	
	public Employees() {
	    empList=new ArrayList<>();
	}
	
	public Employees(List<String> empList) {
		this.empList=empList;
	}
	
	public void loadData() {
		empList.add("Kumar");
		empList.add("Ravi");
		empList.add("Ram");
		empList.add("Raj");
		empList.add("Kishore");
	}
	
	public List<String> getEmpList(){
		return empList;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> tmpEmp=new ArrayList<>();
		for (String s: this.getEmpList()) {
			tmpEmp.add(s);
		}
		return new Employees(tmpEmp);
	}

}
