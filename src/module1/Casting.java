package module1;
public class Casting {
 //1.implicit casting-storing smaller data type vale in bigger datatype-java allows this automatically
	public static void main(String[] args) {
	double price=30.5;
	double FinalPrice=price+18;
	System.out.println(FinalPrice);
	
//2.Explicit casting-storing of bigger datatype value into smaller datatypes
	int price1=30;
	int finalprice=price1+(int)18.1;
	System.out.println(finalprice);
	int age=30;
	age=31;
	age=32;
	//if final keyword is used we cant change the variable
	 final float PI=3.14F;
	 float PI=4.1F;//error
	 
	
	}
	
	
}
