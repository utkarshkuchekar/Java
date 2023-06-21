package fundamentals;
import java.util.Scanner;
public class IsPrimeWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int div=2;
		boolean isprime =true;
		int n=sc.nextInt();
		
		while(div<n/2) {
			if(n%div==0) {
				isprime =false;
			}
			div++;
		}
		if(isprime) {
			System.out.println("Entered no is prime no");
		}else {
			System.out.println(" no is cmposite no");
		}
		

	}

}
