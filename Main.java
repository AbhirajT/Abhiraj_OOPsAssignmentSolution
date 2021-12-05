package com.greatlearning.Assignment;

public class Main {

	public static void main(String[] args) {
	 
		TechDept techDept =new TechDept();
		HrDept hrDept =new HrDept();
		AdminDept adminDept =new AdminDept();
		
		adminDept.departmentName();
		adminDept.getTodaysWork();
		adminDept.getWorkDeadline();
		adminDept.isTodayAHoliday();
		
		hrDept.departmentName();
		hrDept.doActivity();
		hrDept.getTodaysWork();
		hrDept.getWorkDeadline();
		hrDept.isTodayAHoliday();
		
		techDept.departmentName();
		techDept.getTodaysWork();
		techDept.getWorkDeadline();
		techDept.getTechStackInformation();
		techDept.isTodayAHoliday();
		
		

	}

}
