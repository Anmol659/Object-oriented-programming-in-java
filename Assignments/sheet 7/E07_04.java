package com.gsv.lab;


class Teacher {

 private String name;
 private String subject;
 private int teacherID;


 public Teacher(String name, String subject, int teacherID) {
     this.name = name;
     this.subject = subject;
     this.teacherID = teacherID;
 }


 public void displayDetails() {
     System.out.println("Teacher Name: " + name);
     System.out.println("Subject: " + subject);
     System.out.println("Teacher ID: " + teacherID);
 }
}


class Student extends Teacher {
 
 private int studentID;
 private String grade;


 public Student(String name, String subject, int teacherID, int studentID, String grade) {
     super(name, subject, teacherID); 
     this.studentID = studentID;
     this.grade = grade;
 }

 public void displayStudentDetails() {
     super.displayDetails();
     System.out.println("Student ID: " + studentID);
     System.out.println("Grade: " + grade);
 }
}

public class E07_04 {
	public static void main(String[] args) {
		Student student = new Student("Mr. Sharma", "Mathematics", 101, 2021, "A");
		System.out.println("Student Details:");
		student.displayStudentDetails();
	}

}
