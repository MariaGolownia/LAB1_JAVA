package TryToGuessTheNumber;

public class FrameForText {
	
	public static String textInFrame (String text) {
		
		String textInFrame = "";
		int i = 0;
		textInFrame += "\n";
		for(i = 0; i <= (text.length()+3); i++){
			textInFrame +="-";}
		
		textInFrame += "\n| ";
		textInFrame += text;
		textInFrame += " | \n";
		
		for(i = 0; i <= (text.length()+3); i++){
			textInFrame +="-";}
		
		return textInFrame;
	}

}
