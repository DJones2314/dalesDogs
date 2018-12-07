package com.qa.dave.jones.doggocompo;

import java.util.ArrayList;
import java.util.List;

public class dogCompetition {

	List<String> competition = new ArrayList<String>();

	public void createTheList(int rangeOfNumbers, int dalesDog) {

		for (int i = 1; i <= rangeOfNumbers ; i++) {

			String lastBit = "th";
			
			if (i%10 == 1 && i%100 != 11) {
				lastBit = "st";
			}

			else if (i%10 == 2 && i%100 != 12) {
				lastBit = "nd";
			}

			else if (i%10 == 3 && i%100 != 13) {
				lastBit = "rd";
			}
			
			competition.add(i + lastBit);
			
		}

		competition.remove(dalesDog - 1);
		
		System.out.println(competition);
		
	}
	
}
