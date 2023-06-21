package fundamentals;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int c=1;
		while(i<=n){
			int spaces=1;
			c=1;
			while(spaces<=n-i){
				System.out.print(" ");
				spaces++;
			}
			int no=1;
			while(no<=i){
				System.out.print(c);
				no++;
				c++;
			}
			System.out.println();
			i++;
		}



	}

}
