/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author: Akshith Dandemraju 
 * NET ID: acd218
 * Email: acd218@scarletmail.rutgers.edu
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {

        long number = Long.parseLong(args[0]);
        long num1=number;
        long num2= number;
        int t=0;
        int sum=0;
        int v=0;
        int b=0;
        int a=0;
        int sum2=0;
        int answer=0;
        while(num1>0){
        t=(int) (num1 %10);
        
        num1= num1/ 100;
        sum=t+sum;
        } 
  
         b=sum%10;

         while(num2>0){
            num2=num2/10;
         v=(int)(num2%10);
         num2=num2/10;
         sum2=v+sum2;
        }
        a=sum2%10;
        a *= 3;
        a %=10;
        answer= b+a;
        answer %=10;
        System.out.println(answer);
    }
}