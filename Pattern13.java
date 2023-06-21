package fundamentals;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n){
			int j=1;
			//c=n;
			while(j<=n-i+1){
				System.out.print(n-i+1);
				j++;
				
			}
			System.out.println();
			i++;
		}



	}

}
