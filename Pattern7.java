package fundamentals;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int i=1;
		int c=1;
		while(i<=n) {
			c=i;
			int j=1;
			while(j<=i) {
				
			System.out.print(c+" ");
			j++;
			c++;
		}
			System.out.println();
			i++;
	}


	}

}
