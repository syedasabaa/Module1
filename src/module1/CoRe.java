package module1;//Java Program to Compute Quotient and Remainder
import java.util.Scanner;
public class CoRe {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num1 :");
		int num1=sc.nextInt();
		System.out.println("enter the num2 :");
		int num2=sc.nextInt();
		int quotient=num1/num2;
		int reminder=num1%num2;
		System.out.println("the quotient is :"+quotient);
		System.out.println("the remainder is:"+reminder);	
		
	}

}
