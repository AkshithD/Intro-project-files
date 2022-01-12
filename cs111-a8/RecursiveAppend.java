/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author:
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) {
        if(n==0){
            return original;
        }else{
            System.out.print(original);
            return appendNTimes(original,n-1);
        }
	
    }

    public static void main (String[] args) {
        appendNTimes ("cat",2);
	
    }
}
