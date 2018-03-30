package NumberConversely;

//3) Напишите программу, которая организует диалог с пользователем и с помо-
//щью соответствующих арифметических операций для натурального числа N
//вычисляет число M, записываемое теми же цифрами, что и N, но в обратном
//порядке (все незначащие нули в числе M не выводятся, например, если N =
//2900, то M=92).

public class DoingNumberConversely {

	public static int doNumberConversly(int number) {
		int newNumber = 0;
		while(number > 0) {
			newNumber += number % 10;
			number = number / 10;
			if(number == 0)
				break;
			else {
				newNumber=newNumber*10;
			}
			
		}
		return newNumber;
	}
}
