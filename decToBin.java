import java.util.*;
public class decToBin {
    public static void decToBin(int decNum){
        int pow = 0;
        int binNum = 0;

        while(decNum > 0){
            int rem = decNum % 2;
            binNum = binNum +(rem * (int)Math.pow(10,pow));
            pow++;
            decNum /= 2;
        }
        System.out.println("Decimal to binary: " + binNum);

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal Number: ");
        int decNum = sc.nextInt();
        decToBin(decNum);
    }
    
}
