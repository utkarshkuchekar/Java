package fundamentals;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		/*   *
		 *  **
		 * ***
		 * 
		 */
		while(i<=n){
	         int spaces=1;
	         
	         while(spaces<=n-i){
	             
	             System.out.print(" ");
	             spaces=spaces+1;
	         }
	         int stars=1;
	         while(stars<=i){
	             System.out.print('*');
	             stars=stars+1;
	         }
	         System.out.println();
	         i=i+1;
	     }
		
	
	}
	}


