package Array;
//Задан одномерный массива размера N. Необходимо выполнить следующие
//действия:
// найти экстремальные значения (минимальный и максимальный элементы)
//данного одномерного массива;
// найти среднеарифметическое и среднегеометрическое значения всех эле-
//ментов массива;

public class Search {

	public static int findMaximumElement(int[] array) {
		int maxElement = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxElement) {
				maxElement = array[i];}
		}
			return maxElement;
	}

	public static String findPositionsOfMaximumElement(int[] array, int maxElement) {
		String maxPositionStr = "";
		for (int i = 0; i < array.length; i++) {
			if (array[i] == maxElement) {
				maxPositionStr += Integer.toString(i+1) + ", ";}
		}
		return maxPositionStr.substring(0, maxPositionStr.length()-2);
	}
	
	
	public static int findMinimumElement(int[] array) {
		int minElement = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minElement) {
				minElement = array[i];}
		}
			return minElement;
	}
	
	
	public static String findPositionsOfMinimumElement(int[] array, int minElement) {
		String minPositionStr = "";
		for (int i = 0; i < array.length; i++) {
			if (array[i] == minElement) {
				minPositionStr += Integer.toString(i+1) + ", ";}
		}
		return minPositionStr.substring(0, minPositionStr.length()-2);
	}
	
	public static double calculateArithmeticMean(int[] array) {
		
		int arithmeticMean = 0;
		for (int i = 0; i < array.length; i++) {
			arithmeticMean += array[i];
		}
		return (double)arithmeticMean/array.length;
	}
	
	public static double calculateGeometricMean(int[] array) {
		double geometricMean = 1;
		for (int i = 0; i < array.length; i++) {
			geometricMean *= array[i];
		}
		return Math.round(Math.pow(geometricMean, 1/(double)array.length)*100.00)/100.00;
	}
	
//	найти позицию первого встретившегося локального минимума (макси-
//			мума), а если таких элементов нет, то возвратить -1 (локальный минимум –
//			это элемент, который меньше любого из своих соседей; локальный макси-
//			мум – это элемент, который больше любого из своих соседей);
	
	public static int findFirstLocalMinimum(int[] array) {
		int positionLocalMinimum = 0;
		Boolean flagIfFind = false;

		if (array[0] < array[1]) {
			positionLocalMinimum = 0;
			flagIfFind = true;
		} else {
			for (int i = 1; i < array.length; i++) {
				if (array[i + 1] > array[i] && array[i] < array[i - 1]) {
					positionLocalMinimum = i;
					flagIfFind = true;
					break;}
			}
		}
		if (flagIfFind == false) {
			if (array[array.length - 1] < array[array.length - 2]) {
				positionLocalMinimum = array.length - 1;
			} else {
				positionLocalMinimum = -1;}
		}
		return positionLocalMinimum;
	}
}
