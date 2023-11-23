package module1;
//mini project
import java.util.Scanner;
public class MiniProject {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int myNumber=(int)(Math.random()*100);
		int userNumber=0;
		do {
			System.out.println("guess the number :");
			userNumber=scan.nextInt();
			if(userNumber==myNumber) {
				System.out.println("WOOH.....YOU GUESSED IT RIGHT);");
				break;
		       }
			else if(userNumber>myNumber) {
				System.out.println("your number is too big");
			}
			else {
				System.out.println("your number is too small");
			}
	}while(userNumber>=0);
		System.out.println("my number is:"+myNumber);
}
}
