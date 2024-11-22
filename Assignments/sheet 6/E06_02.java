package com.gsv.lab;

import java.util.Scanner;

public class E06_02 {

	    public static void main(String[] args) {
	        // Scanner for user input
	        Scanner scanner = new Scanner(System.in);

	       
	        final double TICKET_PRICE = 5.0;
	        final double PERFORMANCE_COST = 20.0;
	        final double COST_PER_ATTENDEE = 0.50;

	        System.out.print("Enter the number of attendees: ");
	        int attendees = scanner.nextInt();

	       
	        double totalIncome = attendees * TICKET_PRICE;
	        double totalCost = PERFORMANCE_COST + (attendees * COST_PER_ATTENDEE);
	        double totalProfit = totalIncome - totalCost;
	        
	        System.out.printf("Total Income: $%.2f%n", totalIncome);
	        System.out.printf("Total Cost: $%.2f%n", totalCost);
	        System.out.printf("Total Profit: $%.2f%n", totalProfit);

	    }
	}


