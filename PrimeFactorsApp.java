import java.util.Scanner;

public class PrimeFactorsApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        System.out.println("Prime Factors are:");

        // Find and print all prime factors
        for (int i = 2; i <= number; i++)
        {
            while (number % i == 0)
            {
                System.out.println(i);
                number /= i;
            }
        }


    }
}
