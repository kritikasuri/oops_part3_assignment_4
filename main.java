package com.acadgild.assignment.overriding;

public class main {
	
	public static void main(String[] args) {
		
		SBI sbi = new SBI();
		ICICI icici = new ICICI();
		AXIS axis = new AXIS();
		
		System.out.println("The rate of interest at SBI is "+sbi.getRateOfInterest());
		System.out.println("The rate of interest at ICICI is "+icici.getRateOfInterest());
		System.out.println("The rate of interest at AXIS is "+axis.getRateOfInterest());	
	}
}
