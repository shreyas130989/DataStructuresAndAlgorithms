package strings;

public class LongestCommonSubsequence {

	private int[][] subsequenceMatrix;
	
	public LongestCommonSubsequence(int row, int column) {
		this.subsequenceMatrix = new int[row][column];		
	}
	 
	public static void main(String args[]) {
		final String input1 = "ABCDGH";
		final String input2 = "AEDFHR";
		
		LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence(input1.length() + 1, input2.length() + 1);
		System.out.printf("longest common subsequence length is %d", longestCommonSubsequence.findLongestCommonSubsequence(input1, input2));
	}
	
	int findLongestCommonSubsequence(String input1, String input2) {
		char[] input1CharArray = input1.toCharArray();
		char[] input2CharArray = input2.toCharArray();
		int[][] subsequenceMatrix = new int[input1CharArray.length+1][input2CharArray.length +1];
		for(int i=0; i<=input1CharArray.length;i++) {
			for(int j=0; j<=input2CharArray.length;j++) {
				System.out.print(subsequenceMatrix[i][j]);
			}
			System.out.print("\n");
		}
		for(int i=0; i <=input1CharArray.length ; i++) {
			for (int j=0; j<=input2CharArray.length; j++) {
				if (i==0 || j==0) {
					subsequenceMatrix[i][j]=0;
				} else if (input2CharArray[i-1] == input1CharArray[j-1]) {
					subsequenceMatrix[i][j] = subsequenceMatrix[i-1][j-1] + 1;
				} else {
					subsequenceMatrix[i][j] = Math.max(subsequenceMatrix[i-1][j], subsequenceMatrix[i][j-1]);
				}
			}
		}
		System.out.println("After filling the common subsequence array\n");
		for(int i=0; i<=input1CharArray.length;i++) {
			for(int j=0; j<=input2CharArray.length;j++) {
				System.out.print(subsequenceMatrix[i][j]);
			}
			System.out.print("\n");
		}
		return subsequenceMatrix[input1CharArray.length][input2CharArray.length];
	}
	
	static void printMatrix(int[][] inputArray, int row, int col) {
		for(int i=0; i<row;i++) {
			for(int j=0; j<col;j++) {
				System.out.print(inputArray[i][j]);
			}
			System.out.print("\n");
		}
	}
}
