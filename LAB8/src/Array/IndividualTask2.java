package Array;

//2) В одномерном массиве, состоящем из n целых элементов, вычислить: произ-
//ведение элементов массива с четными номерами и сумму элементов массива,
//расположенных между первым и последним нулевыми элементами.

public class IndividualTask2 {

	public static long defineProductOfEvenElements(int[] array) {
		long productOfEvenElements = 1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0 && array[i] != 0) {
				productOfEvenElements *= array[i];
			}
		}
		return productOfEvenElements;
	}

	public static long defineSumOfElementsBetweenFirstAndLast0(int[] array) {
		int firstNull = 0;
		int lastNull = 0;
		long sumOfElementsBetweenFirstAndLast0 = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				firstNull = i;
				break;}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				lastNull = i;}
		}
		if (firstNull == lastNull) {
			sumOfElementsBetweenFirstAndLast0 = 0;
		} else {
			for (int i = firstNull + 1; i < lastNull; i++) {
				sumOfElementsBetweenFirstAndLast0 += array[i];}
		}
		return sumOfElementsBetweenFirstAndLast0;
	}

}

