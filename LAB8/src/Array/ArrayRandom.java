package Array;

import java.util.Random;

public class ArrayRandom {
	
	public static  int[] initializeArray1To10 (int lengthOfArray) {
		int [] oneDimensionalArray = new int[lengthOfArray];
		Random random = new Random();
		for(int i = 0; i < oneDimensionalArray.length; i++) {
			oneDimensionalArray[i] = 1 + random.nextInt(10);}
		return oneDimensionalArray;
	}
	
	public static  int[] initializeArrayMinus100To100 (int lengthOfArray) {
		int [] oneDimensionalArray = new int[lengthOfArray];
		Random random = new Random();
		for(int i = 0; i < oneDimensionalArray.length; i++) {
			oneDimensionalArray[i] = -100 + random.nextInt(201);}
		return oneDimensionalArray;
	}
	
	public static  int[] initializeArray0To5 (int lengthOfArray) {
		int [] oneDimensionalArray = new int[lengthOfArray];
		Random random = new Random();
		for(int i = 0; i < oneDimensionalArray.length; i++) {
			oneDimensionalArray[i] = random.nextInt(6);}
		return oneDimensionalArray;
	}
}
