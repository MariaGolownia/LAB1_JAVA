package WorkingWithNumbers;

//определить является ли заданное натуральное число простым;
//Просто́е число́ — натуральное (целое положительное) число, имеющее ровно два различных натуральных делителя — единицу и самого себя.
public class PrimeSimpleNumber {

	public static Boolean isSimpleNumber (int number) {
		int flag = 0;
		for(int i = 2; i < number; i++) {
			if(number%i == 0) {
				flag++;
				break;}
			else flag=0;		
		}
		
		if(flag == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
