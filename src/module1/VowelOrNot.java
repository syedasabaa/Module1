package module1;//Java Program to Check Whether an Alphabet is Vowel or Consonant
import java.util.Scanner;
public class VowelOrNot {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter character:");
		char c=obj.next().charAt(0);
		if(c>='a'&&c<='z'||c>='A'&&c<='Z') {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
					c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				System.out.println("given character is vowel");
			}
			else {
		
				System.out.println("given character is consonant");
		}
		}
		else {
				System.out.println("invalid character");
		}	
	}
}
