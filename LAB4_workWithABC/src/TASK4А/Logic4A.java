package TASK4А;

//4) Разработайте программу, которая проверяет, что среди чисел А, В и С есть хотя
//бы одно положительное (отрицательное).

public class Logic4A {
	public static boolean solve (double a, double b, double c) {
		boolean minOneIsPositive = true;
		
		if(a > 0 || b > 0 || c > 0)
			return minOneIsPositive ;
		else return !minOneIsPositive ;
	}
}