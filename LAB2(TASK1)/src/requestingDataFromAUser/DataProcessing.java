//Необходимо спроектировать и разработать простейшее интерактивное
//приложение, которое бы спрашивала у пользователя соответствующую ин-
//формацию о нём (к примеру, дату рождения, где работает, кем работает, хобби
//и увлечения, любимый афоризм или лозунг, семейное положение, сколько в
//день работает, отдыхает и т.д.), а затем выводит всю введённую пользователем
//информацию в табличном виде на экран монитора.

package requestingDataFromAUser;

import java.util.Scanner;

public class DataProcessing {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String surname;
		String name;
		String secondName;
		String dateOfbirth;
		String placeOfWork;
		String postAtWork;
		String hobbies;
		String favoriteAphorismOrSlogan;
		String familyStatus;
		int numberOfWorkingHoursOfDay;
		int numberOfHoursOfRestPerDay=0;
		int i;
	
		System.out.println("What is your surname?");
			surname = scanner.nextLine();
		System.out.println("What is your name?");
			name = scanner.nextLine();
		System.out.println("What is your second name?");
			secondName = scanner.nextLine();
		System.out.println("What is your date of birth?");
			dateOfbirth = scanner.nextLine();
		System.out.println("What is your place of work?");
			placeOfWork  = scanner.nextLine();
		System.out.println("What position do you have at work?");
			postAtWork = scanner.nextLine();
		System.out.println("List your Hobbies!");
			hobbies = scanner.nextLine();
		System.out.println("Write your favorite aphorism or slogan!");
			favoriteAphorismOrSlogan = scanner.nextLine();
		System.out.println("What's your family status?");
			familyStatus = scanner.nextLine();
		System.out.println("How many hours a day do you spend working?");
			numberOfWorkingHoursOfDay = scanner.nextInt();
		System.out.println("How many hours a day do you spend on vacation?");
			numberOfHoursOfRestPerDay = scanner.nextInt();
			
		scanner.close();
		
		String column1=" "; // Вводим дополнительные переменные, в которую будет записываться максимальная строка (в данном случае: либо название столбца либо его содержимое)
		String column2=" ";
		String column3=" ";
		String column4=" ";
		String column5=" ";
		String column6=" ";
		String column7=" ";
		String column8=" ";
		String column9=" ";
		String column10=" ";
		String column11=" ";
		
		if(surname.length()>7) //Определяем, какая строка длинее (название столбца или его содержимое) - необходимо для прорисовки таблицв (разделяющих линий)
			column1=surname;
			else column1="Surname";
		if(name.length()>4)
			column2=name;
			else column2="Name";
		if(secondName.length()>11)
			column3=secondName;
			else column3="Second name";
		if(dateOfbirth.length()>13)
			column4=dateOfbirth;
			else column4="Date of birth";
		if(placeOfWork.length()>13)
			column5=placeOfWork;
			else column5="Place of work";
		if(postAtWork.length()>16)
			column6=postAtWork;
			else column6="The post at work";
		if(hobbies.length()>7)
			column7=hobbies;
			else column7="Hobbies";
		if(favoriteAphorismOrSlogan.length()>27)
			column8=favoriteAphorismOrSlogan;
			else column8="Favorite aphorism or slogan";
		if(familyStatus.length()>13)
			column9=familyStatus;
			else column9="Family status";
		if(Integer.toString(numberOfWorkingHoursOfDay).length()>30)
			column10=Integer.toString(numberOfWorkingHoursOfDay);
			else column10="Number of working hours of day";
		if(Integer.toString(numberOfHoursOfRestPerDay).length()>31)
			column11=Integer.toString(numberOfHoursOfRestPerDay);
			else column11="Number of hours of rest per day";
		
		
		System.out.println("Output of the received data in tabular form: ");
		// Первая разделяющая линия
		for(i=0;i<=(column1.length()+column2.length()+column3.length()+column4.length()+column5.length()+column6.length()+column7.length()+column8.length()+column9.length()+column10.length()+column11.length()+3*11); i++){
			System.out.print("-");}
		System.out.print("\n");
		
			System.out.print("| ");             // 1 столбец: название столбца            
			System.out.print("Surname");
			if(7<=surname.length())
			{
				for(i=0;i<=surname.length()-7; i++){
					System.out.print(" ");}
				System.out.print("| ");}
			else {
				System.out.print(" | ");}
			
			System.out.print("Name");         // 2 столбец: название столбца  
			if(4<=name.length())
			{
				for(i=0;i<=name.length()-4; i++){
					System.out.print(" ");}
				System.out.print("| ");}
			else {
				System.out.print(" | ");}
			
			System.out.print("Second name");  // 3 столбец: название столбца  
			if(11<=secondName.length())
			{
				for(i=0;i<=secondName.length()-11; i++){
					System.out.print(" ");}
				System.out.print("| ");}
			else {
				System.out.print(" | ");}
			
			System.out.print("Date of birth");  // 4 столбец: название столбца  
			if(13<=dateOfbirth.length())
			{
				for(i=0;i<=dateOfbirth.length()-13; i++){
					System.out.print(" ");}
				System.out.print("| ");}
			else {
				System.out.print(" | ");}
			
			System.out.print("Place of work");  // 5 столбец: название столбца  
			if(13<=placeOfWork.length())
			{
				for(i=0;i<=placeOfWork.length()-13; i++){
					System.out.print(" ");}
				System.out.print("| ");}
			else {
				System.out.print(" | ");}		
			
			System.out.print("The post at work");  // 6 столбец: название столбца  
			if(16<=postAtWork.length())
			{
				for(i=0;i<=postAtWork.length()-16; i++){
					System.out.print(" ");}
				System.out.print("| ");}
			else {
				System.out.print(" | ");}	
			
			System.out.print("Hobbies");         // 7 столбец: название столбца  
			if(7<=hobbies.length())
			{
				for(i=0;i<=hobbies.length()-7; i++){
					System.out.print(" ");}
				System.out.print("| ");}
			else {
				System.out.print(" | ");}	
			
			System.out.print("Favorite aphorism or slogan"); // 8 столбец: название столбца  
			if(27<=favoriteAphorismOrSlogan.length())
			{
				for(i=0;i<=favoriteAphorismOrSlogan.length()-27; i++){
					System.out.print(" ");}
				System.out.print("| ");}
			else {
				System.out.print(" | ");}	
			
			System.out.print("Family status");            // 9 столбец: название столбца  
			if(13<=familyStatus.length())
			{
				for(i=0;i<=familyStatus.length()-13; i++){
					System.out.print(" ");}
				System.out.print("| ");}
			else {
				System.out.print(" | ");}	
			
			System.out.print("Number of working hours of day");  // 10 столбец: название столбца  
			if(30<=(Integer.toString(numberOfWorkingHoursOfDay)).length())
			{
				for(i=0;i<=(Integer.toString(numberOfWorkingHoursOfDay)).length()-30; i++){
					System.out.print(" ");}
				System.out.print("| ");}
			else {
				System.out.print(" | ");}	
			
			System.out.print("Number of hours of rest per day"); // 11 столбец: название столбца  
			if(31<=(Integer.toString(numberOfHoursOfRestPerDay)).length())
			{
				for(i=0;i<=(Integer.toString(numberOfHoursOfRestPerDay)).length()-31; i++){
					System.out.print(" ");}
				System.out.println("| ");}
			else {
				System.out.println(" | ");}	
			
			// Вторая разделяющая линия
			for(i=0;i<=(column1.length()+column2.length()+column3.length()+column4.length()+column5.length()+column6.length()+column7.length()+column8.length()+column9.length()+column10.length()+column11.length()+3*11); i++){
				System.out.print("-");}
			System.out.print("\n");
		
		System.out.print("| ");                       // 1 столбец: содержимое столбца   
			System.out.print(surname);	
			if(surname.length()<=7){
				for(i=0;i<(7-surname.length()); i++){
					System.out.print(" ");}	
				System.out.print(" | ");}
			else {
				System.out.print(" ");	
				System.out.print("| ");}
			
		System.out.print(name);	                      // 2 столбец: содержимое столбца   
			if(name.length()<=4){
				for(i=0;i<(4-name.length()); i++){
					System.out.print(" ");}	
				System.out.print(" | ");}
			else {
				System.out.print(" ");	
				System.out.print("| ");}
			
			System.out.print(secondName);	          // 3 столбец: содержимое столбца   
			if(secondName.length()<=11){
				for(i=0;i<(11-secondName.length()); i++){
					System.out.print(" ");}	
				System.out.print(" | ");}
			else {
				System.out.print(" ");	
				System.out.print("| ");}
			
			System.out.print(dateOfbirth);	         // 4 столбец: содержимое столбца   
			if(dateOfbirth.length()<=13){
				for(i=0;i<(13-dateOfbirth.length()); i++){
					System.out.print(" ");}	
				System.out.print(" | ");}
			else {
				System.out.print(" ");	
				System.out.print("| ");}
			
			System.out.print(placeOfWork);	        // 5 столбец: содержимое столбца   
			if(placeOfWork.length()<=13){
				for(i=0;i<(13-placeOfWork.length()); i++){
					System.out.print(" ");}	
				System.out.print(" | ");}
			else {
				System.out.print(" ");	
				System.out.print("| ");}
			
			System.out.print(postAtWork);	        // 6 столбец: содержимое столбца   
			if(postAtWork.length()<=16){
				for(i=0;i<(16-postAtWork.length()); i++){
					System.out.print(" ");}	
				System.out.print(" | ");}
			else {
				System.out.print(" ");	
				System.out.print("| ");}
			
			System.out.print(hobbies);	            // 7 столбец: содержимое столбца   
			if(hobbies.length()<=7){
				for(i=0;i<(7-hobbies.length()); i++){
					System.out.print(" ");}	
				System.out.print(" | ");}
			else {
				System.out.print(" ");	
				System.out.print("| ");}
			
			System.out.print(favoriteAphorismOrSlogan);	  // 8 столбец: содержимое столбца   
			if(favoriteAphorismOrSlogan.length()<=27){
				for(i=0;i<(27-favoriteAphorismOrSlogan.length()); i++){
					System.out.print(" ");}	
				System.out.print(" | ");}
			else {
				System.out.print(" ");	
				System.out.print("| ");}
			
			System.out.print(familyStatus);	           // 9 столбец: содержимое столбца   
			if(familyStatus.length()<=13){
				for(i=0;i<(13-familyStatus.length()); i++){
					System.out.print(" ");}	
				System.out.print(" | ");}
			else {
				System.out.print(" ");	
				System.out.print("| ");}
			 
			System.out.print(numberOfWorkingHoursOfDay);    // 10 столбец: содержимое столбца   
			if((Integer.toString(numberOfWorkingHoursOfDay)).length()<=30){
				for(i=0;i<(30-(Integer.toString(numberOfWorkingHoursOfDay)).length()); i++){
					System.out.print(" ");}	
				System.out.print(" | ");}
			else {
				System.out.print(" ");	
				System.out.print("| ");}
			
			System.out.print(numberOfHoursOfRestPerDay);	 // 11 столбец: содержимое столбца   
			if((Integer.toString(numberOfHoursOfRestPerDay)).length()<=31){
				for(i=0;i<(31-(Integer.toString(numberOfHoursOfRestPerDay)).length()); i++){
					System.out.print(" ");}	
				System.out.println(" | ");}
			else {
				System.out.print(" ");	
				System.out.println("| ");}
			
			// Третяя разделяющая линия
			for(i=0;i<=(column1.length()+column2.length()+column3.length()+column4.length()+column5.length()+column6.length()+column7.length()+column8.length()+column9.length()+column10.length()+column11.length()+3*11); i++){
				System.out.print("-");}
			System.out.print("\n");

	}
	
}
