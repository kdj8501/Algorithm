import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < n - 1; i++) {
            int sum = 0;
            int lastX = x[0];
            int lastY = y[0];
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                sum += Math.abs(x[j] - lastX) + Math.abs(y[j] - lastY);
                lastX = x[j];
                lastY = y[j];
            }
            min = Math.min(min, sum);
        }
        System.out.println(min);
    }
}