package TASK19A;

//19) ������������ ���������, ������� ���������, ��� �����������, �������� ���-
//������ a, b � c, �������� ������������� � �������������� ������������.

public class Logic19A {

	public static Boolean isRectangularAndIsosceles (double a, double b, double c) {
		if (((a+b)>c && (a+c)>b && (b+c)>a)) {
			if ((Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) || (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) || (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))){
				if (a==b || a==c || c==b) {
					return true;
				}
				else
					return false;
			}
			else
				return false;
		}
		else
			return false;
			 
		
	}
}
