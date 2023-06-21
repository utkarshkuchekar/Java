package fundamentals;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int i=1;
		
		while(i<=n) {
			
			int j=1;
			while(j<=n) {
				char chaAtj=(char)('A'+j-1);
			System.out.print(chaAtj);
			j++;
			
		}
			System.out.println();
			i++;
	}


	}

}
