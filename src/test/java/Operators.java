package test.java;

public class Operators {

	public static void main(String[] args) {
		
		
	/*
	 * 	//Arithmetic operators
	      int a,b;
	      a=5;
          b=3;
	   System.out.println("Sum:"+(a+b));
	   System.out.println("Difference:"+(a-b));
	   System.out.println("Product:"+(a*b));
	   System.out.println("Quotient:"+(a/b));
	   System.out.println("Remainder:"+(a%b));
	 * 
	 * 
	 *  //Relational operators
	   int a=5,b=2;
	  System.out.println(a<b);
	    System.out.println(a<=b);
	   System.out.println(a>b);
	   System.out.println(a>=b);
	   System.out.println(a!=b);
	   System.out.println(a==b);
	 * 	
	 * 
	 * //Assignment operators
		  int a=5,b=2;
		     System.out.println(a+=b); //a=7
	         System.out.println(a-=b); //a=5    
	        System.out.println(a%=b);  //a=5    
	        System.out.println(a&=b); //a=5  
	        
	        //BitWise
		
		 int a=5,b=2;
	     System.out.println(a&b);
	     
	     System.out.println(a&b);
	      System.out.println(a|b);
	       System.out.println(a^b);  
	       System.out.println(a<<b);
	       
	          //Conditional operator
	    int a=5,b=2,max;
	     max=(a>b)?a:b;
	     System.out.println(max);
	     
	     //Conditional operator
     int a=1,b=2,c=6,max;
     max=(((a>b)?a:b)>c)?((a>b)?a:b):c;
     System.out.println(max);

    int a=5,b=30,c=10,max;
	     
	     max = (a>b && a>c) ? a : ((b>a && b>c)?b:c);
	     System.out.println(max);
	     
	        //Unary operators
	 int a=5;
	   System.out.println(~a);//a=-6
      System.out.println(++a);//a=6
	   System.out.println(a++);//a=7
	   System.out.println(--a);//a=6
	  System.out.println(a--);//a=5
	  		  
	     		
	 */
	/*	//Task 
	  int a=1,b=2,c=3;
			int  d=a+b*c++;
			 System.out.println(d);    //d=7
			 
	 
	 	int a=1,b=2,c=3;
		 int d=a+b*++c;
		 System.out.println(d);  //d=9
		 
		 int a=10,b=5;
				int  c=a+(~b+1);
				
				 System.out.println(c); //c=5
				 
      	int a=10;
		System.out.println(a<<3);  //a=80
		System.out.println(a>>3);   //a=1
		
		System.out.println(a>>>3);  //a=a				 
     */

	   int a=-10;
	   System.out.println(a<<3);  //a=-80
	   System.out.println(a>>3);  //a=-2
	   System.out.println(a>>>3);  //a=536870910
		
		


	}

}
