package com.webmd.api;

import java.awt.List;
import java.util.ArrayList;

public class Doctor {
	//Persistent values
	private String firstname;
	private String lastname;
	private Gender gender;
	private ArrayList<Qualifications> qualifications = new ArrayList<Qualifications>();
	private boolean onDuty = false;
	
	//Dynamic
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	private int totalPatients; 
	
	public Doctor(String fn, String ln, Gender gender){
		this.firstname = fn;
		this.lastname = ln;
		this.gender = gender;
	}
	public Doctor(String fn, String ln, Gender gender, ArrayList<Qualifications> quals){
		this.firstname = fn;
		this.lastname = ln;
		this.qualifications = quals;
		this.gender = gender;
	}
	
	public String getFirstName(){
		return this.firstname;
	}
	
	public String getLastName(){
		return this.lastname;
	}
	
	public void addPatient(Patient p){
		if(!this.patients.contains(p)){
		this.patients.add(p);
		this.totalPatients++;
		}
	}
	
	public void removePatient(Patient p){
		if(this.patients.contains(p)){
		this.patients.remove(p);
		this.totalPatients--;
		}
	}
	
	public boolean hasPatient(Patient p){
		return this.patients.contains(p);
	}
	
	public int totalPatients(){
		return this.totalPatients;
	}
	
	
	
	public String getOfficialName(){
		return "Dr. " + this.lastname;
	}
	
	public ArrayList<Qualifications> getQualifications(){
		return this.qualifications;
	}
	
	public Gender getGender(){
		return this.gender;
	}
	
	public void setGender(Gender g){
		this.gender = g;
	}
	
	public void addQualification(Qualifications q){
		this.qualifications.add(q);
	}
	
	public boolean onDuty(){
		return this.onDuty;
	}
	
	public void setDuty(boolean bool){
		this.onDuty = bool;
	}
	
	public boolean hasQualification(Qualifications q){
		return this.qualifications.contains(q);
	}
	
	public void removeQualification(Qualifications q){
		this.qualifications.remove(q);
	}
	
}