public class EvenOdd {
    public static void main(String arg[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        evenOdd(arr);
    }

    private static void evenOdd(int arr[]) {
        int even = 0, odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0) {
                even += arr[i];
            } else {
                odd += arr[i];
            }

        }
        System.out.print("sum of even : " + even + "\nsum of odd : " + odd);
    }
}
