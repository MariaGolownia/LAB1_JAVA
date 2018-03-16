package TASK18A;

//18) Разработайте программу, которая проверяет, что треугольник, заданный сто-
//ронами a, b и c, является прямоугольным.

public class Logic18A {

	public static Boolean isRectangular (double a, double b, double c) {
		if ( ((a+b)>c && (a+c)>b && (b+c)>a) && ((Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) || (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) || (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) ))
			return true;
		else return false;
	}
}
