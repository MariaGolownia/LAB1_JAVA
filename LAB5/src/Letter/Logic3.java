package Letter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//4) �������� ���������, ������� �� ����������, �������� �� �������� �����
//������� ��� ��������� (������������ ������� ������� �������� ���������,
//����������� � ������).

//����� matches() ��������� ������ �� ������������ 
public class Logic3 {
	
	public static String isVowelOrConsonant(char charOfLetter) {
		String stringOfAnswer = "";
		
		charOfLetter=Character.toLowerCase(charOfLetter);
		String newString="";
		newString+=charOfLetter;
		//����� Pattern �� ����� ��������� �������������,
		//������� ��� �������� ������� ������� ������ ���������� ������� ����������� ����� compile
		//� �������� � �������� ������� ��������� ������ � ��
		Pattern pattern = Pattern.compile("[aeiouy���������]");
		
		//Matcher � �����, ������� ������������ ������, ��������� �������� ������������ (matching) � �� � ������ ���������� ����� ������������    
	    Matcher matcher = pattern.matcher(newString);  
	       if (matcher.matches() == true) {
	    	   stringOfAnswer =	"The letter is vowel!";}  
	       else {stringOfAnswer = "The letter is consonant!";}

		return stringOfAnswer;
	}

}