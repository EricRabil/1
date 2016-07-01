package com.ericrabil.main;

public enum Commands {
EXIT("!exit"), HELP("!help"), DEBUG("!debug");
String command;
String message;
String[] others = new String[10];
private Commands(String name){
	this.command = name;
}

public String getCmd(){
	return this.command;
}
}
