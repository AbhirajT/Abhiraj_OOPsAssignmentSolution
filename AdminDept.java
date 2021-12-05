package com.greatlearning.Assignment;

class AdminDept extends SuperDept
{
	public String departmentName()
	{
		System.out.println("Welcome to Admin Department");
			return "Admin Department";
		
	}
	
	public String getTodaysWork()
	{
		System.out.println("Complete your documents Submission");
		return "Complete your documents Submission";
		
	}
	
	public String getWorkDeadline()
	{
		System.out.println("Complete by EOD");
		return "Complete by EOD ";
		
	}
	
}

