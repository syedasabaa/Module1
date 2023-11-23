package module1;
public class MissingNumberFinder {
	    public static void main(String[] args) {
	        // Example usage
	        int[] array = {0, 2, 4, 6, 7, 8, 9, 3};
	        int missingNumber = findMissingNumber(array);
	        System.out.println("The missing number is: " + missingNumber);
	    }

	    // Function to find the missing number in an array of consecutive integers
	    public static int findMissingNumber(int[] array) {
	        // Calculate the sum of consecutive integers up to the length of the array
	        int n = array.length + 1;
	        int expectedSum = n * (n + 1) / 2;

	        // Calculate the sum of elements in the array
	        int actualSum = 0;
	        for (int num : array) {
	            actualSum += num;
	        }
	        // The difference is the missing number
	        return expectedSum - actualSum;
	    }
	}
