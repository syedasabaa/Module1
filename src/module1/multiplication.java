package module1;//Java Program to Multiply two Floating Point Numbers
import java.util.Scanner;
public class multiplication {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number1 to multiply:");
	float num1=sc.nextFloat();
	System.out.println("enter the number2 to multiply:");
	float num2=sc.nextFloat();
	float num3=num1*num2;
	System.out.println("the product is:" +num3);
}
}
