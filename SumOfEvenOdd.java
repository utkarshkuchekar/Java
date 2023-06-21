package fundamentals;
import java.util.Scanner;
public class SumOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();//12345
		int Esum=0,Osum=0;
		while(n>0){
		int digit= n%10;
		
		if(digit%2==0){
			Esum =Esum+digit;
		}
		else{
			Osum=Osum+digit;
		}
		n=n/10;
		}
		System.out.println(Esum+" "+Osum );


}
}
