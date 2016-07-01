package com.webmd;

import java.util.ArrayList;
import java.util.HashMap;

import com.webmd.api.Doctor;
import com.webmd.api.Medications;
import com.webmd.api.Medicine;
import com.webmd.api.Patient;

public class WebMD {
	private HashMap<Integer, Patient> patientList = new HashMap<Integer, Patient>();
	private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	private HashMap<Medications, Medicine> medicine = new HashMap<Medications, Medicine>();
	public WebMD(){
		for(Medications m : Medications.values()){
			Medicine medicine = new Medicine(m);
			this.medicine.put(m, medicine);
		}
		System.out.println("WebMD has been initialized!");
	}
	
	public void addMedication(Medications m){
		
	}
	
	public Doctor assignDoctor(Patient p){
		if(p.getDoctor() != null){
			return p.getDoctor();
		}
		Doctor returnDoc = null;
		for(Doctor d : doctors){
			if(d.totalPatients() > 10) continue;
			p.setDoctor(d);
			d.addPatient(p);
			returnDoc = d;
			break;
		}
		if(returnDoc == null){
			for(Doctor d : doctors){
				if(d.onDuty()){
					p.setDoctor(d);
					d.addPatient(p);
					returnDoc = d;
				}
			}
		}
		return returnDoc;
	}
	
}
