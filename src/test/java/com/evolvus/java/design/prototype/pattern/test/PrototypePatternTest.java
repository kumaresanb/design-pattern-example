package com.evolvus.java.design.prototype.pattern.test;

import java.util.List;

import com.evolvus.java.design.prototype.pattern.Employees;

public class PrototypePatternTest {

	public static void main(String[] args) throws CloneNotSupportedException {
			Employees empes=new Employees();
			empes.loadData();
			
			//Use the clone method to get the Employee object
			Employees empesNew= (Employees)  empes.clone();
			Employees empesNew1=(Employees) empes.clone();
		    List<String> list=empesNew.getEmpList();
		    list.add("Subbu");
		    List<String> list1=empesNew1.getEmpList();
		    list1.add("Keshav");
		    
		    System.out.println("Employess List: "+empes.getEmpList());
		    System.out.println("Employess new List: "+list);
		    System.out.println("Employess new List1: "+list1);
		    
		    
					
	}

}
