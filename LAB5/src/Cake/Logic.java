package Cake;

import java.util.Random;

//5) �������� ��������� � ��������� �������� � ����������. ���������
//������ �������� ������� � ���� �� ���� (����� ������) ��������� ����-
//������, ������� �� ��������� ��������� �������.

public class Logic {
	
	public static String solve () {
		int numberOfSuprises = 0;
		
		String[] arrayOfSuprises = new String [] {"Strawberry", "Elephant", "Carpet", "Truffle", "Macadamia", "Black caviar"};
		Random random = new Random ();
		numberOfSuprises = random.nextInt(arrayOfSuprises.length);
		
		return arrayOfSuprises[numberOfSuprises];
	}

}
