package fundamentals;
import java.util.Scanner;
public class SumOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no to print sum from 1");
		int i=1;
		int sum =0;
		int n=sc.nextInt();
		while(i<=n) {
			sum = sum +i;
			
			i++;
		}
		System.out.println(sum);

	}

}
