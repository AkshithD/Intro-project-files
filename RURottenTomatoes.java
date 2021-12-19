/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author:Akshith Dandemraju
 * acd218@scarletmail.rutgers.edu
 * acd218
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {

		int a= Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		int p=2;
		int sum=0;
		int o=0;
		int answer=0;
		int[][] arr= new int [a][b];
		for(int i =0; i<a; i++){
			for(int j=0; j<b; j++){
				arr[i][j]= Integer.parseInt(args[p]);
				p++;
			}
		}
		for(int i=0; i<b; i++){
            for(int j=0;j<a;j++){
                sum=sum+arr[j][i];

            }
	
	

        if(sum>o){
            o=sum;
            answer=i;
        }
        sum=0;
        }

		System.out.println(answer);

	}
}
