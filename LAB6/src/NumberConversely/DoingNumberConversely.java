package NumberConversely;

//3) �������� ���������, ������� ���������� ������ � ������������� � � ����-
//��� ��������������� �������������� �������� ��� ������������ ����� N
//��������� ����� M, ������������ ���� �� �������, ��� � N, �� � ��������
//������� (��� ���������� ���� � ����� M �� ���������, ��������, ���� N =
//2900, �� M=92).

public class DoingNumberConversely {

	public static int doNumberConversly(int number) {
		int newNumber = 0;
		while(number > 0) {
			newNumber += number % 10;
			number = number / 10;
			if(number == 0)
				break;
			else {
				newNumber=newNumber*10;
			}
			
		}
		return newNumber;
	}
}
