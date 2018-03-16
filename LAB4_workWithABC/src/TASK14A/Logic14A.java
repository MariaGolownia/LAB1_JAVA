package TASK14A;

//14) –азработайте программу, котора€ провер€ет, что точка с координатами (x, y)
//лежит в первой (или во второй, или в третьей, или в четвЄртой) координатной
//четверти.

public class Logic14A {
	
	public static boolean isI (int a, int b) {
		boolean isICoordinateQuarter = false;
	if (a > 0 && b > 0)
	return isICoordinateQuarter = true;
		else return isICoordinateQuarter;
	}
	
	public static boolean isII (int a, int b) {
		boolean isICoordinateQuarter = false;
	if (a < 0 && b > 0)
	return isICoordinateQuarter = true;
		else return isICoordinateQuarter;
	}
	
	public static boolean isIII (int a, int b) {
		boolean isICoordinateQuarter = false;
	if (a < 0 && b < 0)
	return isICoordinateQuarter = true;
		else return isICoordinateQuarter;
	}
	
	public static boolean isIV (int a, int b) {
		boolean isICoordinateQuarter = false;
	if (a > 0 && b < 0)
	return isICoordinateQuarter = true;
		else return isICoordinateQuarter;
	}

}
