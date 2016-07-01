package com.daythree.api;

public class Person {
	private int height;
	public enum EyeColors{
		BROWN, BLUE, GREEN
	}
	private EyeColors eyeColor;
	private String name;
	
	public Person(int h, EyeColors e, String n){
		this.height = h;
		this.eyeColor = e;
		this.name = n;	
	}
	
	public EyeColors getEyeColor(){
		return this.eyeColor;
		
	}
	
	public int getHeight(){
		return this.height;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setEyeColor(EyeColors c){
		this.eyeColor = c;
	}
	
	public void setHeight(int h){
		this.height = h;
	}
	
	public void setName(String n){
		this.name = n;
	}
	
	public String toString(){
		return this.name + " " + this.height + " " + this.eyeColor + " ";
	}
}