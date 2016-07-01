package com.dayfour;

public enum Type {
EMPTY(" "), TIC("X"), TAC("O");

private String title;
	
private Type(String x){
	this.title = x;
}

public String getTitle(){
	return this.title;
}
}
