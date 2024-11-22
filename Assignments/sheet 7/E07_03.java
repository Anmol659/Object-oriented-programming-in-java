package com.gsv.lab;


class Book {
 
      private int bookID;
      private String title;
      private String author;
      private double price;

 
  public Book(int bookID, String title, String author, double price) 
  {
     this.bookID = bookID;
     this.title = title;
     this.author = author;
     this.price = price;
 }

 
 public double getPrice() {
     return price;
 }


 public void setPrice(double price) {
     this.price = price;
 }


 public void displayDetails() {
     System.out.println("Book ID: " + bookID);
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("Price: $" + price);
 }
}


class Periodical extends Book {
 
 private String period; 

 
 public Periodical(int bookID, String title, String author, double price, String period) {
     super(bookID, title, author, price); 
     this.period = period;
 }


 public void modifyPrice(double newPrice) {
     setPrice(newPrice); 
     System.out.println("Price updated to: $" + newPrice);
 }

 
 public void modifyPeriod(String newPeriod) {
     this.period = newPeriod;
     System.out.println("Period updated to: " + newPeriod);
 }


 @Override
 public void displayDetails() {
     super.displayDetails(); 
     System.out.println("Period: " + period);
 }
}


public class E07_03 {
 public static void main(String[] args) {
     
     Periodical periodical = new Periodical(101, "Tech Today", "John Smith", 10.99, "Monthly");
     
     System.out.println("Initial Periodical Details:");
     periodical.displayDetails();

     System.out.println();
     
     periodical.modifyPrice(12.99);
     periodical.modifyPeriod("Weekly");

     System.out.println();

     System.out.println("Updated Periodical Details:");
     periodical.displayDetails();
 }
}
