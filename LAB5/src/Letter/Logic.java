package Letter;

//4) �������� ���������, ������� �� ����������, �������� �� �������� �����
//������� ��� ��������� (������������ ������� ������� �������� ���������,
//����������� � ������).

public class Logic {
	
	public static String isVowelOrConsonant(char charOfLetter) {
		String stringOfAnswer = "";
		
		charOfLetter=Character.toLowerCase(charOfLetter);
		
		if(charOfLetter == '�' || charOfLetter == 'e' || charOfLetter == 'y' || charOfLetter == 'u' || charOfLetter == 'i' || charOfLetter == 'o'){
			stringOfAnswer = "The letter is vowel!";}
		
		else if (charOfLetter == '�' || charOfLetter == '�' || charOfLetter == '�' || charOfLetter == '�' || charOfLetter == '�' || charOfLetter == '�' || charOfLetter == '�'|| charOfLetter == '�'|| charOfLetter == '�') {
			stringOfAnswer = "The letter is vowel!";}
		else {stringOfAnswer = "The letter is consonant!";}
		
		return stringOfAnswer;
	}

}
