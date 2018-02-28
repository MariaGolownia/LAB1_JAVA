import java.util.Calendar;

import org.omg.CORBA.Current;

//Формат принимаемой строки: 08:00 pm


public class CountOfTime {

	public static Integer getHoursFirstDay (String time) {
		int correctHours;
			
		if(time.contains("pm") || time.contains("p.m.")	|| time.contains("p")){
			correctHours=Integer.valueOf(time.substring(0, 2))+12;
		}
		else
			correctHours=Integer.valueOf(time.substring(0, 2));
		
		return (24-correctHours);
	}
	
	
	public static Integer getMinutesFirstDay (String time) {
		int correctHours;
		int correctMinutes;
	
		if(time.contains("pm") || time.contains("p.m.")	|| time.contains("p")){
			correctHours=Integer.valueOf(time.substring(0, 2))+12;
		}
		else
			correctHours=Integer.valueOf(time.substring(0, 2));
		
		correctMinutes=Integer.valueOf(time.substring(3, 5));
		return (60-correctMinutes + correctHours*60);
	}
	
	
	public static Integer getHoursLastDay () {
		int corrHours;
		Calendar now = Calendar.getInstance();
		corrHours = Integer.valueOf(now.get(Calendar.HOUR_OF_DAY));
		return (corrHours);
	}
	
	
	public static Integer getMinutesLastDay () {
		int corrMinutes;
		Calendar now = Calendar.getInstance();
		corrMinutes = Integer.valueOf(now.get(Calendar.MINUTE));
		return (corrMinutes);
	}
}
