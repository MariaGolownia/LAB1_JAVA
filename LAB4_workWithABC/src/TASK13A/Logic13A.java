package TASK13A;

//13) Разработайте программу, которая проверяет, что четырёхзначное число N чи-
//тается одинаково слева направо и справа налево.

public class Logic13A {
	
	public static boolean CompareLeftAndRight (int a) {
		boolean isSame = true;
		String str = "";
		str = Integer.toString(a);
		
	if (Integer.parseInt(str.substring(0, 1)) == Integer.parseInt(str.substring(3)) && Integer.parseInt(str.substring(1, 2)) == Integer.parseInt(str.substring(2, 3)))
		return isSame;
	else return !isSame;

	}
}
