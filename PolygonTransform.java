/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author:Akshith Dandemraju
 * acd218@scarletmail.rutgers.edu
 * acd218
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {
    double [] copyarray= new double [array.length];
	for(int i=0; i<array.length; i++){
        copyarray[i]=array[i];
    }
    return copyarray;

    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {

	// WRITE YOUR CODE HERE
    for(int i =0;i<x.length;i++){
        x[i]=x[i]*alpha;
    }
    for(int i =0;i<y.length;i++){
        y[i]=y[i]*alpha;
    }
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {

	// WRITE YOUR CODE HERE
    for(int i=0;i<x.length;i++){
        x[i]=x[i]+dx;
    }
    for(int i=0;i<y.length;i++){
        y[i]=y[i]+dy;
    }
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {

        
            for(int i=0; i<y.length;i++){
           double temp= y[i]; 
           y[i]=y[i]*Math.cos(Math.toRadians(theta))+x[i]*Math.sin(Math.toRadians(theta)); 
           x[i]=x[i]*Math.cos(Math.toRadians(theta))-temp*Math.sin(Math.toRadians(theta));  
        }
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {
        double []array= {1,2,3,5,6};
        for (int i=0; i< array.length; i++){
        System.out.println(copy(array)[i]);
    }
        
    }
}
