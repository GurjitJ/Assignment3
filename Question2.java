import java.util.Scanner;
public class Question2 {
    public static void main(String[] args){
        int i, factorial=1, number;
        System.out.println("Enter the number you need the factorial of:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        for(i = 1; i<=number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of your number is:: "+factorial);
    }
}