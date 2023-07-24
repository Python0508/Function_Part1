import java.util.*;
public class product {
    public static int product(int num1, int num2){
        
        int product = num1 * num2;
        System.out.println("Product of num1 & num2: " + product);
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = sc.nextInt();
        int product = product(num1 , num2);
    }
    
}
