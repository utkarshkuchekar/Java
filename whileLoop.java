package fundamentals;
import java.util.Scanner;
public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("How Many Times do you want to enter Hello Buddy");
		int i=1;
		int n=sc.nextInt();
		while(i<=n) {
			
			System.out.println("Hello Buddy");
			i++;
		}

	}

}
