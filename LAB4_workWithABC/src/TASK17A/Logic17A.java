package TASK17A;

//17) –азработайте программу, котора€ провер€ет, что треугольник, заданный сто-
//ронами a, b и c, €вл€етс€ равнобедренным.

public class Logic17A {

	public static Boolean isTriangle (double a, double b, double c) {
		if (((a+b)>c && (a+c)>b && (b+c)>a) && (a == b || a == c || b == c))
			return true;
		else return false;
	}
}
