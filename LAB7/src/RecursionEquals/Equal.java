package RecursionEquals;

//3) ќписать рекурсивную функцию equals(N, S) (где N и S Ц неотрицательные це-
//лые числа), котора€ провер€ет, совпадает ли сумма цифр в дес€тичной записи
//числа N со значением S (например: equals(1234567, 28) = True, equals(10, 7) =
//False, equals(10000, 1) = True и т.д.).

public class Equal {

	public static Boolean IsEqual (int number1, int number2) {
		
		if (number2<0)
			return false;
		else if (number1<10)
			return (number1==number2) ? true : false;
		else
			return IsEqual(number1/10, number2-(number1%10));

		
	}
}
