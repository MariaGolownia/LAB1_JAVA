package TASK14A;

//14) ������������ ���������, ������� ���������, ��� ����� � ������������ (x, y)
//����� � ������ (��� �� ������, ��� � �������, ��� � ��������) ������������
//��������.

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
