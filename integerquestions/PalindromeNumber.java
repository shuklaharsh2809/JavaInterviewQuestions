package integerquestions;
import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int reverseNumber=0;  
        while(num!=0){
            int digit=num%10;
            reverseNumber=reverseNumber*10+digit;
            num/=10;
        }
            if(num==reverseNumber){
                System.out.println("is Palindrome");
            }
            else{
                System.out.println("not palindrome");
            }
        

    }
    
}
