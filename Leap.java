import java.util.Scanner;

public class Leap {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the year : ");
        int year = sc.nextInt();
        sc.close();
        leap(year);
    }

    private static void leap(int year) {
        if (year % 4 == 0 && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("its leap year");
        } else {
            System.out.println("not a leap year.");
        }
    }
}