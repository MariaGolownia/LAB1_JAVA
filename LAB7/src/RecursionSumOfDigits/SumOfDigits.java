package RecursionSumOfDigits;

public class SumOfDigits {
//	1) ���� ����������� ����� N. ������������ �����, ������� ��������� ����� ���
//	���� � �������������� ��������.
	
	public static int defineSumOfDigits (int number) {
		
		 return (number > 0) ? number%10 + defineSumOfDigits(number/10) : number; 
	
	}
}


