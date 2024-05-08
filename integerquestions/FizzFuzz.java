package integerquestions;

public class FizzFuzz {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");

            }
            else if(i%3==0){
                System.err.println("Fizz");
            }
            else if(i%5==0){
                System.err.println("Buzz");
            }
            else{
                System.err.println(i);
            }
        }
    }

}
