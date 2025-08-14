import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = sc.nextInt();
        System.out.println(factorial(num));
        sc.close();
    }

    private static int factorial(int num) {
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum *= i;
        }
        return sum;
    }
}
