package com.gsv.lab;

abstract class Car
{
	String carname;
	
	void displaycarName()
	{
		System.out.println("Car is "+carname);
	}
	
	abstract void avg();
	abstract void mode();
}

class Maruti extends Car
{
	Maruti()
	{
		carname="Maruti";
	}
	void avg()
	{
		System.out.println("Maruti avg: 20km/l");
	}
	void mode()
	{
		System.out.println("Maruti mode: Automatic");
	}
}
 class Santro extends Car
 {
	 Santro()
		{
			carname="Santro";
		}
		void avg()
		{
			System.out.println("Santro avg: 22km/l");
		}
		void mode()
		{
			System.out.println("Santro mode: Manual");
		}
 }

public class E06_04 {

	public static void main(String[] args) {
		
		Car maruti= new Maruti();
		maruti.displaycarName();
		maruti.avg();
		maruti.mode();
		
		Car santro= new Santro();
	    santro.displaycarName();
	    santro.avg();
	    santro.mode();
	}
}
