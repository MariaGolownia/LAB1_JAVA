package Array;


import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
		int lengthOfArray = 20;
		int maxValue = 0;
		int minValue = 0;
		
		int[]array = ArrayRandom.initializeArray1To10(lengthOfArray);
		View.printArray(array);
		
		maxValue = Search.findMaximumElement(array);
		View.printString("\n\nThe maximum value of array elements: ");
		View.printInt(maxValue);
		
		View.printString("\nThe positions of the maximum of array elements: ");
		View.printString(Search.findPositionsOfMaximumElement(array, maxValue));
		
		minValue = Search.findMinimumElement(array);
		View.printString("\n\nThe minimum value of array elements: ");
		View.printInt(minValue);
		
		View.printString("\nThe positions of the minimum of array elements: ");
		View.printString(Search.findPositionsOfMinimumElement(array, minValue));
		
		View.printString("\n\nThe arithmetic average of the values of the array elements: ");
		View.printDouble(Search.calculateArithmeticMean(array));
		
		View.printString("\n\nThe geometric average of the values of the array elements: ");
		View.printDouble(Search.calculateGeometricMean(array));
	
		View.printString("\n\nAre the elements of the array sorted? Answer: ");
		View.printBoolean(Sort.isSorted(array));
		
		View.printString("\n\nAre the elements of the array sorted  in ascending order? Answer: ");
		View.printBoolean(Sort.isSortedInAscendingOrder(array));
		
		View.printString("\n\nAre the elements of the array sorted  in descending order? Answer: ");
		View.printBoolean(Sort.isSortedInDescendingOrder(array));
		
		View.printString("\n\nThe first local minimum: ");
		View.printInt(Search.findFirstLocalMinimum(array));
		
		View.printString("\n\nThe original array: ");
		View.printArray(array);
		View.printString("\nThe reversed array: ");
		View.printArray(Reverse.reverse(array));
		
		int[]arrayForIndividualTasks1 = ArrayRandom.initializeArrayMinus100To100(lengthOfArray);
		View.printString(FrameForText.textInFrame("Individual tasks"));
		View.printString("\nArray for task 1: ");
		View.printArray(arrayForIndividualTasks1);
		
		View.printString("\nThe sum of negative elements in the array: ");
		View.printInt(IndividualTask1.isSumOfNegativeElemets(arrayForIndividualTasks1));
		View.printString("\nProduct of elements between maximum and minimum: ");
		View.printLong(IndividualTask1.defineProductOfElementsBetweenMaximumAndMinimum(arrayForIndividualTasks1));
		
		int[]arrayForIndividualTasks2 = ArrayRandom.initializeArray0To5(lengthOfArray);
		View.printString("\n\nArray for task 2: ");
		View.printArray(arrayForIndividualTasks2);
		View.printString("\nProduct of even elements of the array: ");
		View.printLong(IndividualTask2.defineProductOfEvenElements(arrayForIndividualTasks2));
		View.printString("\nSum of elements between first and last 0: ");
		View.printLong(IndividualTask2.defineSumOfElementsBetweenFirstAndLast0(arrayForIndividualTasks2));
	}

}
