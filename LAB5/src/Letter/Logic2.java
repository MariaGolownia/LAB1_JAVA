package Letter;

//4) �������� ���������, ������� �� ����������, �������� �� �������� �����
//������� ��� ��������� (������������ ������� ������� �������� ���������,
//����������� � ������).

public class Logic2 {
	
	public static String isVowelOrConsonant(char charOfLetter) {
		String stringOfAnswer = "";
		
		charOfLetter=Character.toLowerCase(charOfLetter);
		
		if(charOfLetter == 97 || charOfLetter == 101 || charOfLetter == 121 || charOfLetter == 117 || charOfLetter == 105 || charOfLetter == 111){
			stringOfAnswer = "The letter is vowel!";}
		
		else if (charOfLetter == 224 || charOfLetter == 243 || charOfLetter == 229 || charOfLetter == 251 || charOfLetter == 238 || charOfLetter == 253 || charOfLetter == 254|| charOfLetter == 232|| charOfLetter == 255) {
			stringOfAnswer = "The letter is vowel!";}
		else {stringOfAnswer = "The letter is consonant!";}
		
		return stringOfAnswer;
	}

}