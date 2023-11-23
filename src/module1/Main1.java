package module1;
import java.util.Scanner;
public class Main1 {
	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("enter thetotal cash:");
	int cash=obj.nextInt();
	//System.out.println("enter thetotal cash:");
	if(cash<10) {
		System.out.println("cannot get anything");
		System.out.println("get more cash");
	
	}
	else if(cash>=10&&cash<=50) {
		System.out.println("can get only one thing");
	}
	else {
		System.out.println("can get both the thing");
	}
	}
	}


