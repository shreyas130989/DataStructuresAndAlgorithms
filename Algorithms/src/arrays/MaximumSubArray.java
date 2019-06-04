package arrays;

public class MaximumSubArray {

	public static void main(String[] args) {
		MaximumSubArray maximumSubArray = new MaximumSubArray();
		int[] input = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println(maximumSubArray.maxSubArray(input));
	}
	
	//Sample input [-2,1,-3,4,-1,2,1,-5,4]
	public int maxSubArray(int[] a) {
		int current_max = a[0];
		int max_soFar = a[0];
		for(int i =1; i< a.length; i++) {
			current_max = Math.max(a[i], a[i] + current_max);
			max_soFar = Math.max(max_soFar, current_max);
		}
		return max_soFar;
	}
}

