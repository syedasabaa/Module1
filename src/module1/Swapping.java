package module1;//Java Program to Swap Two Numbers
//1st method with using temporary variable
import java.util.Scanner;
public class Swapping {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter num1: ");
	int num1=sc.nextInt();
	System.out.println("enter num2: ");
	int num2=sc.nextInt();
	System.out.println("before swapping :");
	System.out.println("number1 is :"+num1);
	System.out.println("number2 is :"+num2);
	int temp;
	temp=num1;
	num1=num2;
	num2=temp;
	System.out.println("--------------------------");
	System.out.println("after swapping:");
	System.out.println("number1 is "+num1);
	System.out.println("number2 is "+num2);
}
}
