package DiceGame;

import java.util.Random;

//3) Напишите программу, которая бы эмулировала игру «Dice» (игра в кости). Суть
//игры заключается в броске двух шестигранных кубиков (костей) и подсчёта
//общей суммы очков, которые выпали на первой и второй костей.

public class Logic {

	public static String solve(int numberOfMoves) {
		String stringResult = "";
		int dice1=0;
		int dice2=0;
		int dice3=0;
		int dice4=0;
		int score1 = 0;	
		int score2 = 0;		
		Random random = new Random();
		
		while (numberOfMoves > 0)
		{
		dice1 = 1 + random.nextInt(5);
		dice2 = 1 + random.nextInt(5);
		dice3 = 1 + random.nextInt(5);
		dice4 = 1 + random.nextInt(5);
		stringResult+="\n--------------------------------------------------------------------";
		stringResult+="\nYour first dice: " + dice1 +".         " +"Your second dice: " + dice2 +".         " + "TOTAL: " + (dice1 + dice2) +". "; 
		stringResult+="\nOpponent's first dice: " + dice3 +". " +"  Opponent's second dice: " + dice4 +".   " + "TOTAL: " + (dice3 + dice4) +". "; 
		stringResult+="\n---------------------------------------------------------------------";
		score1+=(dice1 + dice2);
		score2+=(dice3 + dice4);
		
		if((dice1 + dice2) > (dice3 + dice4)) {
			stringResult+="\n\t\t\t SCORE: " + score1 + " : " + score2;}
				else if ((dice1 + dice2) == (dice3 + dice4)) {
					stringResult+="\n\t\t\t SCORE: " + score1 + " : " + score2;}
				else {
					stringResult+="\n\t\t\t SCORE: " + score1 + " : " + score2;}
		stringResult+="\n---------------------------------------------------------------------";
		numberOfMoves--;
		}
		
		
	if (score1 > score2) {
		stringResult+="\n\t\t\tYOU WON!";}
			else if (score1 > score2) {
				stringResult+="\n\t\t\tDRAW!";}
					else stringResult+="\n\t\t\tYOU LOST!";
		return stringResult;
	}

}
