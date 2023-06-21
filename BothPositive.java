package fundamentals;

import java.util.Scanner;
public class BothPositive {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc =new Scanner(System.in);
//		int a,b;
//		a=sc.nextInt();
//		b=sc.nextInt();
//		if((a>0)&&(b>0)) {
//			System.out.println("Both are Positive");
//		}
//		else {
//			System.out.println("Both are not Positive ");
//		}
		
		    int a=50,b=20;
		    if(a>b)
		    {
		        if(a>100)
		        	
		          System.out.println("Ace");
		        if(b<100)
		            b=50;
		    }
		    else if(a==b)
		    {
		    	System.out.println("King");
		    }
		    else 
		    {
		    	System.out.println("Queen");
		    }
		}
	}


