package pratice_set;
import java.util.*;
public class sumOfInteger {
    public static void main(String arga[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer: ");
        int num = sc.nextInt();
        System.out.println("Sum of Integer: " + sumOfInteger(num));
    }

    public static int sumOfInteger(int num){
        int sum = 0;
        while(num > 0){
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num /= 10;
        }
        return sum;

    }
    
}
