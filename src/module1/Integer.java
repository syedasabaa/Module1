package module1;//Java Program to Print an Integer (Entered by the User)
import java.util.Scanner;
public class Integer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer number:");
		int num=sc.nextInt();
		System.out.println("the number entered is"+num);		
	}
}
