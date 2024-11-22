package com.dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student 
{
	String Name;
	int age;
	double marks;
	public Student(String name, int age, double marks) {
		super();
		Name = name;
		this.age = age;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Name=" + Name + ", age=" + age + ", marks=" + marks;
	}
//	@Override
//	public int compareTo(Object o) {
//		Student s=  (Student)o;
//		if(this.age<s.age)
//		{
//			return 1;
//		}
//		else if(this.age>s.age)
//		{
//			return -1;
//		}
//		else
//		{
//			return 0;
//		}
		
//		System.out.println(this.age-s.age);  // short method to compare
//		return(this.age-s.age);
		
//	}
	
}

class SortStudentName implements Comparator
{
     public int compare(Object o1,Object o2)
     {
    	 Student p1=(Student) o1;
    	 Student p2=(Student) o2;
    	 if(p1.Name.compareTo(p2.Name)>0)
    	 {
    		return 1; 
    	 }
    	 else if(p2.Name.compareTo(p2.Name)>0)
    	 {
    		 return -1;
    	 }
    	 else
    	 {
    		 return 0;
    	 }
    	 
     }
}
class SortStudentAge implements Comparator
{
     public int compare(Object o1,Object o2)
     {
    	 Student p1=(Student) o1;
    	 Student p2=(Student) o2;
    	 if(p1.age>p2.age)
    	 {
    		return 1; 
    	 }
    	 else if(p2.age>p1.age)
    	 {
    		 return -1;
    	 }
    	 else
    	 {
    		 return 0;
    	 }
    	 
     }
}

public class ArrayListStudent {

	public static void main(String[] args) {
		
		ArrayList<Student> aids= new ArrayList<Student>();
		aids.add(new Student("Rahul Panwar",24,100));
		aids.add(new Student("Pragya",20,101));
		aids.add(new Student("Ansh",21,110));
		aids.add(new Student("Vikrant",17,10));
		System.out.println("Before sort: "+aids);
//		Collections.sort(aids);
//		System.out.println(aids);
		Collections.sort(aids, new SortStudentName());
		System.out.println("After sort based on name: "+aids);
		Collections.sort(aids, new SortStudentAge());
		System.out.println("After sort based on age: "+aids);
		
	}
}
