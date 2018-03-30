package PerfectNumber;

//2) ����������� ����� �������� �����������, ���� ��� ����� ����� ���� �����
//���������, �� ������ ������ ��� ������ (��������, 28=1+2+3+7+14 � �����-
//������ �����). �������� ���������, ������� ���������� ������ � ��������-
//����� � ���������, �������� �� �������� ����������� ����� �����������.
//��� �������� ����������������� ��������� ���������� ������ ���������
//����������� �����: 6, 28, 496, 8128.

public class PerfectNumber {

	public static boolean ifPerfectNumber (int number) {
		int accumulation = 1;
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				accumulation=accumulation + i;
			}
		}
		if(accumulation==number) {
			return true;}
				else return false;
	}
}
