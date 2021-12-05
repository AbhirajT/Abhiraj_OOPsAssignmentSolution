package com.greatlearning.Assignment;

class SuperDept
{
	public String departmentName()
	{
			return "Super Department";
		
	}
	
	public String getTodaysWork()
	{
		return "No Work as of now";
		
	}
	
	public String getWorkDeadline()
	{
		System.out.println("Complete by EOD");
		return "Nil ";
		
	}
	public String isTodayAHoliday()
	{
		System.out.println("Today is not a holiday");
		return "Today is not a holiday";
		
	}
}
