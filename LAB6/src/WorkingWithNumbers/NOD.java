package WorkingWithNumbers;

//найти НОД  двух натуральных чисел a и b.
//наибольший общий делить (НОД) 
	public class NOD {
		
		public static int getNOD (int number1, int number2) {
			int i;
			int NOD = 0;
			int numLarger;
			int numSmaller;
			if (number1 > number2) {
				numLarger = number1;
				numSmaller = number2;
				}
				else {
					numLarger = number2;
					numSmaller = number1;				
					}
				
			
				for(i = numSmaller; i > 0; i--) {
					if(numSmaller % i == 0 && numLarger % i == 0) {
						NOD = i;
						break;
					}
				}
			
			
			
			return NOD;
			
		}

}
