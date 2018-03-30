package WorkingWithNumbers;

//найти все простые делители заданного натурального числа;
////простое число - натуральное (целое положительное) число, имеющее ровно два различных натуральных делителя — единицу и самого себя.

public class PrimeDivisorsOfNumber {
	
	public static String getPrimeDivisorsOfNumber  (int number) {
		
		String StringOfPrimeDivisors = "1";
				
		for(int i = 2; i <= number; i++) {
			if(number%i == 0) {
				StringOfPrimeDivisors += " "  + Integer.toString(i);
				break;}
			}
		return StringOfPrimeDivisors;
	}

}
