import java.util.*;
public class binToDec {
    public static void binToDec(int binNum){
        int pow = 0;
        int decNum = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            binNum /= 10;
        }
        System.out.println("Binary To Decimal: " + decNum);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary number: ");
        int binNum = sc.nextInt();
        binToDec(binNum);

    }
    
}
