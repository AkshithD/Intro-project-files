/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author:Akshith Dandemraju
 * acd218@scarletmail.rutgers.edu
 * acd218
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 2
 *  true
 *************************************************************************/

public class FindDuplicate {

    public static void main(String[] args) {
		int numValues = args.length;   
		boolean isDuplicate = false;  
		 int[] arr = new int[numValues] ;
		for (int i=0; i< numValues; i++){
			arr[i]= Integer.parseInt(args[i]);
		}
		 for (int i = 0; i < numValues; i++){        
			for (int j = i-1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                }
            }
        }
        System.out.println(isDuplicate);
				
		 }
		
}