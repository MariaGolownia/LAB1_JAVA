package TASK18A;

//18) ������������ ���������, ������� ���������, ��� �����������, �������� ���-
//������ a, b � c, �������� �������������.

public class Logic18A {

	public static Boolean isRectangular (double a, double b, double c) {
		if ( ((a+b)>c && (a+c)>b && (b+c)>a) && ((Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) || (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) || (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) ))
			return true;
		else return false;
	}
}
