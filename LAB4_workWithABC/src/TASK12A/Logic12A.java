package TASK12A;

//12) Разработайте программу, которая проверяет, что цифры четырёхзначного
//числа N образуют возрастающую (убывающую) последовательность (к при-
//меру, число 1357 удовлетворяет условию, т.к. его цифры соответствуют следу-
//ющему неравенству: 1 < 3 < 5 < 7, т.е. идут в порядке возрастания).

public class Logic12A {
	public static boolean solve (int a) {
		boolean flag = false;
		boolean isIncreasing = true;
		String strOfNumber="";
		
		strOfNumber = Integer.toString(a);
		
	 int []arrayOfNumbers = new int [4];
	 
	 arrayOfNumbers[0] = Integer.parseInt(strOfNumber.substring(0, 1));
	 arrayOfNumbers[1] = Integer.parseInt(strOfNumber.substring(1, 2));
	 arrayOfNumbers[2] = Integer.parseInt(strOfNumber.substring(2, 3));
	 arrayOfNumbers[3] = Integer.parseInt(strOfNumber.substring(3));
	 
	 for(int i = 1; i < arrayOfNumbers.length; i++)
	 {
		 if (arrayOfNumbers[i]>arrayOfNumbers[i-1])
			 flag=true;
		 else {
			 flag=false;
			 break;}
		 }
	 if (flag==true)
		 return isIncreasing;
	 else return !isIncreasing;

	}
}
