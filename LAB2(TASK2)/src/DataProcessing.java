import java.util.Scanner;

//–азработать интерактивную программу ЂWhat is My Age in Seconds (Minutes,
//Hours, Е)ї, котора€ спрашивает дату рождени€ пользовател€, высчитывает ко-
//личество прожитых пользователем секунд (минут, часов, Е) и выводит резуль-
//тат на экран монитора.

public class DataProcessing {
	static Thread thread = new Thread(); // »спользование потока дл€ отображени€ секунд
	
	
public static void main(String[] args) throws InterruptedException { //throws InterruptedException дл€ прерывани€ потока (работы thread.sleep())
	Scanner scanner = new Scanner(System.in);
	String dateOfBirth;
	String timeOfBirth;
	int numberOfDays;
	int numberOfHours;
	int numberOfMinutes;
	
	System.out.println("Enter your date of birth in the format XX.XX.XXXX: ");
	dateOfBirth = scanner.nextLine();
	System.out.println("The time of your birth in the format of XX:XX pm (if you do not know, miss): ");
	timeOfBirth=scanner.nextLine();
	
	if (timeOfBirth=="\n" || timeOfBirth==" ") {
		System.out.print("Our congratulations: you have lived ");	
		numberOfDays = CountOfDays.getDaysFirstYear(dateOfBirth)+CountOfDays.getDaysLastYear()+CountOfDays.getFullYears(dateOfBirth);
		System.out.println(numberOfDays + "  days, ");
		System.out.println("                                    "+ numberOfDays*24 +" hours, ");	
		System.out.println("                                    "+ numberOfDays*24*60 +" minutes, ");	
		System.out.println("                                    "+ numberOfDays*24*60*60 +" seconds!");	
		System.out.println("L i v e   f o r   a   l o n g   t i m e   a n d   h a p p i l y !");}
	else
	{
		System.out.print("Our congratulations: you have lived ");	
			numberOfDays = CountOfDays.getDaysFirstYear(dateOfBirth)+CountOfDays.getDaysLastYear()+CountOfDays.getFullYears(dateOfBirth);
		System.out.println(numberOfDays + "  days, ");
			numberOfHours= numberOfDays*24+CountOfTime.getHoursFirstDay(timeOfBirth)+CountOfTime.getHoursLastDay();
		System.out.println("                                    "+ numberOfHours +" hours, ");	
			numberOfMinutes=(numberOfHours*60+CountOfTime.getMinutesFirstDay(timeOfBirth)+CountOfTime.getMinutesLastDay());
		System.out.println("                                    "+ numberOfMinutes +" minutes, ");	
		
		for(int s = 0; s<10; s++)
		{
			thread.sleep(1000);
			System.out.println("                                    "+ numberOfMinutes*60 +s +" seconds!");	
			
		}

		System.out.println("And so on! L i v e   f o r   a   l o n g   t i m e   a n d   h a p p i l y !");}
	scanner.close();
	}
}