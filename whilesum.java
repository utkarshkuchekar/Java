import java.util.*;
public class whilesum {
    public static void main(String args[]){
        int counter =1;
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int no =sc.nextInt();
        while(counter<=no){

           // System.out.println("Hello World"+counter);
           sum=sum+counter;
            counter++;
        }
        System.out.println(sum);
    
    }
    
}
