package com.epam.training;

import java.util.ArrayList;

public class teszt7 {

	public static void main(String[] args) {
		ArrayList<Integer> arraList = new ArrayList<>();
		arraList.add(5);
		arraList.add(3);
		arraList.add(42);
		
		System.err.println(sumValue(arraList));

	}
	@Deprecated
	public static int sumValue(ArrayList<Integer> arraListToSum) {
		int sum = 0;
		for (int i = 0; i < arraListToSum.size(); i++) {
			sum += arraListToSum.get(i);
			
		}
	
		return sum;
	}

}
