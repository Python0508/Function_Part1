import java.util.*;
public class factorial {
    public static int factorial(int num){
        int factorial = 1;

        for(int i=1; i<=num; i++){
            factorial *= i;
        }
        System.out.println("Factorial of a Number: " + factorial );
        return factorial;
    }


    public static int bin_Cofficiant(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int bin_coff = n_fact/(r_fact * nmr_fact);
        System.out.println("Binomial Cofficiant of given number is: " + bin_coff);
        return bin_coff;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r:");
        int r = sc.nextInt();
        
        int fact = bin_Cofficiant(n,r);

    }
    
}
