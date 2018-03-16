package Letter;

public class Logic5 {
	public static String isVowelOrConsonant(char charOfLetter) {
		String stringOfLetters = "aeiouyàóåûîýÿèþ";
		String stringTemp = "";
		String stringOfAnswer = "";
		
		charOfLetter=Character.toLowerCase(charOfLetter);
		stringTemp +=charOfLetter;
		
		if(stringOfLetters.contains(stringTemp)) {
				stringOfAnswer = "The letter is vowel!";}
		else {
				stringOfAnswer = "The letter is consonant!";}
					
		return stringOfAnswer;
	}

}
