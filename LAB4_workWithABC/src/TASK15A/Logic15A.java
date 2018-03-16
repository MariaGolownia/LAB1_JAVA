package TASK15A;

//15) Разработайте программу, которая проверяет, что числа a, b и c действительно
//являются сторонами треугольника.

//Решение: Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.


public class Logic15A {

	public static Boolean isTriangle (double a, double b, double c) {
		if ((a+b)>c && (a+c)>b && (b+c)>a)
			return true;
		else return false;
	}
}
