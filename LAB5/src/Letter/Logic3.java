package Letter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//4) Напишите программу, которая бы определяла, является ли введённая буква
//гласной или согласной (постарайтесь сделать минимум четырьмя способами,
//разрешается и больше).

//Метод matches() проверяет строку на соответствие 
public class Logic3 {
	
	public static String isVowelOrConsonant(char charOfLetter) {
		String stringOfAnswer = "";
		
		charOfLetter=Character.toLowerCase(charOfLetter);
		String newString="";
		newString+=charOfLetter;
		//Класс Pattern не имеет публичных конструкторов,
		//поэтому для создания объекта данного класса необходимо вызвать статический метод compile
		//и передать в качестве первого аргумента строку с РВ
		Pattern pattern = Pattern.compile("[aeiouyауеыоэяию]");
		
		//Matcher — класс, который представляет строку, реализует механизм согласования (matching) с РВ и хранит результаты этого согласования    
	    Matcher matcher = pattern.matcher(newString);  
	       if (matcher.matches() == true) {
	    	   stringOfAnswer =	"The letter is vowel!";}  
	       else {stringOfAnswer = "The letter is consonant!";}

		return stringOfAnswer;
	}

}