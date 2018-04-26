package Array;

//1) В одномерном массиве, состоящем из n вещественных элементов, вычислить:
//сумму отрицательных элементов массива и произведение элементов массива,
//расположенных между максимальным и минимальным элементами.

public class IndividualTask1 {
	
	public static int isSumOfNegativeElemets(int[] array) {
		int sumOfNegativeElemets = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] < 0) {
				sumOfNegativeElemets += array[i];
			}
		}
		return sumOfNegativeElemets;
	}
	
	public static long defineProductOfElementsBetweenMaximumAndMinimum(int[] array) {
		int minValue = array[0];
		int positionOfMinValue = 0;
		int maxValue = array[0];
		int positionOfMaxValue = 0;
		long productOfElementsBetweenMaximumAndMinimum = 1;
		
		for(int i = 1; i < array.length; i++) {
			if(array[i] >= maxValue) {
				maxValue = array[i];
				positionOfMaxValue = i;
			}
			
			if(array[i] < minValue) {
				minValue = array[i];
				positionOfMinValue = i;
			}
		}
		
		if(positionOfMinValue+1 < positionOfMaxValue) {
		for(int i = positionOfMinValue+1; i < positionOfMaxValue; i++) {
			productOfElementsBetweenMaximumAndMinimum *= array[i];
			}
		}
		else if(positionOfMinValue > positionOfMaxValue+1) {
			for(int i = positionOfMaxValue+1; i < positionOfMinValue; i++) {
				productOfElementsBetweenMaximumAndMinimum *= array[i];
				}
			}
		else if (positionOfMinValue+1==positionOfMaxValue || positionOfMaxValue+1==positionOfMinValue ||positionOfMaxValue == positionOfMinValue)
		{productOfElementsBetweenMaximumAndMinimum = 0;}
		return productOfElementsBetweenMaximumAndMinimum;
	}
}
