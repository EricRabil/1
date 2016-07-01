package com.daythree;

import com.daythree.api.BusinessPerson;
import com.daythree.api.BusinessPerson.Jobs;
import com.daythree.api.Person;
import com.daythree.api.Person.EyeColors;

public class Run {
	public static void main(String[] args){
		Person n = new Person(35, EyeColors.GREEN, "Grant Pedersen");
		Person o = new Person(61, EyeColors.BLUE, "Kanye West");
		Person p = new Person(64, EyeColors.BROWN, "Eric Rabil");
		System.out.println(n.getName() + "\n" + o.getName() + "\n" + p.getName());
		BusinessPerson bp = new BusinessPerson(31, EyeColors.GREEN, "Shundee", Jobs.COUNSELOR);
		System.out.println(bp.toString());
	}
}
