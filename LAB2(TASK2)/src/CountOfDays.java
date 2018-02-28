		
public class CountOfDays {
	
	//ћетод getDaysFirstYear
	//–асчет количества дней от конкретной даты до конца первого года жизни
	//—начала отсекаем полные мес€цы до конца года и считаем количество дней в них
	//NumberOfDaysPerMonth.calcDaysInMonth(monthInMonths+1, YearIsLeap.isALeapYear(yearInYears))
	//“.е. считаем не с начала мес€ца рождени€, а со следующего полного monthInMonths+1
	//«атем получаем окончательный результат, добавив разность от общего количества дней в мес€це рождени€ с днем рождени€

	public static int getDaysFirstYear (String stringDate)	{
		int dayInDays;
		int monthInMonths;
		int yearInYears;
		int numberOfDays=0;
	
		dayInDays = Integer.valueOf(stringDate.substring(0, 2)); 
		monthInMonths = Integer.valueOf(stringDate.substring(3, 5)); 
		yearInYears = Integer.valueOf(stringDate.substring(6, 10)); 
		
		for (int i = monthInMonths+1; i<13; i++)
		{
			numberOfDays+=NumberOfDaysPerMonth.calcDaysInMonth(i, YearIsLeap.isALeapYear(yearInYears));
			
		}
		
		numberOfDays=numberOfDays + NumberOfDaysPerMonth.calcDaysInMonth(monthInMonths, YearIsLeap.isALeapYear(yearInYears))-dayInDays;
		
		return numberOfDays;
	}
	
	
	//ћетод getDaysLastYear
	//–асчет количества дней от начала текущего года до сегодн€шней (актуальной) даты
	
	public static int getDaysLastYear () {
		
		int numberOfDaysFromBegin=0;
		int currentMonth;
		int currentDay;
		int currentYear;
		
		java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
		calendar.setTime(new java.util.Date());
		currentYear = calendar.get(java.util.Calendar.YEAR);
		currentMonth = calendar.get(java.util.Calendar.MONTH)+1;
		currentDay=calendar.get(java.util.Calendar.DATE)+1;
		
		for(int i=1; i<currentMonth;i++)
		{
			numberOfDaysFromBegin+=NumberOfDaysPerMonth.calcDaysInMonth(i, YearIsLeap.isALeapYear(currentYear));	
			
		}
		numberOfDaysFromBegin+=currentDay-1;
		
		return numberOfDaysFromBegin;
		
	}
	
	//ћетод getFullYears 
	//ѕредыдущими методами посчитали количество дней в первом году жизни и последним
	//ѕредставленным методом считаем количесвтво дней в полных годах жизни
	
	public static int getFullYears (String stringDate) {
		
		int yearInYears;
		int currentYear;
		int numberOfLeapYears=0;
		int numberOfNotLeapYears=0;
		int i;
		
		yearInYears = Integer.valueOf(stringDate.substring(6, 10)); 
		
		java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
		calendar.setTime(new java.util.Date());
		currentYear = calendar.get(java.util.Calendar.YEAR);
		
		if (yearInYears+1<currentYear)
		{
			{	
				for(i=yearInYears+1; i<currentYear; i++){
						if (YearIsLeap.isALeapYear(i+1)==true) {
							numberOfLeapYears++;}
						else if(YearIsLeap.isALeapYear(i+1)==false) {
									numberOfNotLeapYears++;}}
			}
		}
		return (numberOfLeapYears*366+numberOfNotLeapYears*365);
	}
}
