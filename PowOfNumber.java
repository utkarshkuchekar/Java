package fundamentals;
import java.util.Scanner;
public class PowOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();
	        int temp = 1;
	        int n = sc.nextInt();

	        while (n != 0) {
	            temp = temp * x;
	            n--;
	        }

	        System.out.println(temp);

	}

}
