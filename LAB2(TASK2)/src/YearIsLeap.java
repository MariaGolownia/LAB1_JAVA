//��� �������� ����������, ���� �� ������ 4 � ��� ���� �� ������ 100, ���� ������ 400.

public class YearIsLeap {
	
public static Boolean  isALeapYear (int numberOfTheYear)	{
	
	Boolean itIsALeapYear;
	
	if ((numberOfTheYear%4==0) && (numberOfTheYear%100!=0) || (numberOfTheYear%400==0)) {
		itIsALeapYear=true;}
	else {
		itIsALeapYear=false;
		}
	
	return itIsALeapYear;
}

}