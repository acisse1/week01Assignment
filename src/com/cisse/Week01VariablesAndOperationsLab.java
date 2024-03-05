package com.cisse;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int planeSeatAvailable = 100;
		double groceryCost = 5.75;
		char middleInitial = ' ';
		boolean isCold = false;
		String customerFirstName = "John";
		String streetAddress = "34 East 35th Street NY NY 10003";
		
		System.out.println(planeSeatAvailable);
		System.out.println(groceryCost);
		System.out.println(middleInitial);
		System.out.println(isCold);
		System.out.println(customerFirstName);
		System.out.println(streetAddress);
		
		
		planeSeatAvailable = planeSeatAvailable - 2;
		groceryCost = groceryCost + 2.15;
		middleInitial = 'A';
		isCold = true;
		
		String fullName = customerFirstName + " " + middleInitial + " Cain";
		
		System.out.println("Hi my name is " + fullName + " and I live at " + streetAddress);
		

	}

}
