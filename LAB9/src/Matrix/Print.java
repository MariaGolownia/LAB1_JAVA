package Matrix;

import java.util.LinkedList;

public class Print {

	public static void printString(String msg) {
		System.out.print(msg);
	}
	
	public static void printInt(int number) {
		System.out.print(number);
	}
	
	public static void printLong(long number) {
		System.out.print(number);
	}
	public static void printDouble(Double number) {
		System.out.print(number);
	}
	
	public static void printBoolean(Boolean bln) {
		System.out.print(bln);
	}
	
	public static void print1DArray(int[]array) {
		for(int i = 0; i<array.length; i++) {
		System.out.print(array[i] + " ");}
	}
	
	public static void printLinkedList (LinkedList<Integer> list) {
		for(int i = 0; i<list.size(); i++) {
		System.out.print(list.get(i) + " ");}
	}
	
	
	public static void print2DArray(int[][]array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if(array[i][j] < 0) {
					System.out.print("  " + array[i][j]);}
						else {
				System.out.print("   "+ array[i][j]);}
			}
			System.out.print("\n");}
	}
}

