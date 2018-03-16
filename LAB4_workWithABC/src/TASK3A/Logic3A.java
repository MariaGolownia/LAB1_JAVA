package TASK3A;

//3) Разработайте программу, которая проверяет, что числа А, В и С являются по-
//ложительными (отрицательными).

public class Logic3A {
	
	public static boolean solve (double a, double b, double c) {
		boolean isPositive = true;
		
		if(a > 0 && b > 0 && c > 0)
			return isPositive;
		else return !isPositive;
	}

}
