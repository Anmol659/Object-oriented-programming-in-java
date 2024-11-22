package com.gsv.lab;

import java.util.Scanner;

class WashingMachine
{
	boolean switchOn(int On)
	{
		if(On==1)
		{
			return true;			
		}
		else
		{
			return false;
		}
	}
	boolean switchOff(int Off)
	{
		if(Off==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean acceptDetergent(int det)
	{
		if(det==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	void acceptClothes(int clothes, int det, int On, int Off)
	{
		if(acceptDetergent(det)==true && switchOn(On)==true && switchOff(Off)==true)
		{
		System.out.println("Washed "+ clothes + " clothes with detergent and swithched off the machine.");
		}
		else if(acceptDetergent(det)==false && switchOn(On)==true && switchOff(Off)==true)
		{
			System.out.println("Washed"+clothes+" clothes without detergent and switched off the machine.");
		}
		else if(acceptDetergent(det)==false && switchOn(On)==true && switchOff(Off)==false)
		{
			System.out.println("Washed"+clothes+" clothes without detergent but the machine is still on.");
		}
		else if(acceptDetergent(det)==true && switchOn(On)==true && switchOff(Off)==false)
		{
			System.out.println("Washed "+ clothes + " clothes with detergent but the machine is still on");
		}
		else
		{
			System.out.println("The machine is switched off");
		}
	}
		
	
}

public class E06_03 {

	public static void main(String[] args) {
		int det;
		int On,Off;
		int clothes;
		
		WashingMachine wm= new WashingMachine();
		Scanner sc= new Scanner(System.in);
		System.out.println("Input the no. of clothes: ");
		clothes=sc.nextInt();
		System.out.println("Do you want to add detergent? 1 for yes 0 for no: ");
		det=sc.nextInt();
		System.out.println("Do you want to switch on th machine? 1 for yes 0 for no: ");
		On=sc.nextInt();
		System.out.println("Do you wnat to switch it off after use? 1 for yes 0 for no: ");
		Off=sc.nextInt();
		wm.acceptClothes(clothes, det, On, Off);
		
	}
}
