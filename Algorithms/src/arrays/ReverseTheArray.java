package arrays;

import java.util.Arrays;

public class ReverseTheArray {

	public static void main(String[] args) {
		int[] inputArray = {1,2,3,4};
		reverseArray(inputArray);
		Arrays.sort(inputArray);
	}
	public static void reverseArray(int[] validData) {
	for(int i = 0; i < validData.length / 2; i++)
	{
	    int temp = validData[i];
	    validData[i] = validData[validData.length - i - 1];
	    validData[validData.length - i - 1] = temp;
	}
	for(int i =0; i<validData.length; i++) {
		System.out.print(validData[i]);
	}
	}
}
