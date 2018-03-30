package PerfectNumber;

//2) Ќатуральное число называют совершенным, если оно равно сумме всех своих
//делителей, не счита€ только его самого (например, 28=1+2+3+7+14 Ц совер-
//шенное число). Ќапишите программу, котора€ организует диалог с пользова-
//телем и провер€ет, €вл€етс€ ли введЄнное натуральное число совершенным.
//ƒл€ проверки работоспособности программы приводитс€ список некоторых
//совершенных чисел: 6, 28, 496, 8128.

public class PerfectNumber {

	public static boolean ifPerfectNumber (int number) {
		int accumulation = 1;
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				accumulation=accumulation + i;
			}
		}
		if(accumulation==number) {
			return true;}
				else return false;
	}
}
