package pratice_set;
import java.util.*;
public class averageOfThree {
    public static int averageOfThree(int num1, int num2, int num3){
        int average = (num1 + num2 + num3) / 3;
        System.out.println("Average of three number: " + average);
        return average;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the number3: ");
        int num3 = sc.nextInt();
        averageOfThree(num1, num2, num3);
    }
    
}
