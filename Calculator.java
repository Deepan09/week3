package week3.day1;

public class Calculator {

	
public void addition(int a,int b)	
{
	int c=a+b;
	System.out.println("addition of two integers: " +c);
}
	
public void addition(int a,int b, int c)	
{
	int d=a+b+c;
	System.out.println("addition of three integers: " +d);
	
}
		
	public void multiply(int a,int b)	
{
	int c=a*b;
	System.out.println("product of two integers: " +c);
}
		
public void multiply(int a,double b)	
{
	double c=a*b;
	System.out.println("addition of one integer and one double: " +c);
	
}
		
public void subtration(int a,int b)	
{
	int c=a-b;
	System.out.println("subtraction of two integers: " +c);
}
		
public void subtraction(int a,double b)	
{
	double c=a-b;
	System.out.println("subtraction of one integer and one double: " +c);
}
		
public void divsion(int a,int b)	
{
	int c=a/b;
	System.out.println("division of two integers: " +c);
}
		
public void division(int a,double b)	
{
	double c=a/b;
	System.out.println("division of one integer and a double: " +c);
}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator obj =new Calculator();
obj.addition(4, 7);
obj.division(4, 4.70);
obj.addition(3, 40, 6);
obj.divsion(4, 2);
obj.multiply(4, 7);
obj.multiply(5, 6.9);
obj.subtraction(7, 2);
obj.subtraction(8, 2.6);
	}

}
