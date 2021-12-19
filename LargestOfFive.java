/*************************************************************************
 *  Compilation:  javac LargestOfFive.java
 *  Execution:    java LargestOfFive 35 10 32 1 8
 *
 *  @author:Akshith Dandemraju 
 * NET ID: acd218
 * Email: acd218@scarletmail.rutgers.edu
 *
 *  Takes five distinct integers as command-line arguments and prints the 
 *  largest value
 *
 *
 *  % java LargestOfFive 35 10 32 1 8
 *  35
 *
 *  Assume the inputs are 5 distinct integers.
 *  Print only the largest value, nothing else.
 *
 *************************************************************************/

public class LargestOfFive {

    public static void main (String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);
        int t=0;
        if (a>b){
            t = a;
        
        }else{
       t = b;
        }
        if (c>t){
          t=c;
        }
        if (d>t){
            t=d;
        
        }
        if (e>t){
            t=e;
        }
        System.out.println(t);
    }
}