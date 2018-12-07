package com.qa.dave.jones.doggocompo;

import java.util.Scanner;

public class Main {
	
	public static int rangeOfNumbers;
	public static int dalesDog;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		rangeOfNumbers = s.nextInt();
		dalesDog = s.nextInt();
		
		dogCompetition doggy = new dogCompetition();
		
		doggy.createTheList(rangeOfNumbers, dalesDog);
		
		s.close();
		
	}

}
