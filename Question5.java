import java.util.Scanner;
public class Question5
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the amount of even numbers to sum: ");
        int n = sc.nextInt();

        int sum=0, num = 1, count=0;

        while(count<n){

            if(num%2 == 0){
                sum += num;
                count++;
            }
            num++;
        }

        System.out.println("The sum is: "+sum);
    }
}