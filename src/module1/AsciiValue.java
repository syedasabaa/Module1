package module1;//Java Program to Find ASCII Value of a character
//1st method
import java.util.Scanner;
public class AsciiValue {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the ur character:");
	char value=scan.next().charAt(0);
	int asciivalue=(int)value;
	System.out.println("asciivalue of given character "+value+" is: " +asciivalue);
    scan.close();
//method 2
char value1='a';
int asciivalue2=(int)value1;
System.out.println("asciivalue of "+value1+" is: "+asciivalue2);
}
}