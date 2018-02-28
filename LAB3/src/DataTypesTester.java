
public class DataTypesTester {
	
	public static void testByte() {
		// byte	8 бит:	от -128 до	127
		byte a = 5, b = 2, c = 0;
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("***** Arithmetical Operators *****");
		System.out.println("---------------------------------------------------------------------------------------");
		
		c = (byte) (a + b); // addition
		System.out.printf("%d + %d = %d\n", a, b, c);
		
		c = (byte) (a - b); // subtraction
		System.out.printf("%d - %d = %d\n", a, b, c);
		
		c = (byte) (a / b); 	// division
		System.out.printf("%d / %d = %d\n", a, b, c);
	
		c = (byte) (a % b); 	//remainder (modulus)
		System.out.printf("%d %% %d = %d\n", a, b, c);
		
		a =(byte) 5;
		c = (byte) -a; // unary minus 
		System.out.printf("-%d = %d\n", a, c);
		
		c = (byte) +a; // unary plus 
		System.out.printf("+%d = %d\n", a, c);
		
		a =(byte) 5; // prefix increment (++a)
		System.out.printf("++%d = %d\n", (byte) a,(byte) ++a);
		
		a = (byte)5; // postfix increment (a++)
		System.out.printf("%d++ = %d\n",(byte) a,(byte) a++);
		
		a = (byte)5; // prefix decrement (--a)
		System.out.printf("--%d = %d\n", (byte)a, (byte)--a);
		
		a = (byte)5; // postfix decrement (a--)
		System.out.printf("%d-- = %d\n",(byte) a, (byte)a--);
		
		System.out.println("---------------------------------------------------------------------------------------");		
		System.out.println("***** Bitwise Operators *****"); // ѕобитовые операторы
		System.out.println("---------------------------------------------------------------------------------------");
		
		c = (byte) (a & b);  // bitwise AND
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		c = (byte) (a | b); // bitwise OR
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		c = (byte) (a ^ b); // bitwise XOR
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		c = (byte) ~a; // bitwise unary compliment
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		c = (byte) (a << 1); // left shift
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),Integer.toBinaryString(c));
		
		//—двиг на один бит вправо = деление на 2 (на 2 бита=/4, 3 бита=/8 и т.д.) 
		//—двиг влево = умножение.
		//≈сть одно Ќќ: при делении таким образом нечетного числа, погрешность состовл€ет 0.5.
		//“.е. 5 : 2 = 2 (а не 2,5); 9 : 2 = 4 ( а не 4,5) — четными числами такого нет.
		c = (byte) (a >> 1); // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),Integer.toBinaryString(c));
		
		a = (byte)-5;
		c = (byte) (a >> 1); // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),Integer.toBinaryString(c));
		
		//Ћогический сдвиг вправо)
		//сдвигает первый операнд, в двоичном представлении число бит вправо, указанной вторым операндом,
		//отбрасыва€ смещенные биты, переводит в нули слева.
		a = 5;
		c = (byte) (a >>> 1); // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n",(byte) a,(byte) c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),	Integer.toBinaryString(c));
		
		a = -5;
		c = (byte) (a >>> 1); // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n", (byte)a, (byte)c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("\n***** Assignment Operators *****"); // ќператоры присваивани€
		System.out.println("---------------------------------------------------------------------------------------");
		
		c = 7;
		System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
		System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
			
		System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
		
		System.out.println("---------------------------------------------------------------------------------------");		
		System.out.println("***** Relational Operators *****");
		System.out.println("---------------------------------------------------------------------------------------");		
		
		// greater than
		System.out.printf("%d > %d --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%d < %d --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		// equal to
		System.out.printf("%d == %d --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%d != %d --> %b\n", a, b, a != b);
		
		System.out.println("---------------------------------------------------------------------------------------");		
		System.out.println("***** Logical Operations *****");
		System.out.println("---------------------------------------------------------------------------------------");		
		
		// logical AND
		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
		(a > b) && (a > 0));
		// bitwise logical AND
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
		(a > b) & (a > 0));
		// logical OR
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
		(a >= b) || (b != 0));
		// bitwise logical OR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
		(a >= b) | (b != 0));
		
		// logical XOR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
		
		// logical NOT
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
		
		System.out.println("---------------------------------------------------------------------------------------");		
		System.out.println("***** Misc Operators *****");
		System.out.println("---------------------------------------------------------------------------------------");		
		System.out.println("\nCondition Operator:");
		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
		(a > b ? a : b));
		System.out.println("\nType Cast Operator:");
		byte bt = 1;
		short sh = -32000;
		char ch = '\u0002';
		long l = 100000000000000000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;
		c = bt;
		System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
		c = sh;
		System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
		c = ch;
		System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
		c = (int) l;
		System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
		c = (int) f;
		System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
		c = (int) d;
		System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
		// c = (int)bool;
		System.out.printf("int = boolean: c = (int)%b --> Compile Error\n",	bool);
	}
	
	public static void testShort() {}
	
	public static void testChar() {}
	
	public static void testInt() {
		int a = 5, b = 2, c = 0;
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("***** Arithmetical Operators *****");
		System.out.println("---------------------------------------------------------------------------------------");
		
		c = a + b; // addition
		System.out.printf("%d + %d = %d\n", a, b, c);
		
		c = a - b; // subtraction
		System.out.printf("%d - %d = %d\n", a, b, c);
		
		c = a / b; 	// division
		System.out.printf("%d / %d = %d\n", a, b, c);
	
		c = a % b; 	//remainder (modulus)
		System.out.printf("%d %% %d = %d\n", a, b, c);
		
		a = 5;
		c = -a; // unary minus 
		System.out.printf("-%d = %d\n", a, c);
		
		c = +a; // unary plus 
		System.out.printf("+%d = %d\n", a, c);
		
		a = 5; // prefix increment (++a)
		System.out.printf("++%d = %d\n", a, ++a);
		
		a = 5; // postfix increment (a++)
		System.out.printf("%d++ = %d\n", a, a++);
		
		a = 5; // prefix decrement (--a)
		System.out.printf("--%d = %d\n", a, --a);
		
		a = 5; // postfix decrement (a--)
		System.out.printf("%d-- = %d\n", a, a--);
		
		System.out.println("---------------------------------------------------------------------------------------");		
		System.out.println("***** Bitwise Operators *****"); // ѕобитовые операторы
		System.out.println("---------------------------------------------------------------------------------------");
		
		c = a & b;  // bitwise AND
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		c = a | b; // bitwise OR
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		c = a ^ b; // bitwise XOR
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		c = ~a; // bitwise unary compliment
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		c = a << 1; // left shift
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),Integer.toBinaryString(c));
		
		//—двиг на один бит вправо = деление на 2 (на 2 бита=/4, 3 бита=/8 и т.д.) 
		//—двиг влево = умножение.
		//≈сть одно Ќќ: при делении таким образом нечетного числа, погрешность состовл€ет 0.5.
		//“.е. 5 : 2 = 2 (а не 2,5); 9 : 2 = 4 ( а не 4,5) — четными числами такого нет.
		c = a >> 1; // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),Integer.toBinaryString(c));
		
		a = -5;
		c = a >> 1; // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),Integer.toBinaryString(c));
		
		//Ћогический сдвиг вправо)
		//сдвигает первый операнд, в двоичном представлении число бит вправо, указанной вторым операндом,
		//отбрасыва€ смещенные биты, переводит в нули слева.
		a = 5;
		c = a >>> 1; // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),	Integer.toBinaryString(c));
		
		a = -5;
		c = a >>> 1; // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("\n***** Assignment Operators *****"); // ќператоры присваивани€
		System.out.println("---------------------------------------------------------------------------------------");
		
		c = 7;
		System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
		System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
			
		System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
		
		System.out.println("---------------------------------------------------------------------------------------");		
		System.out.println("***** Relational Operators *****");
		System.out.println("---------------------------------------------------------------------------------------");		
		
		// greater than
		System.out.printf("%d > %d --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%d < %d --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		// equal to
		System.out.printf("%d == %d --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%d != %d --> %b\n", a, b, a != b);
		
		System.out.println("---------------------------------------------------------------------------------------");		
		System.out.println("***** Logical Operations *****");
		System.out.println("---------------------------------------------------------------------------------------");		
		
		// logical AND
		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
		(a > b) && (a > 0));
		// bitwise logical AND
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
		(a > b) & (a > 0));
		// logical OR
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
		(a >= b) || (b != 0));
		// bitwise logical OR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
		(a >= b) | (b != 0));
		
		// logical XOR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
		
		// logical NOT
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
		
		System.out.println("---------------------------------------------------------------------------------------");		
		System.out.println("***** Misc Operators *****");
		System.out.println("---------------------------------------------------------------------------------------");		
		System.out.println("\nCondition Operator:");
		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
		(a > b ? a : b));
		System.out.println("\nType Cast Operator:");
		byte bt = 1;
		short sh = -32000;
		char ch = '\u0002';
		long l = 100000000000000000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;
		c = bt;
		System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
		c = sh;
		System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
		c = ch;
		System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
		c = (int) l;
		System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
		c = (int) f;
		System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
		c = (int) d;
		System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
		// c = (int)bool;
		System.out.printf("int = boolean: c = (int)%b --> Compile Error\n",	bool);
		
	}
	

	public static void testBoolean() {
		boolean a = true, b = false, c;
		
		System.out.println("---------------------------------------------------------------------------------------");		
		System.out.println("***** Bitwise Operators *****");
		System.out.println("---------------------------------------------------------------------------------------");		
		
		c = a & b; // bitwise AND
		System.out.printf("%b & %b = %b\n", a, b, c);
		c = a | b; // bitwise OR
		System.out.printf("%b | %b = %b\n", a, b, c);
		c = a ^ b; // bitwise XOR
		System.out.printf("%b ^ %b = %b\n", a, b, c);
		
		System.out.println("---------------------------------------------------------------------------------------");		
		System.out.println("***** Assignment Operators *****");
		System.out.println("---------------------------------------------------------------------------------------");		
		
		System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
		System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
		System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);
		
		System.out.println("---------------------------------------------------------------------------------------");	
		System.out.println("***** Relational Operators *****");
		System.out.println("---------------------------------------------------------------------------------------");	
		
		System.out.printf("%b == %b --> %b\n", a, b, a == b);// equal to
		
		System.out.printf("%b != %b --> %b\n", a, b, a != b); // not equal to
		
		System.out.println("---------------------------------------------------------------------------------------");	
		System.out.println("***** Logical Operations *****");
		System.out.println("---------------------------------------------------------------------------------------");	
		
		c = a && b; // logical AND
		System.out.printf("%b && %b = %b\n", a, b, c);
		c = a || b; // logical OR
		System.out.printf("%b || %b = %d\n", a, b, c);
		c = a ^ b; // logical XOR
		System.out.printf("%b ^ %b = %b\n", a, b, c);
		// logical NOT
		System.out.printf("!%b --> %b\n", a, !a);
		
		System.out.println("---------------------------------------------------------------------------------------");	
		System.out.println("***** Misc Operators *****");
		System.out.println("---------------------------------------------------------------------------------------");	
		
		System.out.println("\nCondition Operator:");
		System.out.printf(" %b ? %b : %b --> %b\n", c, a, b, (c ? a : b));
		System.out.println("\nType Cast Operator:");
		// «начение типа boolean нельз€ преобразовать ни к какому типу, а также его	нельз€ получить ни из какого типа.
		System.out.printf("int = boolean: c = (int)%b --> Compile Error\n");
	}
		
}
