package week1.day2;

public class Calculator {
int a=30;
int b=20;
int c=10;
int sum=a+b+c;
int sub=a-b;
double d=45.21d;
double e=75.21d;
double mul=d*e;
float f=50f;
float g=2;
float div=f/g;
public void sum()
{
	System.out.println("sum is:"+sum);
}
public void sub()
{
	System.out.println("sub is:"+sub);
}
public void mul()
{
	System.out.println("mul is:"+mul);
}
public void div()
{
	System.out.println("div is:"+div);
}
public static void main(String[]args){
	Calculator maths=new Calculator();
	maths.sum();
maths.sub();
maths.mul();
maths.div();
}
}