/*************************************************************************
 * Akshith Dandemraju
 * acd218@scarletmail.rutgers.edu
 * acd218
 *************************************************************************/

public class OrderCheck {

    public static void main(String[] args) {

	int w = Integer.parseInt(args[0]);
    int x = Integer.parseInt(args[1]);
    int y = Integer.parseInt(args[2]);
	int z = Integer.parseInt(args[3]);

    Boolean inorder;

        inorder = w > x && x>y && y>z || w < x && x<y && y<z;
      

        System.out.println(inorder);
    }
}
