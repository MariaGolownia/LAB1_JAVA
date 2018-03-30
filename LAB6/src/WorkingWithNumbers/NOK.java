package WorkingWithNumbers;

//найти НОК двух натуральных чисел a и b.
// наименьшее общее кратное (НОК) чисел

public class NOK {

	public static int getNOK (int number1, int number2) {
		int i;
		int j;
		
		int NOKTemp = 0;
		int array1 [] = new int [number1*number2];
		int array2 [] = new int [number1*number2];	
		String strOfOK = "";
		
		for(i = 0; i < number1*number2; i++) {
			array1[i] = number1*i;
			}
		
		for(i = 0; i < number1*number2; i++) {
			array2[i] = number2*i;
			}
		
		i = 0; 
		j = 0;
		for(i = 1; i < number1*number2; i++) {
			NOKTemp = array1[i];
			for(j = 1; j < number1*number2; j++) {
				if(array2[j] == NOKTemp) {
					strOfOK += NOKTemp + " ";     //Записываем общие кратные в строку (первый элемент и будет искомым наименьшим общим кратным)
					}
				}
			}
		String str[] = strOfOK.split(" ");
		return Integer.valueOf(str[0]);

			}
	}



