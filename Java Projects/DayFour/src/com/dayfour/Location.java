package com.dayfour;

public enum Location {
C1_R1("11"), C2_R1("21"), C3_R1("31"), C1_R2("12"), C2_R2("22"), C3_R2("32"), C1_R3("13"), C2_R3("23"), C3_R3("33");

private String l;
private Location(String loc){
	this.l = loc;
}

public String getInput(){
	return this.l;
}

}
