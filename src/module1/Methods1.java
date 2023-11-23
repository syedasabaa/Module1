package module1;

public class Methods1 {
	public static void printName(String name) {
		System.out.println(name);
	}
	public static void printSum(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		printName("rachel");
		printName("green");
		printSum(5,1);
		printSum(7,2);
	}

}
