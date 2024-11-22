package com.dsa;

import java.util.HashSet;
import java.util.Objects;

class Employee
{
	String ename;
	int salary;
	public Employee(String ename, int salary) {
		super();
		this.ename = ename;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		String strename= ename;
		String strsalary= String.valueOf(salary);
		
		int hash=0;
		int hashename= strename.hashCode();
		int hashsalary= strsalary.hashCode();
		hash= hash+hashename+hashsalary;
		return hash;
		
	}
	@Override
	public boolean equals(Object obj) {
		Employee e1= (Employee)obj;
		if (e1.ename == this.ename && e1.salary==this.salary)
			return true;
		else
		{
			return false;
		}
		
	}
	
	
}

public class hashCodeStudent {

	public static void main(String[] args) {
		
		HashSet emp=new HashSet();
		emp.add(new Employee("Rahul", 150000));
		emp.add(new Employee("Pragya", 250000));
		emp.add(new Employee("Rahul", 150000));
		emp.add(new Employee("Ellie", 40000));
		System.out.println(emp);
		
	}
}
