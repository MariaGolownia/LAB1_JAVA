package TASK2A;

//2) ������������ ���������, ������� ���������, ��� ����� ����� �, � � � ���� ����
//�� ���� ���� ����������� ����� (��� ������� ���������������).
public class Logic2A {
	
	public static boolean solve (double a, double b, double c) {
		boolean minTwoIsEqual = true;
		
		if(a==b || b==c ||  a==c || (a==b && b==c && a==c))
			return minTwoIsEqual;
		else return !minTwoIsEqual;
	}

}
