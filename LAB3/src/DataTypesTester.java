
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
		System.out.println("***** Bitwise Operators *****"); // Побитовые операторы
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
		
		//Сдвиг на один бит вправо = деление на 2 (на 2 бита=/4, 3 бита=/8 и т.д.) 
		//Сдвиг влево = умножение.
		//Есть одно НО: при делении таким образом нечетного числа, погрешность состовляет 0.5.
		//Т.е. 5 : 2 = 2 (а не 2,5); 9 : 2 = 4 ( а не 4,5) С четными числами такого нет.
		c = (byte) (a >> 1); // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),Integer.toBinaryString(c));
		
		a = (byte)-5;
		c = (byte) (a >> 1); // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),Integer.toBinaryString(c));
		
//		Логический сдвиг вправо)
//		сдвигает первый операнд, в двоичном представлении число бит вправо, указанной вторым операндом,
//		отбрасывая смещенные биты, переводит в нули слева.
		a = (byte) 5;
		c = (byte) (a >>> 1); // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n",(byte) a,(byte) c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),	Integer.toBinaryString(c));
		
		a = (byte)-5;
		c = (byte) (a >>> 1); // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n", (byte)a, (byte)c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("\n***** Assignment Operators *****"); // Операторы присваивания
		System.out.println("---------------------------------------------------------------------------------------");
		
		c =(byte) 7;
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
//		
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
		int it = 2147483647;
		short sh = -32000;
		char ch = '\u0002';
		long l = 100000000000000000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;
		c = (byte) it;
		System.out.printf("byte = int: c = %d --> c = %d\n", it, c);
		c = (byte)sh;
		System.out.printf("byte = short: c = %d --> c = %d\n", sh, c);
		c = (byte)ch;
		System.out.printf("byte = char: c = '%c' --> c = %d\n", ch, c);
		c = (byte) l;
		System.out.printf("byte = long: c = (byte)%d --> c = %d\n", l, c);
		c = (byte) f;
		System.out.printf("byte = float: c = (byte)%f --> c = %d\n", f, c);
		c = (byte) d;
		System.out.printf("byte = double: c = (byte)%f --> c = %d\n", d, c);
		// c = (int)bool;
		System.out.printf("byte = boolean: c = (byte)%b --> Compile Error\n",	bool);
	}
	

	public static void testShort() {
		// Представляет собой 16-разрядный знаковый целый примитивный тип данных. 
		//Его диапазон – от -32768 до 32767). 
		short a = 5, b = 2, c = 0;
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("***** Arithmetical Operators *****");
		System.out.println("---------------------------------------------------------------------------------------");
		
		c = (short) (a + b); // addition
		System.out.printf("%d + %d = %d\n", a, b, c);
		
		c = (short) (a - b); // subtraction
		System.out.printf("%d - %d = %d\n", a, b, c);
		
		c = (short) (a / b); 	// division
		System.out.printf("%d / %d = %d\n", a, b, c);
	
		c = (short) (a % b); 	//remainder (modulus)
		System.out.printf("%d %% %d = %d\n", a, b, c);
		
		a =(short) 5;
		c = (short) -a; // unary minus 
		System.out.printf("-%d = %d\n", a, c);
		
		c = (short) +a; // unary plus 
		System.out.printf("+%d = %d\n", a, c);
		
		a =(short) 5; // prefix increment (++a)
		System.out.printf("++%d = %d\n", (short) a,(short) ++a);
		
		a = (short)5; // postfix increment (a++)
		System.out.printf("%d++ = %d\n",(short) a,(short) a++);
		
		a = (short)5; // prefix decrement (--a)
		System.out.printf("--%d = %d\n", (short)a, (short)--a);
		
		a = (short)5; // postfix decrement (a--)
		System.out.printf("%d-- = %d\n",(short) a, (short)a--);
		
		System.out.println("---------------------------------------------------------------------------------------");		
		System.out.println("***** Bitwise Operators *****"); // Побитовые операторы
		System.out.println("---------------------------------------------------------------------------------------");
		
		c = (short) (a & b);  // bitwise AND
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		c = (short) (a | b); // bitwise OR
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		c = (short) (a ^ b); // bitwise XOR
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		c = (short) ~a; // bitwise unary compliment
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		c = (short) (a << 1); // left shift
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),Integer.toBinaryString(c));
		
		//Сдвиг на один бит вправо = деление на 2 (на 2 бита=/4, 3 бита=/8 и т.д.) 
		//Сдвиг влево = умножение.
		//Есть одно НО: при делении таким образом нечетного числа, погрешность состовляет 0.5.
		//Т.е. 5 : 2 = 2 (а не 2,5); 9 : 2 = 4 ( а не 4,5) С четными числами такого нет.
		c = (short) (a >> 1); // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),Integer.toBinaryString(c));
		
		a = (short)-5;
		c = (short) (a >> 1); // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),Integer.toBinaryString(c));
		
//		Логический сдвиг вправо)
//		сдвигает первый операнд, в двоичном представлении число бит вправо, указанной вторым операндом,
//		отбрасывая смещенные биты, переводит в нули слева.
		a = (short) 5;
		c = (short) (a >>> 1); // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n",(byte) a,(byte) c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),	Integer.toBinaryString(c));
		
		a = (short)-5;
		c = (short) (a >>> 1); // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n", (byte)a, (byte)c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("\n***** Assignment Operators *****"); // Операторы присваивания
		System.out.println("---------------------------------------------------------------------------------------");
		
		c =(short) 7;
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
//		
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
		int it = 2147483647;
		byte sh = 127;
		char ch = '\u0002';
		long l = 100000000000000000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;
		c = (short) it;
		System.out.printf("short = int: c = %d --> c = %d\n", it, c);
		c = (short)sh;
		System.out.printf("short = byte: c = %d --> c = %d\n", sh, c);
		c = (short)ch;
		System.out.printf("short = char: c = '%c' --> c = %d\n", ch, c);
		c = (short) l;
		System.out.printf("short = long: c = (byte)%d --> c = %d\n", l, c);
		c = (short) f;
		System.out.printf("short = float: c = (byte)%f --> c = %d\n", f, c);
		c = (short) d;
		System.out.printf("short = double: c = (byte)%f --> c = %d\n", d, c);
		// c = (int)bool;
		System.out.printf("short = boolean: c = (byte)%b --> Compile Error\n",	bool);
	}
	
	
	public static void testChar() {
		//Char является 16-разрядным беззнаковым примитивным типом данных, 
//		который представляет символ Юникода. Отсутствие знака означает, 
//		что переменная не может иметь отрицательное значение. Диапазон – от 0 до 65535,
//		что совпадает с кодировкой набора символов Юникода. Литерал представляет значение char и может быть выражен в таких формах: 
//		символ, заключенный в одинарные кавычки;
//		последовательность управляющих символов;
//		последовательность управляющих символов юникода; 
//		последовательность восьмеричных управляющих символов.
		
		char a = '5', b = '2', c = '0'; //Код '5'= 53, '2'= 50,  '0'= 48
		int result=0;
		System.out.println((char)a);
		System.out.println((char)b);
		System.out.println((char)c);
		
		//char переводится в int и тут складываются коды 'b' и 'c'. Результат, естественно типа  int (он и печатается).
		 System.out.println("'5' + '2'--> "+ (a + b));
		 System.out.println("'5' - '2'--> "+ (a - b));
		 System.out.println("'5' / '2'--> "+ ('a' / 'b'));
		 System.out.println("'5' * '2'--> "+ ('a' * 'b'));
		 
		result = (a + b); // addition
		System.out.printf("%c + %c = %d\n", a, b, result);
			
		result = (a - b); // subtraction
		System.out.printf("%c - %c = %d\n", a, b, result);
			
		result= (char) (a / b); 	// division
		System.out.printf("%c / %c = %d\n", a, b, result);
		
		result = (char) (a % b); 	//remainder (modulus)
		System.out.printf("%c %% %c = %d\n", a, b, result);
	

		//Сравнение позиции символа в Unicode-таблице
		boolean b1 = (a < b); 
		System.out.println("'5' < '2'--> " + b1);
		
		//Записываем в переменную символ, которому соответствует номер в Unicode-таблице
		a = (char) 122;
		System.out.println(a);
	}
	
	
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
		System.out.println("***** Bitwise Operators *****"); // Побитовые операторы
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
		
		//Сдвиг на один бит вправо = деление на 2 (на 2 бита=/4, 3 бита=/8 и т.д.) 
		//Сдвиг влево = умножение.
		//Есть одно НО: при делении таким образом нечетного числа, погрешность состовляет 0.5.
		//Т.е. 5 : 2 = 2 (а не 2,5); 9 : 2 = 4 ( а не 4,5) С четными числами такого нет.
		c = a >> 1; // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),Integer.toBinaryString(c));
		
		a = -5;
		c = a >> 1; // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),Integer.toBinaryString(c));
		
		//Логический сдвиг вправо)
		//сдвигает первый операнд, в двоичном представлении число бит вправо, указанной вторым операндом,
		//отбрасывая смещенные биты, переводит в нули слева.
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
		System.out.println("\n***** Assignment Operators *****"); // Операторы присваивания
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
		// Значение типа boolean нельзя преобразовать ни к какому типу, а также его	нельзя получить ни из какого типа.
		System.out.printf("int = boolean: c = (int)%b --> Compile Error\n");
	}
		
}
