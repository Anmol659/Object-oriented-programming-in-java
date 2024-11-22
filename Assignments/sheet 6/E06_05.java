package com.gsv.lab;

import java.util.Scanner;

class Bank {
 public double deposit(double amount, double balance) {
     if (amount <= 0) {
         System.out.println("Deposit amount must be positive.");
         return balance;
     }
     balance += amount;
     System.out.println("Deposited: " + amount);
     return balance;
 }

 
 public double withdraw(double amount, double balance) {
     if (amount > balance) {
         System.out.println("Insufficient balance. Withdrawal failed.");
         return balance;
     } else if (amount <= 0) {
         System.out.println("Withdrawal amount must be positive.");
         return balance;
     }
     balance -= amount;
     System.out.println("Withdrawn: " + amount);
     return balance;
 }
}

public class E06_05 {

	public static void main(String[] args) {
	     Bank bank = new Bank();
	     double balance;
	     double amount;
	     double withdraw;
	     
	     Scanner sc= new Scanner(System.in);
	     System.out.println("Input your balance: ");
	     balance=sc.nextDouble();
	     
	     System.out.println("What do you want to do: Deposit or Withdraw? 1 for deposit, 2 for withdraw: ");
	     int a=sc.nextInt();
	     
	     if(a==1)
	     {
	     System.out.println("Input your amount to deposit");
	     amount= sc.nextDouble();
	     System.out.println("Initial Balance: " + balance);
	     balance = bank.deposit(amount, balance);
	     System.out.println("Final balance: "+ balance);
	     }
	     else
	     {
	    	 System.out.println("Input your withdraw amount: ");
	    	 withdraw= sc.nextDouble();
	    	 balance = bank.withdraw(withdraw, balance);
	    	 System.out.println("Final Balance: " + balance);
	     }
	     
	     sc.close();


}
}
