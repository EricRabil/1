package com.daythree.api;

public class BusinessPerson extends Person{
	/* 
	 * Variables
	 * Declared Enumeration and Jobs variable
	 */
	public enum Jobs{
		CASHIER, COP, COUNSELOR, TEACHER, CONSTRUCTION, UNOCCUPIED
	}
	public final String finaltest = "This is a final string!!!";
	private Jobs job;
	/* 
	 * Constructor for Business Person
	 */
	public BusinessPerson(int h, EyeColors e, String n, Jobs j) {
		/*
		 * Constructs parent class
		 */
		super(h, e, n);
		this.job = j;
	}
	
	public void setJob(Jobs j){
		this.job = j;
	}
	
	public Jobs getJob(){
		return this.job;
	}
	
	@Override
	public String toString(){
		return super.toString() + this.job;
	}
	
}