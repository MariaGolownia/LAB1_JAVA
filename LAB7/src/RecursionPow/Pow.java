package RecursionPow;

//2) Рекурсивно описать функцию pow(x, n), вычисляющую xn для любого веще-
//ственного x(≠0) и любого целого n.

public class Pow {
	
	public static double definePow (double x, int n) {
		
		if (n == 0) return 1.0;
		else if (n > 0) return x * definePow(x, n-1);
		else if (n < 0) return 1.0 / (x * definePow(x, -n));
		
		return x;
	}

}
