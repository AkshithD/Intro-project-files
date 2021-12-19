/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author:Akshith Dandemraju 
 * NET ID: acd218
 * Email: acd218@scarletmail.rutgers.edu
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {

        int n=Integer.parseInt(args[0]);
        int x= 0;
        int y=0;
        int i = 0;
        System.out.println("("+x+","+y+")");
        while(i<n){
            double var=Math.random();
            if(var>0.25){
                x++;
            }else if((0.25< var) && (var <0.5)){
                x--;
            }else if((0.5< var) && (var <0.75)){
                y++;
            }else{
                y--;
            }
            System.out.println("("+x+","+y+")");
            i++;
        }
        double Squared_distance= (Math.pow(x,2)+Math.pow(y,2));
        System.out.println("Squared distance = " + Squared_distance);
    }
}
