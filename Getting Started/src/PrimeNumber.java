import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        boolean isPrime= true;
        if (num<2){
            isPrime = false;
        }else{
            for (int i = 2; i < num; i++) {
                if (num%i ==0){
                    isPrime = false;
                    break;
                }
            }
        }
        String result = isPrime ? "Prime" : "not Prime";
        System.out.println("The number is "+result);
    }
}
