package Letter;

public class Logic4 {
	public static String isVowelOrConsonant(char charOfLetter) {
		String stringOfAnswer = "";
		
		charOfLetter=Character.toLowerCase(charOfLetter);
		switch (charOfLetter) {
			case 'a':
			case 'e':
			case 'u':
			case 'i':
			case 'o':
			case 'y':
			case '�':
			case '�':
			case '�':
			case '�':
			case '�':
			case '�':
			case '�':
			case '�':
				stringOfAnswer = "The letter is vowel!";
				break;
			default:
				stringOfAnswer = "The letter is consonant!";
				break;
			}
		
		return stringOfAnswer;
	}

}
