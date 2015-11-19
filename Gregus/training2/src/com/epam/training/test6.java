package com.epam.training;

public class test6 {

	public static void main(String[] args) {
		int[] array = new int [3];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		System.out.println(sumValue(array));
		
		int[] array2 = new int[20];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = (int) (Math.random() * 100);
			//System.out.println(array2[i]);
		}
		
		System.out.println(sumValue(array2));
	}
	
public static int sumValue(int [] arrayToSum) {
	int sum = 0;
	for (int i = 0; i < arrayToSum.length; i++) {
		sum += arrayToSum [i];
	}
	return sum;
}
}
