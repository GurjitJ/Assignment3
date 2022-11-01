import java.util.Scanner;

public class Question6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int x, y;
        char answer;

        do
        {
            System.out.print("Enter the first number to add ");
            x = sc.nextInt();

            System.out.print("Enter the second number to add ");
            y = sc.nextInt();

            int sum = x + y;
            System.out.println("The sum of the numbers is numbers: " + sum);

            System.out.print("Do you want to continue? Enter y for yes or n for no. ");
            answer = sc.next().charAt(0);

            System.out.println();

        }while(answer == 'y' || answer == 'Y');
    }
}