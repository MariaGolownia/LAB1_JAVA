package WorkingWithNumbers;

//����� ��� ������� �������� ��������� ������������ �����;
////������� ����� - ����������� (����� �������������) �����, ������� ����� ��� ��������� ����������� �������� � ������� � ������ ����.

public class PrimeDivisorsOfNumber {
	
	public static String getPrimeDivisorsOfNumber  (int number) {
		
		String StringOfPrimeDivisors = "1";
				
		for(int i = 2; i <= number; i++) {
			if(number%i == 0) {
				StringOfPrimeDivisors += " "  + Integer.toString(i);
				break;}
			}
		return StringOfPrimeDivisors;
	}

}
