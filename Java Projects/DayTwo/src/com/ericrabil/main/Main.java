package com.ericrabil.main;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static String read(){
		Scanner scan = new Scanner(System.in);
		while(!scan.hasNext());
		return scan.next();
	}
	
	public static Object convertInt(String str){
		int num =0;
		try{
			num = Integer.parseInt(str);
		}catch(NumberFormatException e){
			return false;
		}
		return num;
	}
	
	public static boolean errorThrown(Object object){
		if(object instanceof Boolean){
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String[] args){
		System.out.println("Hello, how old are you?");
		Scanner scan = new Scanner(System.in);
		int age = 0;
		while(!scan.hasNext()){}
		try{
			age = Integer.parseInt(scan.next());
		}catch(NumberFormatException e){
			System.out.println("Please enter a whole number.");
			System.exit(1);
		}
		System.out.println("You are " + age + " years old!");
		Random rand = new Random();
		System.out.println("Please enter the highest number to guess");
		Object input = convertInt(read());
		if(input instanceof Boolean){
			System.out.println("Invalid arguments passed");
			System.exit(1);
		}
		int max = (int) input;
		while(true){
			int random = rand.nextInt(max);
			System.out.println("Please enter your guess.");
			String in = read();
			if(errorThrown(convertInt(in))){
//				for(Commands cmd : Commands.values()){
//					Someday
//				}
				System.out.println("Invalid number entered.");
				continue;
			}
			int guess = (Integer) convertInt(in);
			if(guess == random){
				System.out.println("Correct!");
			}else{
				
				if((random - guess) < 20){
					System.out.println("Aww, so close! The number was " + random);
				}else{
					System.out.println("Wrong! The number was " + random);
				}
			}
		}
	}
}
