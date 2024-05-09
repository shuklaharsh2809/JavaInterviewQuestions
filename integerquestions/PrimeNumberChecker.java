package integerquestions;
import java.util.*;
public class PrimeNumberChecker {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number");
     int number=sc.nextInt();

     if(isPrime(number)){
        System.out.println("Number is prime"+number);
     }
     else{
        System.out.println("Number is not prime"+number);
     }
    sc.close();
  
    }
    public static boolean isPrime(int number){
        if(number<=1){
            return false;


        }
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i == 0){
                return false;

            }
            
        }
        return true;
    }
    
}
