package TASK17A;

//17) ������������ ���������, ������� ���������, ��� �����������, �������� ���-
//������ a, b � c, �������� ��������������.

public class Logic17A {

	public static Boolean isTriangle (double a, double b, double c) {
		if (((a+b)>c && (a+c)>b && (b+c)>a) && (a == b || a == c || b == c))
			return true;
		else return false;
	}
}
