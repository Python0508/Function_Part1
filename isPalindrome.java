package pratice_set;
import java.util.*;
public class isPalindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int palindrome = sc.nextInt();
        System.out.println(isPalindrome(palindrome));

    }

    public static boolean isPalindrome(int palindrome){
        int number = palindrome;
        int rev = 0;

        while(palindrome > 0){
            int lastDigit = palindrome % 10;
            rev = (rev * 10) + lastDigit;
            palindrome /= 10;
        }

        if(rev == number){
            System.out.println("Number is Palindrome");
            return true;
        }
        else{
            System.out.println("Number is not Palindrome");
            return false;
        }
    }
    
}
