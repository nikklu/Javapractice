import java.util.Scanner;

public class Maxprofit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int maxProfit = 0;
        int result = 0;

        int len = Math.min(n1, n2); // to avoid index out of range
        for (int i = 0; i < len; i++) {
            if (arr1[i] < arr2[i]) {
                int profit = arr2[i] - arr1[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                    result = arr1[i]; // store cost price that gave max profit
                }
            }
        }

        System.out.println(result);
        sc.close();
    }
}
