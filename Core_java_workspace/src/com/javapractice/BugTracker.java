package com.javapractice;

public class BugTracker {

	int bugId;
	String applicationName;
	String bugTitle;
	String severity;
	int priority;
	String status;
	int assignedDeveloper;

	int getbugId() {
		return bugId;
	}

	String getapplicationName() {
		return applicationName;
	}

	String getbugTitle() {
		return bugTitle;
	}

	String getseverity() {
		return severity;
	}

	int getpriority() {
		return priority;
	}

	String getstatus() {
		return status;
	}

	int getassignedDeveloper() {
		return assignedDeveloper;
	}
	
	void assignedToDevloper(int bugId,String developerName){
		System.out.println(bugId+" "+developerName);
		status="In Devlopment";
	}
	
	public static void main(String[] args) {

		BugTracker bg1 = new BugTracker();
		bg1.bugId = 1011;
		bg1.applicationName = "Employee portal";
		bg1.bugTitle = "Crashing on checking employee details";
		bg1.severity = "medium";
		bg1.priority = 1;
		bg1.status = "open";
		bg1.assignedDeveloper = 0x1002;

		System.out.println("BugId : " + bg1.getbugId());
		System.out.println("Application Name : " + bg1.getapplicationName());
		System.out.println("Bug Title : " + bg1.getbugTitle());
		System.out.println("Severity : " + bg1.getseverity());
		System.out.println("Priority : " + bg1.getpriority());
		System.out.println("Status : " + bg1.getstatus());
		System.out.println("Assigned Developer :" + bg1.getassignedDeveloper());
		
		bg1.assignedToDevloper(1012, "Vick");
	}

}
