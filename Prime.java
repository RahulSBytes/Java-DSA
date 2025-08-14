import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("prime number from : ");
        int from = sc.nextInt();
        System.out.print("to : ");
        int to = sc.nextInt();
        sc.close();

        if (from <= to) {
            for (int i = from; i < to; i++) {
                if(isPrime(i)!=(-1)){
                    System.out.print(i+" ");
                }
            }
        } else {
            System.out.println("enter value grater than 0");
        }

    }

    private static int isPrime(int num) {
        if (num < 2)
            return -1; 
        for (int k = 2; k * k <= num; k++) { 
            if (num % k == 0) {
                return -1;
            }
        }
        return num;
    }
}