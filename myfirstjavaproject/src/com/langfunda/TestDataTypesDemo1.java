package com.langfunda;

//JVM provides default values for instance & static variables 
//byte --> short --> int --> long --> float --> double 
public class TestDataTypesDemo1 {

//	byte range : -128 to 127 
//	If we give more than byte value then it throws compile time error.
//	CE : Type mismatch: cannot convert from int to byte
//	By default RHS Numeric value is : int 

//	Type Casting : Converting one data type values into another data types.
//	In Java, we have two types of Casting 
//		i) Implicit Type Casting  : Converting Low Data Type values to High data Type values
//	will convert internally will consider as Implicit type casting, Here we no need to do explicitly.

//	    ii) Explicit Type Casting : Converting High data types values to Low Data Types 
//			where we need to do Explicit casting with LHS Data type.

	// -128 -127 -126 .......0 1 2 3......127
	byte b = (byte) 257;// Explicit Type Casting

	short s = b;// byte value is storing into short : Converting byte to short, this example
				// will consider as Implicit Type Casting.

//	Range of Short is : -32768 to 32767
//	Type mismatch: cannot convert from int to short
	short s1 = (short) 65535;// Explicit Type Casting

	int i = s1;// Short to int : Implicit Type casting
	int i1 = (int) 2147483648L;// CE: The literal 2147483648 of type int is out of range

	long l = i;// int can convert to long : Implicit Type casting
//	Whenever we want to represent more than int values in long then we must need to specify L or l at the end.
	long l1 = 9223372036854775807L;

	long l2 = 9223372036854775807L;

//	-3.4e38  (3.4*10^(38)) to 3.4e^38
	float f = l1;// long to float : Implicit Type Casting

//	Whenever we want to Represent floating point data, we must need to Specify F at the end.
	float f1 = 5.65676478765465F;

//	-1.7e308 --> 1.7e^308
	double d = 5.65676478765465;// By default RHS Decimal values are double
	double d1 = f1;// Implicit Type casting

	// char 2 bytes --> 0 to 65535
	char c = 'M';// Single quotes characters
	char c1 = 6667;// ASCII code --> A=65 B=66......Z=90 & a=97 b=98 ....z=122
	char c2 = '\u0021';// Unicode characters

	int i3 = 'A';
	int i4 = '\u0021';

	float f3 = 'A';

	boolean boo = true;

	int i5 = 2147483647;//The literal 2147483648 of type int is out of range 
	float f5 = 2147.4836478754F;//
	
//	all are invalid
//	boolean b3 = 'true';
//	boolean b4 = "true";
//	boolean b5 = True;
//	boolean b6 = TRUE;
//	boolean b7 = FALSE;
//	boolean b8 = 0;
//	boolean b9 = 1;

	public static void main(String[] args) {
		System.out.println("main method started ");
		TestDataTypesDemo1 t1 = new TestDataTypesDemo1();

		System.out.println("byte value : " + t1.b);// 0
		System.out.println("short value : " + t1.s);// 0
		System.out.println("short value : " + t1.s1);// 0

		System.out.println("int value : " + t1.i);// 0
		System.out.println("int value : " + t1.i1);// 0
		System.out.println("int value : " + t1.i3);// 0

		System.out.println("long vlaue : " + t1.l);// 0
		System.out.println("long vlaue : " + t1.l1);// 0

		System.out.println("float value : " + t1.f);// 0.0
		System.out.println("float value : " + t1.f3);// 0.0

		System.out.println("float value : " + t1.f1);// 0.0
		System.out.println("double value : " + t1.d);// 0.0
		System.out.println("double value : " + t1.d1);// 0.0

		System.out.println("char value : " + t1.c);//
		System.out.println("char value : " + t1.c1);//
		System.out.println("char value : " + t1.c2);//
		System.out.println("boolean value : " + t1.boo);// false
		
		System.out.println(t1.f5);
		System.out.println(t1.i5);

	}

}
