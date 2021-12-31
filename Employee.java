package com.greatlearning.Assignment;

import java.util.Scanner;

public class Employee {
	static String emailID ="";
	static Scanner sc =new Scanner(System.in);
	static String firstname;
	String lastname;
	static String dept ="";
	static String password ="";
	static String pwd ="";
	
	Employee(String firstname,String lastname)
	{
		this.firstname =firstname;
		this.lastname=lastname;
	}
	static String generatePassword()
	{
		System.out.println("Enter password :");
		 password =sc.nextLine();
		 return password;
		
	}
		public static String generateEmailAddress(String firstname,String lastname)
	{
			String email = firstname + lastname +"."+dept+ "@abc.com";
					return email;
	}
	
	static void showCredentials ()
	{
		String pwd =generatePassword();
		System.out.println("Dear" +" "+firstname+" "+"your generated credentials are as follows");
		System.out.println("EMAIL------>"+emailID);
		
		System.out.println("Passsord----->"+pwd);
	}

	public static void main(String[] args) {
		
		System.out.println("Enter 1st name:");
		String fname =sc.nextLine();
		System.out.println("Enter last name:");
		String lname =sc.nextLine();
		Employee employee=new Employee(fname,lname);
		System.out.println("Please enter your department from the following");
		System.out.println("1.Technical \n2.Admin \n3.Human Resource \n4.Legal");
		int c= sc.nextInt();
		String dept ="";
		
		switch(c)
		{
		case 1:dept ="tech";
		pwd=generatePassword();
		emailID = generateEmailAddress(fname,lname);
		showCredentials();
		break;
		case 2:dept ="admin";
		pwd=generatePassword();
		emailID = generateEmailAddress(fname,lname);
		showCredentials();
		break;
		case 3:dept ="hr";
		pwd=generatePassword();
		emailID = generateEmailAddress(fname,lname);
		showCredentials();
		break;
		case 4: dept="legal";
		pwd=generatePassword();
		emailID = generateEmailAddress(fname,lname);
		showCredentials();break;
		default :System.out.println("Enter correct input");
		}
		
		// TODO Auto-generated method stub

	}

}
