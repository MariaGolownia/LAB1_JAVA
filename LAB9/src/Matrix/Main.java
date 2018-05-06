package Matrix;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numberOfRows = 0;
		int numberOfColumns = 0;
		
		Scanner scanner = new Scanner (System.in);
		
		Print.printString("Enter the desired number of rows in the 2D array: ");
		numberOfRows = scanner.nextInt();
		Print.printString("Enter the desired number of columns in the 2D array: ");
		numberOfColumns = scanner.nextInt();
		Print.printString("Your matrix is: \n");
		int[][] arrayOfNumbers = Matrix.createMatrix(numberOfRows, numberOfColumns);
		Print.print2DArray(arrayOfNumbers);
		
//		1) Выведите номера столбцов, все элементы, которых четны. Для каждого
//		столбца с отрицательным элементом на главной диагонали вывести его но-
//		мер и сумму всех элементов этого столбца.
		
		String strOfColumnsWithEvenElements = Matrix.defineColumnAllElementsEven(arrayOfNumbers, numberOfRows, numberOfColumns);
		Print.printString("The number of columns where all elements are even: ");
		Print.printString(strOfColumnsWithEvenElements);
		
		Print.printString("\nThe number of columns with negative element on main diagonal: ");
		LinkedList<Integer> list = Matrix.defineColumnWithNegativeElementOnMainDiagonal(arrayOfNumbers);
		Print.printLinkedList(list);
		Print.printString("\nThe sum of elements of column with negative element on main diagonal: ");
		
		for(int i = 0; i < list.size(); i++) {
			Print.printInt(Matrix.defineSumElementOfColumn(list.get(i), arrayOfNumbers));
			Print.printString(" ");
		}
		
//		2) Среди строк заданной матрицы, содержащих только нечетные элементы,
//		найти строку с максимальной суммой модулей элементов.
		
		
		
	}
}
