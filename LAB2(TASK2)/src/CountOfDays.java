		
public class CountOfDays {
	
	//����� getDaysFirstYear
	//������ ���������� ���� �� ���������� ���� �� ����� ������� ���� �����
	//������� �������� ������ ������ �� ����� ���� � ������� ���������� ���� � ���
	//NumberOfDaysPerMonth.calcDaysInMonth(monthInMonths+1, YearIsLeap.isALeapYear(yearInYears))
	//�.�. ������� �� � ������ ������ ��������, � �� ���������� ������� monthInMonths+1
	//����� �������� ������������� ���������, ������� �������� �� ������ ���������� ���� � ������ �������� � ���� ��������

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
	
	
	//����� getDaysLastYear
	//������ ���������� ���� �� ������ �������� ���� �� ����������� (����������) ����
	
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
	
	//����� getFullYears 
	//����������� �������� ��������� ���������� ���� � ������ ���� ����� � ���������
	//�������������� ������� ������� ����������� ���� � ������ ����� �����
	
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
