package arrays;

public class KthMissingElement {
	
	public int findTheMissingElement(int[] input, int k, int l, int r) {
		int middle = l+ (r-1)/2;
		if (r>=l) {
			int diff = input[middle] - input[l] + 1;
			int index_diff = middle - l + 1;
			
			if((diff-index_diff) <= k) {
				findTheMissingElement(input, k, l,middle-1);
			} else {
				findTheMissingElement(input, k, middle+1,r);
			}
		}
		return 0;
	}

}
