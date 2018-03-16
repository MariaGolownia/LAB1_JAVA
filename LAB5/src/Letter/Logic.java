package Letter;

//4) Ќапишите программу, котора€ бы определ€ла, €вл€етс€ ли введЄнна€ буква
//гласной или согласной (постарайтесь сделать минимум четырьм€ способами,
//разрешаетс€ и больше).

public class Logic {
	
	public static String isVowelOrConsonant(char charOfLetter) {
		String stringOfAnswer = "";
		
		charOfLetter=Character.toLowerCase(charOfLetter);
		
		if(charOfLetter == 'а' || charOfLetter == 'e' || charOfLetter == 'y' || charOfLetter == 'u' || charOfLetter == 'i' || charOfLetter == 'o'){
			stringOfAnswer = "The letter is vowel!";}
		
		else if (charOfLetter == 'а' || charOfLetter == 'у' || charOfLetter == 'е' || charOfLetter == 'ы' || charOfLetter == 'о' || charOfLetter == 'э' || charOfLetter == '€'|| charOfLetter == 'и'|| charOfLetter == 'ю') {
			stringOfAnswer = "The letter is vowel!";}
		else {stringOfAnswer = "The letter is consonant!";}
		
		return stringOfAnswer;
	}

}
