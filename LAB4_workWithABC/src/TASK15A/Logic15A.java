package TASK15A;

//15) ������������ ���������, ������� ���������, ��� ����� a, b � c �������������
//�������� ��������� ������������.

//�������: ����������� ���������� ������ �����, ����� ����� ����� ���� ��� ������ ������ �������.


public class Logic15A {

	public static Boolean isTriangle (double a, double b, double c) {
		if ((a+b)>c && (a+c)>b && (b+c)>a)
			return true;
		else return false;
	}
}
