package DayOne;

import java.util.Scanner;

public class DayOne {
	public static void main(String[] args){
		int base = 0;
		int countto = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input the number to count to.");
		while(!scan.hasNext()){
			
		}
		try{
			countto = Integer.parseInt(scan.next());
		}catch(NumberFormatException e){
			System.out.println("You gave an invalid integer. Application aborted.");
			System.exit(0);
		}
		String firstname = "Eric";
		String lastname = "Rabil";
		while(base != countto){
			base++;
			boolean multipleoffive = false;
			boolean multipleofthree = false;
			if(base % 5 == 0){
				multipleoffive = true;
			}
			if(base % 3 == 0){
				multipleofthree = true;
			}
			if(multipleoffive && multipleofthree) System.out.println(base + " " + firstname + " " + lastname);
			else if(multipleoffive) System.out.println(base + " " + lastname);
			else if(multipleofthree) System.out.println(base + " " + firstname);
			else System.out.println(base);
		}
		scan.close();
	}
}
