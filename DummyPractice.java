import java.util.Scanner;
public class DummyPractice {
    public static void main(String[] args) {
        // Write your code here
    	
    		// Write your code here
    	
    	Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int n=1;
		int s=0;
		
		for(int i=1;i<=x;i++){
			while(n<=x){
				 s=3*n+2;
				if(s%4!=0){
					System.out.print(s+" ");
					n++;
				}


			}
		}

    }
}