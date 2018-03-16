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
			case 'à':
			case 'ó':
			case 'å':
			case 'û':
			case 'î':
			case 'ý':
			case 'ÿ':
			case 'þ':
				stringOfAnswer = "The letter is vowel!";
				break;
			default:
				stringOfAnswer = "The letter is consonant!";
				break;
			}
		
		return stringOfAnswer;
	}

}
