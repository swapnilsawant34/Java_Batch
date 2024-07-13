package com.arrays;

import java.util.Scanner;

public class PrimitiveDemo {

static void modify(int x,int y)
{
x=x+10;
y=y*5;
System.out.println("in the modify method a="+x +"  b="+y);
}

public static void main(String[] args) {

int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("enter 2 numbers");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("before calling method a="+a +"  b="+b);
modify(a,b);
 System.out.println("after calling method a="+a +"  b="+b);


}

}
