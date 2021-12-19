/*************************************************************************
 *  Compilation:  javac Sierpinski.java
 *  Execution:    java Sierpinski
 *
 *  @author: Akshith Dandemraju
 *
 *************************************************************************/

public class Sierpinski {

    // Height of an equilateral triangle whose sides are of the specified length. 
    public static double height(double length) {

        double height=0;
        height= (Math.sqrt(3)*length)/2;
        return height;
    }

    // Draws a filled equilateral triangle whose bottom vertex is (x, y) 
    // of the specified side length. 
    public static void filledTriangle(double x, double y, double length) {
        double [] a= {x,x-(length/2), x+(length/2)};
        double [] b= {y, y+height(length), y+height(length)};
        StdDraw.filledPolygon(a, b);
	
    }

    // Draws a Sierpinski triangle of order n, such that the largest filled 
    // triangle has bottom vertex (x, y) and sides of the specified length. 
    public static void sierpinski(int n, double x, double y, double length) {
        if(n==1){
           filledTriangle(x, y, length);
        }
           else {
            filledTriangle(x, y, length);
           sierpinski(n-1, x-(length/2), y, length/2);
           sierpinski(n-1, x+(length/2), y, length/2);
           sierpinski(n-1, x, y+height(length), length/2);
        }
       }
    

    // Takes an integer command-line argument n; 
    // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
    public static void main(String[] args) {
        StdDraw.line(0.0, 0.0, 1.0, 0.0);   //making big triangle
        StdDraw.line(1.0, 0.0, 0.5, height(1));
        StdDraw.line(0.5, height(1), 0.0, 0.0);
        int n= Integer.parseInt(args[0]);
        sierpinski(n, 0.5, 0, 0.5);
      
    }
}
