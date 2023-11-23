package module1;//Java Program to Find the Largest Among Three Numbers
import java.util.Scanner;
public class LargestAmong3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st num:");
		int n1=sc.nextInt();
		System.out.println("enter the 2nd num:");
		int n2=sc.nextInt();
		System.out.println("enter the 3rd num:");
		int n3=sc.nextInt();
		int largest =0;
		if(n1>n2) {
			largest=n1;
		}else if {
			largest=n2;
		}
		else(n3>largest) {
			largest=n3;
			}
		System.out.println("the largest among these three is :"+largest);	
		
	}

}
