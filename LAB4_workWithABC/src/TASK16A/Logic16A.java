package TASK16A;

//16) –азработайте программу, котора€ провер€ет, что треугольник, заданный сто-
//ронами a, b и c, €вл€етс€ равносторонним.

public class Logic16A {

	public static Boolean isTriangle (double a, double b, double c) {
		if (a == b && a == c && b == c)
			return true;
		else return false;
	}
}
