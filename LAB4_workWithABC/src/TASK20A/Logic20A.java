package TASK20A;

//20) ������������ ���������, ������� ���������, ��� ����� � ������������ (x, y)
//����� ������ ��������������, ����� ������� ������� �������� ����� ����-
//������ (x1, y1), ������ ������ � (x2, y2), � ������� ����������� ���������-
//��� ����.

public class Logic20A {

	public static Boolean belongsToTheRectangle (double x1, double y1, double x2, double y2, double xPoint, double yPoint) {
		if(xPoint <= x2 && xPoint >= x1 && xPoint <= y1 && xPoint >= y2) {
			return true;
		}
		else return false;
		
	}
}
