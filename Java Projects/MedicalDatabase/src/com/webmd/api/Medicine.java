package com.webmd.api;

import java.util.ArrayList;

public class Medicine {
	private Medications type;
	private int amount;
	private ArrayList<SideEffects> sideeffects;
	
	public Medicine(Medications type){
		this.type = type;
		this.amount = 0;
		this.sideeffects = new ArrayList<SideEffects>();
	}
	public Medicine(Medications type, int amount){
		this.type = type;
		this.amount = amount;
		this.sideeffects = new ArrayList<SideEffects>();
	}
	public Medicine(Medications type, int amount, ArrayList<SideEffects> effects){
		this.type = type;
		this.amount = amount;
		this.sideeffects = effects;
	}
	
	public void setAmount(int amount){
		this.amount = amount;
	}
	public void addAmount(int add){
		this.amount += add;
	}
	public void removeAmount(int remove){
		this.amount -= remove;
	}
	public void addSideEffect(SideEffects effect){
		this.sideeffects.add(effect);
	}
	public void removeSideEffect(SideEffects effect){
		this.sideeffects.remove(effect);
	}
	public boolean hasSideEffect(SideEffects effect){
		return this.sideeffects.contains(effect);
	}
	public int getAmount(){
		return this.amount;
	}
	public ArrayList<SideEffects> getSideEffects(){
		return this.sideeffects;
	}
	public void setSideEffects(ArrayList<SideEffects> effects){
		this.sideeffects = effects;
	}
	public Medications getType(){
		return this.type;
	}
}
