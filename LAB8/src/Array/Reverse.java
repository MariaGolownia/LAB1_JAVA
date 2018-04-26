package Array;

public class Reverse {
	public static int[] reverse (int[]array) {
		
		// С выделением дополнительной памяти было бы так:
		/*int[]newArray = new int[array.length];
		int j = 0;
		for(int i = array.length - 1; i >= 0; i--) {
				newArray[j]=array[i];
				j++;}
		return newArray;*/
		
		// C менее значитеьным выделением дополнительной памяти:
		
		/*int tempvariable = 0;
		for(int i = 0; i < array.length/2; i++) {
			tempvariable = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = tempvariable;}
		return array;*/
		
		// Без выделения дополнительной памяти:
		for(int i = 0; i < array.length/2; i++) {
			array[i] = array[array.length-1-i] + array[i];
			array[array.length-1-i] = array[i] - array[array.length-1-i];
			array[i] = array[i] - array[array.length-1-i];
		}
		return array;
}
}
