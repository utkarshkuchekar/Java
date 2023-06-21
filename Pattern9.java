package fundamentals;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		/*A
		 *BC
		 *CDE 
		 *DEFG
		 */
		
		while(i<=n) {
			char p =(char)('A'+i-1);
			int j=1;
			while(j<=i) {
				
			System.out.print(p);
			j++;
			p++;
			
		}
			System.out.println();
			i++;
	}


	}

}
