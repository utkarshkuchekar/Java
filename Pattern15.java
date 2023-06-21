package fundamentals;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
		while(i<=n){
			int j=1;	
			while(j<i){

				System.out.print(" ");
				j++;
			}
			int k=1;		
			while(k<=n){				
				
				System.out.print("*");
				k++;
			}


			System.out.println();
			i++;
		}

		
		}
		}



	


