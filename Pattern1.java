package fundamentals;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print("*");
//		}
//		System.out.println();
//		}
		
		//using while
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
			System.out.print("*");
			j++;
		}
			System.out.println();
			i++;
	}

}
}