package WorkingWithNumbers;
//����� ���������� ���� � ��������� ������������ �����;

public class CountOfDigitsInNumber {
	public static int defineCountOfDigitsInNumber (int number) {
		int numberCount = 0;
			
		while(number > 0) {
			number = number / 10;
			numberCount++;
		}
		return numberCount;
	}
}
