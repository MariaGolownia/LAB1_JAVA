package TASK1A;

//1) Разработайте программу, которая проверяет, что числа А, В и С различны (оди-
//наковы).

public class Logic1A {
	
	public static boolean solve (double a, double b, double c) {
		boolean isDifferent = true;
		
		if(a==b && b==c && a==c)
			return !isDifferent;
		else return isDifferent;
	}

}
