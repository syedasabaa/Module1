package module1;
import java.util.Scanner;
public class Loop2 {
	
	public static void main(String[] args) {
		//do while
		Scanner obj=new Scanner(System.in);
		int number=0;
		
		do {
			System.out.println("enter the number:");
		    number=obj.nextInt();
		    System.out.print("your number is:");
			System.out.println(number);
		}while(number>=0);
		System.out.println("the end");
	}
}