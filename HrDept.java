package com.greatlearning.Assignment;

class HrDept extends SuperDept
{
	public String departmentName()
	{
		System.out.println("Welcome to HR Department");
			return "Hr Department ";
		
	}
	
	public String getTodaysWork()
	{
		System.out.println("Fill today�s timesheet and mark your attendance");
		return "Fill today�s timesheet and mark your attendance ";
		
	}
	
	public String getWorkDeadline()
	{
		System.out.println("Complete by EOD");
		return "Complete by EOD ";
		
	}
	
	public String doActivity()
	{
		System.out.println("Team Lunch");
		return "team Lunch";
		
	}
	
}

