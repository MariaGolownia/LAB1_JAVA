package Array;

public class View {

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
	
	public static void printArray(int[]array) {
		for(int i = 0; i<array.length; i++) {
		System.out.print(array[i] + " ");}
	}

}
