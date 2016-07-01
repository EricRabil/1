package com.google.main;

import java.util.ArrayList;
import javafx.stage.Window;
import java.util.List;

public class Main {
	public static void main(String[] args){
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);ints.add(3);ints.add(5);ints.add(7);ints.add(9);
		ints.set(1, 515151451);
		ints.remove(3);
		System.out.println(ints);
		Window dataView = new Window();
		Scene login = new Scene();
	}
}
/*
 * Window > Scene > Hbox/Vbox > JButton/ActionListeners/TextField/etc.
 * tertiary statements: (condition) ? true : false; (condition) ? ((condition) ? true true : true false) : false false
 * Collection a, a implements comparable, a.sort();
 * 
 * 
 */