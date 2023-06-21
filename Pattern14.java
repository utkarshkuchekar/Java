package fundamentals;

import java.util.Scanner;

public class Pattern14 {

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
				System.out.print(no);
				no++;
				c++;
			}
			int dec =i-1;
			while(dec>=1) {
				System.out.print(dec);
				dec--;
			}
			System.out.println();
			i++;
		}



	}

}
