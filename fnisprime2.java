public class fnisprime2 {
    public static boolean isprime(int n) {
        boolean isprime =true;
        if(n ==2){
            return true;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n % i==0){//completly dividing
                isprime = false;
                return isprime;
            }
        }
            return isprime; 
        
    }
    public static void main(String args[]) {
        System.out.println(isprime(7));
    }
    
}
