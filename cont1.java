import java.util.*;

public class cont1{
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);

        while(true){
            System.out.print("Enter your no");
            int n =sc.nextInt();

            if(n%10 ==0){
                continue;
            }
            System.out.println("number was: " + n);


        }
        
    }
}