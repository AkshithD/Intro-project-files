/*************************************************************************
 * Akshith Dandemraju
 * acd218@scarletmail.rutgers.edu
 * acd218
 *************************************************************************/

public class WindChill {
    public static void main(String[] args) {
        double T = Double.parseDouble(args[0]);
        double V = Double.parseDouble(args[1]);
        double W = 35.74 + 0.6215 *T + (0.4275*T-35.75) * Math.pow(V,0.16);
        System.out.println(W);
	
    }
}
