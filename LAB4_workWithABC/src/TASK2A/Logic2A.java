package TASK2A;

//2) Разработайте программу, которая проверяет, что среди чисел А, В и С есть хотя
//бы одна пара совпадающих чисел (или взаимно противоположных).
public class Logic2A {
	
	public static boolean solve (double a, double b, double c) {
		boolean minTwoIsEqual = true;
		
		if(a==b || b==c ||  a==c || (a==b && b==c && a==c))
			return minTwoIsEqual;
		else return !minTwoIsEqual;
	}

}
