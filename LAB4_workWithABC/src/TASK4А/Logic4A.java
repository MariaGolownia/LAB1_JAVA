package TASK4�;

//4) ������������ ���������, ������� ���������, ��� ����� ����� �, � � � ���� ����
//�� ���� ������������� (�������������).

public class Logic4A {
	public static boolean solve (double a, double b, double c) {
		boolean minOneIsPositive = true;
		
		if(a > 0 || b > 0 || c > 0)
			return minOneIsPositive ;
		else return !minOneIsPositive ;
	}
}