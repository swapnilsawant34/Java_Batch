package test.java;

public class TypeCasting {

	public static void main(String[] args) {
		
		int a=130,b,x;
	byte c=20,d;
	float num=12345.45f;
	double num1=34.56;
	long var=1234567111115l;
	char ch='a';
	System.out.println("Implicit casting");
	b=c;
	System.out.println("byte assigned to int="+b);
	x=ch;
	System.out.println("char assigned to int="+x);
	System.out.println("Explicit casting");
	int y=65;
	char z=(char) y;
	System.out.println("integer assigned to char "+z);
	d=(byte) a;
	System.out.println("int assigned to byte "+d);
	  int i=(int) num1;
	System.out.println("double to int "+i);

	}

}
