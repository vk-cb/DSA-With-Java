import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = in.nextInt();
        primeFactors(n);
    }
    public static void primeFactors(int n)
   {

      for(int i = 2; i<= n; i++){
          if(isprime(i)==1){
             int x = n;
             while(x%i==0){
                System.out.print(i + " ");
                x /= i;
             }
          }
       }

   }


    public static int isprime(int n){
        if(n==2){
            return 1;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
          if(n%i==0)
            return 0;
        }
  
        return 1;
     }
}
