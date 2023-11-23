package module1;
import java.util.Arrays;
public class Array1 {
	public static void main(String[] args) {
		int[] marks=new int[3];
		marks[0]=90;
		marks[1]=54;
		marks[2]=100;
		System.out.println(marks[0]);//90
		//sort
		Arrays.sort(marks);// 54,90,100
		System.out.println(marks[0]);//54
		//1D array
		int[] marks1= {97,98,20};
		//2D array//storing 2 students marks in same array
		int[][] marks2=  {{60,54,30},{90,98,100}};
		//accessing 2D array
		System.out.println(marks2[0][0]);//60
		System.out.println(marks2[0][3]);//30
		System.out.println(marks2[1][1]);//90
		System.out.println(marks2[1][3]);//100	
		
	}

}
