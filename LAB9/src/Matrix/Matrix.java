package Matrix;

import java.awt.List;
import java.util.LinkedList;
import java.util.Random;

public class Matrix {
	
	static Random random = new Random();
	
	public static int[][] createMatrix (int numberOfLines, int numberOfColumns) {
		
		int[][]arrayOfNumbers = new int[numberOfLines][numberOfColumns];
		int i = 0, j = 0;
		for(i = 0; i < numberOfLines; i++) {
			for (j = 0; j < numberOfColumns; j++) {
				arrayOfNumbers[i][j] = -9 + random.nextInt(19);
			}
		}
		return arrayOfNumbers;
	}
	
	
	public static String defineColumnAllElementsEven (int[][] array, int numberMaxRow, int numberMaxColumn) {
		Boolean flag = true;
		String str = "";
		for(int j = 0; j < numberMaxColumn; j++) {
			for(int i = 0; i < numberMaxRow; i++) {
				if(array[i][j] % 2 != 0) {
				flag = false;}
				}
			if (flag == true) {
				str += String.valueOf(j + 1) + " ";}
			flag = true;
			}
		if(str.length() < 1) {
			str = "There are no columns in your matrix where all elements are even!\n";
		}
		return str;
	}
	
	
	public static LinkedList<Integer> defineColumnWithNegativeElementOnMainDiagonal(int[][] array) {
		LinkedList<Integer> list = new LinkedList<>();
		for (int j = 0; j < array.length; j++) {
			if (array[j][j] < 0) {
				list.add(j + 1);
			}
		}
		return list;

	}
	
	public static int defineSumElementOfColumn(int numberColumn, int[][] array) {
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) { 
			for (int j = 0; j < array[i].length; j++) {
				if(j==numberColumn-1) {
				sum += array[i][j];}
			}
		}
		return sum;

	}

}
