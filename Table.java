import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = sc.nextInt();
        table(num);
        sc.close();
    }

    public static void table(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + "=" + num * i);
        }
    }
}
