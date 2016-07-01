package com.webmd.api;

import java.util.ArrayList;

public class Patient {
//Persistent
private String firstname = "John";
private String lastname = "Doe";
private Gender gender = Gender.OTHER;
/*In miliseconds*/
private int admitted = 0;

//Dynamic
private ArrayList<Symptoms> symptoms = new ArrayList<Symptoms>();
private Doctor doctor;
public Patient(){
	this.admitted = (int) System.currentTimeMillis();
}
public Patient(ArrayList<Symptoms> symptoms){
	this.admitted = (int) System.currentTimeMillis();
	this.symptoms = symptoms;
}
public Patient(ArrayList<Symptoms> symptoms, Doctor d){
	this.admitted = (int) System.currentTimeMillis();
	this.symptoms = symptoms;
	this.doctor = d;
}
public Patient(ArrayList<Symptoms> symptoms, Gender gender, Doctor d){
	this.symptoms = symptoms;
	this.admitted = (int) System.currentTimeMillis();
	this.gender = gender;
	this.doctor = d;
}
public Patient(ArrayList<Symptoms> symptoms, Gender gender, String firstname, Doctor d){
	this.symptoms = symptoms;
	this.gender = gender;
	this.admitted = (int) System.currentTimeMillis();
	this.firstname = firstname;
	this.doctor = d;
}
public Patient(ArrayList<Symptoms> symptoms, Gender gender, String firstname, String lastname, Doctor d){
	this.symptoms = symptoms;
	this.gender = gender;
	this.firstname = firstname;
	this.lastname = lastname;
	this.admitted = (int) System.currentTimeMillis();
	this.doctor = d;
}

public ArrayList<Symptoms> getSymptoms(){
	return this.symptoms;
}

public boolean hasSymptom(Symptoms s){
	return this.symptoms.contains(s);
}

public void addSymptom(Symptoms s){
	this.symptoms.add(s);
}

public void removeSymptom(Symptoms s){
	this.symptoms.remove(s);
}

public void setSymptoms(ArrayList<Symptoms> s){
	this.symptoms = s;
}

public Doctor getDoctor(){
	return this.doctor;
}

public void setDoctor(Doctor d){
	if(this.doctor != null){
		this.doctor.removePatient(this);
	}
	this.doctor = d;
	d.addPatient(this);
}

public Gender getGender(){
	return this.gender;
}

public void setGender(Gender g){
	this.gender = g;
}

public String getName(){
	return this.firstname;
}

public String getFullName(){
	return this.firstname + " " + this.lastname;
}

public String getLastName(){
	return this.lastname;
}

public int timeAdmitted(){
	return this.admitted;
}
}
