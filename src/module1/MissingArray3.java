package module1;
import java.util.Arrays;
public class MissingArray3 {
	    public static void main(String[] args) {
	        // Example usage
	        int[] array = {0, 2, 4, 6, 7, 8, 9, 3};
	        System.out.println(array.length);
	        int missingNumber = findMissingNumber(array);
	        System.out.println("The missing number is: " + missingNumber);
	    }

	    // Function to find the missing number in an array of consecutive integers
	    public static int findMissingNumber(int[] array) {
	        // Sort the array
	        Arrays.sort(array);

	        // Check for the missing number
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] != i) {
	                return i;
	            }
	        }

	        // If no missing number is found, return the next number in the sequence
	        return array.length;
	    }
	}



