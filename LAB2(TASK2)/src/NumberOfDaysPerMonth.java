//Расчет количества дней в месяце:
//для февраля определение 28 или 29 дней - в зависимости от того, является ли год високосным (для этого используется boolean itIsALeapYear);
//для остальных месяцев 30 или 31 дн.

public class NumberOfDaysPerMonth {
	
	public static int calcDaysInMonth (int serialNumberOfTheMonth, boolean itIsALeapYear)	{
		
		int countOfDaysInMonth=0;
	
		switch (serialNumberOfTheMonth) {
		case 1: 
			countOfDaysInMonth=31;
			break;
		case 2:
			if (itIsALeapYear==true) {
				countOfDaysInMonth=29;}
			else {
				countOfDaysInMonth=28;}
			break;
		case 3:
			countOfDaysInMonth=31;
			break;
		case 4:
			countOfDaysInMonth=30;
			break;
		case 5:
			countOfDaysInMonth=31;
			break;
		case 6:
			countOfDaysInMonth=30;
			break;
		case 7:
			countOfDaysInMonth=31;
			break;
		case 8:
			countOfDaysInMonth=31;
			break;
		case 9:
			countOfDaysInMonth=30;
			break;
		case 10:
			countOfDaysInMonth=31;
			break;
		case 11:
			countOfDaysInMonth=30;
			break;
		case 12:
			countOfDaysInMonth=31;
			break;
		default:
			//System.out.println("Error: check the correct month of birth!");
			break;
		}
		
		return countOfDaysInMonth;
	}
}
