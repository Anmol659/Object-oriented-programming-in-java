package com.gsv.lab;

//Course class definition
class Course {
 // Data members
 private int ID;
 private String description;
 private int duration; // Duration in hours
 private double fees;

 // Parameterized constructor
 public Course(int ID, String description, int duration, double fees) {
     this.ID = ID;
     this.description = description;
     this.duration = duration;
     this.fees = fees;
 }

 // Method to display course data
 public void getData() {
     System.out.println("Course ID: " + ID);
     System.out.println("Description: " + description);
     System.out.println("Duration: " + duration + " hours");
     System.out.println("Fees: $" + fees);
 }
}

//Main class to test the Course class
public class E07_06 {
 public static void main(String[] args) {
     // Array of 5 Course objects
     Course[] courses = new Course[5];

     // Initializing the array with Course objects
     courses[0] = new Course(101, "Java Programming", 40, 500.0);
     courses[1] = new Course(102, "Python Programming", 50, 600.0);
     courses[2] = new Course(103, "Web Development", 60, 700.0);
     courses[3] = new Course(104, "Data Science", 80, 1000.0);
     courses[4] = new Course(105, "Artificial Intelligence", 100, 1200.0);

     // Displaying data for all courses
     System.out.println("Course Details:");
     for (Course course : courses) {
         course.getData();
         System.out.println();
     }
 }
}
