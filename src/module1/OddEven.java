package module1;//Java Program to Check Whether a Number is Even or Odd
import java.util.Scanner;
public class OddEven {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number:");
	int number=scanner.nextInt();
	if(number%2==0) {
		System.out.println("given number is even");
		}
	else
	{
		System.out.println("given number is odd");
			
	}
}
}
