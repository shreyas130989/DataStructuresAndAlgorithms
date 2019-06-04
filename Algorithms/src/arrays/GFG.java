package arrays;

public class GFG {
    
   static int firstNonRepeating(int arr[], int n)
   {
       for (int i = 0; i < n; i++) {
           int j;
           for (j = 0; j < n; j++)
               if (i != j && arr[i] == arr[j])
                   break;
           if (j == n)
               return arr[i];
       }
        
       return -1;
   }
   
   //Driver code
   public static void main (String[] args)
   {
	   String s1 = "Shreyas";
	   String s2 = "Shreyas";
	   if(s2.equalsIgnoreCase(s1)) {
		   System.out.println(true);
	   } else {
		   System.out.println(false);
	   }
       int arr[] = { 1,3,3,1,2,5,2,7};
       int n = arr.length;
        
       System.out.print(firstNonRepeating(arr, n));
   }
}